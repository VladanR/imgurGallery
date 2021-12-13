package com.example.vladan.sampleimgurgallery.fragment;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.vladan.sampleimgurgallery.R;
import com.example.vladan.sampleimgurgallery.databinding.FragmentAboutBinding;

//import butterknife.BindString;
//import butterknife.BindView;
//import butterknife.ButterKnife;

public class AboutFragment extends Fragment {

    TextView appVersion;
     String appVersionPrefix;
     private FragmentAboutBinding binding;

    public static AboutFragment newInstance() {
        return new AboutFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentAboutBinding.inflate(inflater,container,false);
        View view = binding.getRoot();
//        ButterKnife.bind(this, view);
        renderAppVersion();
        return view;
    }

    private void renderAppVersion() {
        try {
            PackageInfo pInfo = getActivity().getPackageManager().getPackageInfo(getActivity().getPackageName(), 0);
            String version = pInfo.versionName;
            int buildNumber = pInfo.versionCode;
            binding.appVersion.setText(String.format("%s : %s - %d", appVersionPrefix, version, buildNumber));
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }

}
