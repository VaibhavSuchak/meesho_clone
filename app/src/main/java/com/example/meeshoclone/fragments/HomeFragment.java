package com.example.meeshoclone.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import com.example.meeshoclone.R;
import com.example.meeshoclone.adapters.BannerAdapter;
import com.example.meeshoclone.adapters.CategoryAdapter;
import com.example.meeshoclone.adapters.ProductAdapter;
import com.example.meeshoclone.models.Category;
import com.example.meeshoclone.models.Product;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Banner Slider
        ViewPager2 bannerSlider = view.findViewById(R.id.bannerSlider);

        List<String> bannerList = new ArrayList<>();

        bannerList.add("https://images.unsplash.com/photo-1607083206968-13611e3d76db");
        bannerList.add("https://images.unsplash.com/photo-1607082350899-7e105aa886ae");
        bannerList.add("https://images.unsplash.com/photo-1607082349566-187342175e2f");

        BannerAdapter bannerAdapter = new BannerAdapter(bannerList);

        bannerSlider.setAdapter(bannerAdapter);


        // Top Categories
        RecyclerView rvCategories = view.findViewById(R.id.rv_categories);

        List<Category> categoryList = new ArrayList<>();

        categoryList.add(new Category(
                "Fashion",
                "https://images.unsplash.com/photo-1521572163474-6864f9cf17ab"
        ));

        categoryList.add(new Category(
                "Electronics",
                "https://images.unsplash.com/photo-1511707171634-5f897ff02aa9"
        ));

        categoryList.add(new Category(
                "Beauty",
                "https://images.unsplash.com/photo-1522335789203-aabd1fc54bc9"
        ));

        categoryList.add(new Category(
                "Shoes",
                "https://images.unsplash.com/photo-1542291026-7eec264c27ff"
        ));

        categoryList.add(new Category(
                "Home",
                "https://images.unsplash.com/photo-1505691938895-1758d7feb511"
        ));

        categoryList.add(new Category(
                "Watches",
                "https://images.unsplash.com/photo-1524592094714-0f0654e20314"
        ));

        categoryList.add(new Category(
                "Jewelry",
                "https://images.unsplash.com/photo-1515562141207-7a88fb7ce338"
        ));

        CategoryAdapter categoryAdapter = new CategoryAdapter(categoryList);

        rvCategories.setLayoutManager(
                new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false)
        );

        rvCategories.setAdapter(categoryAdapter);


        // Product RecyclerView
        RecyclerView productRecycler = view.findViewById(R.id.productRecycler);

        List<Product> productList = new ArrayList<>();

        productList.add(new Product(
                "Women Stylish Kurti",
                "₹299",
                "https://images.unsplash.com/photo-1588117260148-b47818741c74"
        ));

        productList.add(new Product(
                "Men Casual Shirt",
                "₹399",
                "https://images.unsplash.com/photo-1602810318383-e386cc2a3ccf"
        ));

        productList.add(new Product(
                "Fashion Handbag",
                "₹499",
                "https://images.unsplash.com/photo-1590874103328-eac38a683ce7"
        ));

        productList.add(new Product(
                "Sports Shoes",
                "₹799",
                "https://images.unsplash.com/photo-1542291026-7eec264c27ff"
        ));

        productList.add(new Product(
                "Smart Watch",
                "₹1299",
                "https://images.unsplash.com/photo-1523275335684-37898b6baf30"
        ));

        productList.add(new Product(
                "Sun Glasses",
                "₹199",
                "https://images.unsplash.com/photo-1572635196237-14b3f281503f"
        ));

        productList.add(new Product(
                "Leather Wallet",
                "₹249",
                "https://images.unsplash.com/photo-1627123424574-724758594e93"
        ));

        ProductAdapter productAdapter = new ProductAdapter(productList);

        productRecycler.setLayoutManager(new GridLayoutManager(getContext(), 2));

        productRecycler.setAdapter(productAdapter);


        // Search Bar click listener
        View searchBar = view.findViewById(R.id.search_bar);
        searchBar.setOnClickListener(v -> {
            androidx.appcompat.app.AlertDialog.Builder builder = new androidx.appcompat.app.AlertDialog.Builder(getContext());
            builder.setTitle("Search");
            builder.setMessage("The real search feature is not implemented in this demo, but this is where it would be!");
            builder.setPositiveButton("OK", null);
            builder.show();
        });

        return view;
    }
}