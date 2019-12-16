package com.rhinoda.marina.rhinoda_test_tast.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.rhinoda.marina.rhinoda_test_tast.EventAdapter;
import com.rhinoda.marina.rhinoda_test_tast.R;
import com.rhinoda.marina.rhinoda_test_tast.model.Post;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EventFragment extends Fragment {
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    int imageRes = R.drawable.bg_post_event;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragmant_event, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
        EventAdapter eventAdapter = new EventAdapter();
        recyclerView.setAdapter(eventAdapter);
        eventAdapter.addAll(getData());
        eventAdapter.setItems(getData());
    }

    public  List<Post> getData(){
        List<Post> data = new ArrayList<>();

        data.add(new Post(
                "Adam Anderson",
                "Yesterday 9:20 p.m.",
                "Here we are again!",
                "Theo, Pette, Chenai",
                100,
                20,
                65,
                R.drawable.adam,
                R.drawable.mcw));
        data.add(new Post(
                "Theo Hutchcraft",
                "Today 8:20 a.m.",
                "Regular Monday",
                "Russian girls",
                150,
                10,
                70,
                R.drawable.theo,
                R.drawable.pub));
        data.add(new Post(
                "Name Surname",
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
