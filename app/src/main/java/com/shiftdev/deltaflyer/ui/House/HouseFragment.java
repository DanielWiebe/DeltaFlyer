package com.shiftdev.deltaflyer.ui.House;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.shiftdev.deltaflyer.R;

public class HouseFragment extends Fragment {

     private HouseViewModel houseViewModel;

     public View onCreateView(@NonNull LayoutInflater inflater,
                              ViewGroup container, Bundle savedInstanceState) {
          houseViewModel =
                  ViewModelProviders.of(this).get(HouseViewModel.class);
          View root = inflater.inflate(R.layout.fragment_house_overview, container, false);
          final TextView textView = root.findViewById(R.id.text_house);
          houseViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
               @Override
               public void onChanged(@Nullable String s) {
                    textView.setText(s);
               }
          });
          return root;
     }
}
