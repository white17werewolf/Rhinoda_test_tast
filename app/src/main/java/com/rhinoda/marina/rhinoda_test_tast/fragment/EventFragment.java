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
                "Adam",
                "Anderson",
                "qwertyu",
                "Theo, Pette, Chenai",
                100,
                20,
                65,
                imageRes,
                imageRes));
        data.add(new Post(
                "Theo",
                "Hutchcraft",
                "qwertyu",
                "Russian girls",
                150,
                10,
                70,
                imageRes,
                imageRes));
        data.add(new Post(
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
