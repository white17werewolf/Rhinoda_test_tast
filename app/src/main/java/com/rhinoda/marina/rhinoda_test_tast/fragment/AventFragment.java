package com.rhinoda.marina.rhinoda_test_tast.fragment;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.rhinoda.marina.rhinoda_test_tast.AventAdapter;
import com.rhinoda.marina.rhinoda_test_tast.R;
import com.rhinoda.marina.rhinoda_test_tast.RecycleItem;

import java.util.ArrayList;
import java.util.List;

public class AventFragment extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.ViewHolder holder;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.avent, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerView);
        AventAdapter aventAdapter = new AventAdapter();
        recyclerView.setAdapter(aventAdapter);
        aventAdapter.addAll(getData());
        aventAdapter.setItems(getData());
        }

    Drawable tmp =  new Drawable() {
        @Override
        public void draw(@NonNull Canvas canvas) {

        }

        @Override
        public void setAlpha(int alpha) {

        }

        @Override
        public void setColorFilter(@Nullable ColorFilter colorFilter) {

        }

        @Override
        public int getOpacity() {
            return 0;
        }
    };


    public  List<RecycleItem> getData(){
        List<RecycleItem> data = new ArrayList<>();

        data.add(new RecycleItem(
                "Adam",
                "Anderson",
                "qwertyu",
                "Theo, Pette, Chenai",
                100,
                20,
                65,
                tmp,
                tmp));
        data.add(new RecycleItem(
                "Theo",
                "Hutchcraft",
                "qwertyu",
                "Russian girls",
                150,
                10,
                70,
                tmp,
                tmp));
        data.add(new RecycleItem(
                "",
                "",
                "",
                "",
                0,
                0,
                0,
                tmp,
                tmp));
        return data;


    }

}
