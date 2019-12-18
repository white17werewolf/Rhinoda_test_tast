package com.rhinoda.marina.rhinoda_test_tast.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.rhinoda.marina.rhinoda_test_tast.IEvenView;
import com.rhinoda.marina.rhinoda_test_tast.Presenter.EventPresenter;
import com.rhinoda.marina.rhinoda_test_tast.R;
import com.rhinoda.marina.rhinoda_test_tast.model.Post;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EventFragment extends Fragment implements IEvenView {
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragmant_event, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        EventPresenter eventPresenter = new EventPresenter();
        eventPresenter.onPost();
        recyclerView.setAdapter(eventPresenter.onPost());

    }


    @Override
    public void postIt(List<Post> items) {
        Log.d("postIt","2");

    }
}
