package com.rhinoda.marina.rhinoda_test_tast.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.rhinoda.marina.rhinoda_test_tast.EventAdapter;
import com.rhinoda.marina.rhinoda_test_tast.IActionView;
import com.rhinoda.marina.rhinoda_test_tast.IEvenView;
import com.rhinoda.marina.rhinoda_test_tast.Presenter.EventPresenter;
import com.rhinoda.marina.rhinoda_test_tast.R;
import com.rhinoda.marina.rhinoda_test_tast.model.Post;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EventFragment extends Fragment implements IEvenView, IActionView {
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    EventAdapter eventAdapter;
    EventPresenter presenter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragmant_event, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        eventAdapter = new EventAdapter();
        eventAdapter.setOnClickCallback(this);
        recyclerView.setAdapter(eventAdapter);
        presenter = new EventPresenter(this);
        presenter.getData();


    }

    @Override
    public void postIt(List<Post> items) {
        Log.d("postIt","2");
    }

    @Override
    public void update(List<Post> items) {
        eventAdapter.update(items);
    }

    ///////////////////////////
    @Override
    public void like(int likeNumber) {
        Toast.makeText(getContext(), "You have "+likeNumber+" likes", Toast.LENGTH_SHORT).show();
        //actionAdapter.like(likeNumber);
    }

    @Override
    public void comment(int commentNumber) {
        //actionAdapter.comment(commentNumber);
        Toast.makeText(getContext(), "You Press Comment", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void share(int shareNumber){
        //actionAdapter.share(shareNumber);
        Toast.makeText(getContext(), "You Press Share", Toast.LENGTH_SHORT).show();
    }
}