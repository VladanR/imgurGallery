package com.example.vladan.sampleimgurgallery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.vladan.sampleimgurgallery.databinding.ActivityImageBinding;
import com.example.vladan.sampleimgurgallery.databinding.ActivityMainBinding;
//
//import butterknife.BindString;
//import butterknife.BindView;
//import butterknife.ButterKnife;

public class ImageActivity extends AppCompatActivity {
    private ActivityImageBinding binding;
     ImageView bigImage;
    TextView imageDescription;
    TextView imageTitle;
     TextView ups;
     TextView downs;
     TextView score;
    String upVotesPrefix;
     String downVotesPrefix;
    String scorePrefix;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityImageBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
//        ButterKnife.bind(this);
        Intent intent = getIntent();
        binding.title.setText(intent.getStringExtra("title"));
        binding.description.setText(intent.getStringExtra("description"));
        binding.upVotes.setText(String.format("%s %s", upVotesPrefix, intent.getStringExtra("upVotes")));
        binding.downVotes.setText(String.format("%s %s", downVotesPrefix, intent.getStringExtra("downVotes")));
        binding.score.setText(String.format("%s %s", scorePrefix, intent.getStringExtra("score")));
        Glide.with(this)
                .load(intent.getStringExtra("image"))
                .into(binding.bigImage);
    }
}
