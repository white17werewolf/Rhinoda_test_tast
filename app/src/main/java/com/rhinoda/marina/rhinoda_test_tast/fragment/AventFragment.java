package com.rhinoda.marina.rhinoda_test_tast.fragment;

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

    int imageRes = R.drawable.bg_post_event;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragmant_avent, container, false);
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
                imageRes,
                imageRes));
        data.add(new RecycleItem(
                "Theo",
                "Hutchcraft",
                "qwertyu",
                "Russian girls",
                150,
                10,
                70,
                imageRes,
                imageRes));
        data.add(new RecycleItem(
                "Name",
                "data",
                "Post",
                "Peoples",
                0,
                0,
                0,
                imageRes,
                imageRes));
        return data;


    }

}
