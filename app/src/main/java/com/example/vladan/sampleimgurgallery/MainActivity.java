package com.example.vladan.sampleimgurgallery;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.vladan.sampleimgurgallery.databinding.ActivityMainBinding;
import com.example.vladan.sampleimgurgallery.fragment.AboutFragment;
import com.example.vladan.sampleimgurgallery.fragment.gallery.GalleryFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

//import butterknife.BindView;

import static com.example.vladan.sampleimgurgallery.fragment.gallery.GalleryFragment.HOT_SECTION;
import static com.example.vladan.sampleimgurgallery.fragment.gallery.GalleryFragment.TOP_SECTION;
import static com.example.vladan.sampleimgurgallery.fragment.gallery.GalleryFragment.USER_SECTION;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

//    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
//        setContentView(R.layout.activity_main);
        setSupportActionBar(toolbar);
        BottomNavigationView navigation = findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedSection = null;
                switch (item.getItemId()) {
                    case R.id.navigation_hot:
                        selectedSection = GalleryFragment.newInstance(HOT_SECTION);
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.list_frame, selectedSection)
                                .commit();
                        break;
                    case R.id.navigation_top:
                        selectedSection = GalleryFragment.newInstance(TOP_SECTION);
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.list_frame, selectedSection)
                                .commit();
                        break;
                    case R.id.navigation_user:
                        selectedSection = GalleryFragment.newInstance(USER_SECTION);
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.list_frame, selectedSection)
                                .commit();

                        break;
                    case R.id.navigation_about:
                        selectedSection = AboutFragment.newInstance();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.list_frame, selectedSection)
                                .commit();
                }
                return true;
            }
        });


        navigation.setItemIconTintList(null);

        if (savedInstanceState == null) {
            navigation.setSelectedItemId(R.id.navigation_hot);
        }
    }

}
