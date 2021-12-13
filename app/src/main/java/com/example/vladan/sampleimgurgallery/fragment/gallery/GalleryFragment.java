package com.example.vladan.sampleimgurgallery.fragment.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.example.vladan.sampleimgurgallery.R;
import com.example.vladan.sampleimgurgallery.adapter.GalleryListAdapter;
import com.example.vladan.sampleimgurgallery.databinding.FragmentGalleryBinding;
import com.example.vladan.sampleimgurgallery.datamodel.GalleryImageDataModel;

import java.util.List;


import static com.example.vladan.sampleimgurgallery.fragment.gallery.GallerySectionPresenter.EXTRA_TYPE;
import static com.example.vladan.sampleimgurgallery.fragment.gallery.GallerySectionPresenter.EXTRA_VIRAL;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public class GalleryFragment extends Fragment implements GallerySectionContract.View {

    public static final String EXTRA_LAYOUT_MANAGER_TYPE = "EXTRA_LAYOUT_MANAGER_TYPE";
    public static final int HOT_SECTION = 0;
    public static final int TOP_SECTION = 1;
    public static final int USER_SECTION = 2;

    private static final int GRID_LAYOUT = 3;
    private static final int LINEAR_LAYOUT = 4;
    private static final int STAGGERED_LAYOUT = 5;

    private GallerySectionContract.Presenter presenter;
    private GalleryListAdapter adapter;
    private int layoutManagerType;
    private FragmentGalleryBinding binding;


     String errorPrefix;

    public static GalleryFragment newInstance(int type) {
        GalleryFragment fragment = new GalleryFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(EXTRA_TYPE, type);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentGalleryBinding.inflate(inflater, container, false);
        View view = binding.getRoot();
        showImages(null);

        Bundle bundle = savedInstanceState == null ? getArguments() : savedInstanceState;
        assert bundle != null;
        setGridLayoutManager();
        layoutManagerType = bundle.getInt(EXTRA_LAYOUT_MANAGER_TYPE, GRID_LAYOUT);
        binding.grid.setOnClickListener(v -> setGridLayoutManager());
        binding.staggeredGridView.setOnClickListener(v->setStaggeredLayoutManager());
        binding.listView.setOnClickListener(v -> setLinearLayoutManager());

        presenter = new GallerySectionPresenter();
        presenter.setView(this);

        int type = bundle.getInt(EXTRA_TYPE);
        if (type == USER_SECTION) {
            binding.viralImagesToggle.setVisibility(View.VISIBLE);
            binding.sortSpinner.setVisibility(View.VISIBLE);
            setSortSpinnerAdapter();
            setOnSortTypeSelected();
        } else if (type == TOP_SECTION) {
            binding.windowSpinner.setVisibility(View.VISIBLE);
            setWidowSpinnerAdapter();
            setOnWindowTypeSelected();
        }

        boolean showViral = bundle.getBoolean(EXTRA_VIRAL, true);
        presenter.setData(type, showViral);
        return view;
    }
    public void setWidowSpinnerAdapter() {
        ArrayAdapter<CharSequence> spinnerAdapter = ArrayAdapter.createFromResource(this.getContext(),
                R.array.window_spinner_items, android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.windowSpinner.setAdapter(spinnerAdapter);
    }

    public void setSortSpinnerAdapter() {
        ArrayAdapter<CharSequence> spinnerAdapter = ArrayAdapter.createFromResource(this.getContext(),
                R.array.sort_spinner_items, android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.sortSpinner.setAdapter(spinnerAdapter);
    }

    public void setOnSortTypeSelected() {
        binding.sortSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedSort = parent.getItemAtPosition(position).toString();
                switch (selectedSort) {
                    case "Top":
                        presenter.getSortTop();
                        break;
                    case "Rising":
                        presenter.getSortRising();
                        break;
                    case "Time":
                        presenter.getSortTime();
                        break;
                    default:
                        presenter.getSortViral();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    public void setOnWindowTypeSelected() {
        binding.windowSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedWindow = parent.getItemAtPosition(position).toString();
                switch (selectedWindow) {
                    case "Week":
                        presenter.getWindowWeek();
                        break;
                    case "Month":
                        presenter.getWindowMonth();
                        break;
                    case "Year":
                        presenter.getWindowYear();
                        break;
                    case "All":
                        presenter.getWindowAll();
                        break;
                    default:
                        presenter.getWindowDay();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    private void setGridLayoutManager() {
        int numberOfColumns = 3;
        binding.gallery.setLayoutManager(new GridLayoutManager(getActivity(), numberOfColumns));
        adapter.setRowLayout(R.layout.item_gallery_image);
        this.layoutManagerType = GRID_LAYOUT;
    }

    private void setLinearLayoutManager() {
        binding.gallery.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter.setRowLayout(R.layout.item_gallery_image_linear);
        this.layoutManagerType = LINEAR_LAYOUT;
    }

    private void setStaggeredLayoutManager() {
        int numberOfColumns = 3;
        binding.gallery.setLayoutManager(new StaggeredGridLayoutManager(numberOfColumns, StaggeredGridLayoutManager.VERTICAL));
        adapter.setRowLayout(R.layout.item_gallery_image_staggered);
        this.layoutManagerType = STAGGERED_LAYOUT;
    }

    @Override
    public void showImages(List<GalleryImageDataModel> galleryImages) {
       if (adapter == null) {
            adapter = new GalleryListAdapter(galleryImages);
           binding.gallery.setAdapter(adapter);
        } else {
           adapter.setGalleryImages(galleryImages);
       }
    }

    @Override
    public void showNoInternetConnection() {
        Toast.makeText(getActivity(), R.string.no_internet_connection_error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showError(String error) {
        Toast.makeText(getActivity(), String.format("%s %s", errorPrefix, error), Toast.LENGTH_LONG).show();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        presenter.saveInstanceState(outState);
        outState.putInt(EXTRA_LAYOUT_MANAGER_TYPE, layoutManagerType);
    }
}
