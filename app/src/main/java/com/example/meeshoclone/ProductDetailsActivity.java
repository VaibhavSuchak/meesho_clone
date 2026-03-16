package com.example.meeshoclone;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class ProductDetailsActivity extends AppCompatActivity {

    ImageView detailImage;
    TextView detailName, detailPrice;
    Button buyNowBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        // Initialize views
        detailImage = findViewById(R.id.detailImage);
        detailName = findViewById(R.id.detailName);
        detailPrice = findViewById(R.id.detailPrice);
        buyNowBtn = findViewById(R.id.buyNowBtn);

        // Get data from intent
        String name = getIntent().getStringExtra("name");
        String price = getIntent().getStringExtra("price");
        String image = getIntent().getStringExtra("image");

        // Set product data
        detailName.setText(name);
        detailPrice.setText(price);

        // Load product image using Glide
        Glide.with(this)
                .load(image)
                .into(detailImage);

        // Buy Now button click
        buyNowBtn.setOnClickListener(v -> {

            Toast.makeText(
                    ProductDetailsActivity.this,
                    "Order Placed Successfully!",
                    Toast.LENGTH_LONG
            ).show();

        });
    }
}