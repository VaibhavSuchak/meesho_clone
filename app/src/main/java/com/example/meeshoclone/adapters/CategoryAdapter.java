package com.example.meeshoclone.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.meeshoclone.R;
import com.example.meeshoclone.models.Category;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    // List to store category data
    private List<Category> categoryList;

    // Constructor
    public CategoryAdapter(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        // Inflate the category layout
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_category, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        // Get current category
        Category category = categoryList.get(position);

        // Set category name
        holder.catName.setText(category.getName());

        // Load image using Glide
        Glide.with(holder.itemView.getContext())
                .load(category.getImageUrl())
                .placeholder(R.color.grey_light)
                .into(holder.catImage);
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    // ViewHolder class
    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView catImage;
        TextView catName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            // Connect XML views with Java
            catImage = itemView.findViewById(R.id.cat_image);
            catName = itemView.findViewById(R.id.cat_name);
        }
    }
}