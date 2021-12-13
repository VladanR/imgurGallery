package com.example.vladan.sampleimgurgallery.adapter;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.vladan.sampleimgurgallery.ImageActivity;
import com.example.vladan.sampleimgurgallery.R;
import com.example.vladan.sampleimgurgallery.databinding.ItemGalleryImageBinding;
import com.example.vladan.sampleimgurgallery.datamodel.GalleryImageDataModel;

import java.util.List;

//import butterknife.BindView;
//import butterknife.ButterKnife;

public class GalleryListAdapter extends RecyclerView.Adapter<GalleryListAdapter.ImageViewHolder> {

    private List<GalleryImageDataModel> galleryImages;
    private int rowLayout;
    public static class ImageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private ItemGalleryImageBinding binding;
         ImageView galleryImage;
         TextView imageDescription;

        private ImageClickListener imageClickListener;

        public ImageViewHolder(ItemGalleryImageBinding itemGalleryImageBinding) {
            super(itemGalleryImageBinding.getRoot());
            this.binding = itemGalleryImageBinding;
            itemView.setOnClickListener(this);
        }
//        public void bind(ItemGalleryImageBinding item) {
//            binding.setItem(item);
//            binding.executePendingBindings();
//        }
        public void setImageClickListener(ImageClickListener imageClickListener) {
            this.imageClickListener = imageClickListener;
        }

        @Override
        public void onClick(View view) {
            imageClickListener.onClick(view);
        }
    }

    public GalleryListAdapter(List<GalleryImageDataModel> galleryImages) {

        this.galleryImages = galleryImages;
    }

    public void setGalleryImages(List<GalleryImageDataModel> galleryImages) {
        this.galleryImages = galleryImages;
        notifyDataSetChanged();
    }

    public void setRowLayout(int rowLayout) {
        this.rowLayout = rowLayout;
        notifyDataSetChanged();
    }

    @Override
    public GalleryListAdapter.ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemGalleryImageBinding itemBinding =
                ItemGalleryImageBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
//        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);
        return new GalleryListAdapter.ImageViewHolder(itemBinding);
    }

    @Override
    public void onBindViewHolder(GalleryListAdapter.ImageViewHolder holder, int position) {
        holder.binding.imageDescription.setText(galleryImages.get(position).getDescription());
        Glide.with(holder.itemView)
                .load(galleryImages.get(position).getImage())
                .into(holder.binding.galleryImage);
        holder.setImageClickListener(new ImageClickListener() {
            @Override
            public void onClick(View view) {
                Activity context = (Activity) view.getContext();
                Intent intent = new Intent(context, ImageActivity.class );
                intent.putExtra("image", galleryImages.get(position).getImage());
                intent.putExtra("title", galleryImages.get(position).getTitle());
                intent.putExtra("upVotes", String.format("%d", galleryImages.get(position).getUpVotes()));
                intent.putExtra("downVotes", String.format("%d", galleryImages.get(position).getDownVotes()));
                intent.putExtra("description", galleryImages.get(position).getDescription());
                intent.putExtra("score", String.format("%d", galleryImages.get(position).getScore()));
                context.startActivityForResult(intent, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (galleryImages == null) {
            return 0;
        }
        return galleryImages.size();
    }
}
