package com.example.meeshoclone.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.meeshoclone.R;

public class CategoriesFragment extends Fragment {

    public CategoriesFragment() {
        // Required empty constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate categories layout
        View view = inflater.inflate(R.layout.fragment_categories, container, false);

        return view;
    }
}