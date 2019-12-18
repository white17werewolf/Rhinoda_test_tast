package com.rhinoda.marina.rhinoda_test_tast.Presenter;

import com.rhinoda.marina.rhinoda_test_tast.EventAdapter;
import com.rhinoda.marina.rhinoda_test_tast.R;
import com.rhinoda.marina.rhinoda_test_tast.model.Post;

import java.util.ArrayList;
import java.util.List;

public class EventPresenter implements IEventPresenter {

    public EventAdapter onPost() {
        EventAdapter eventAdapter = new EventAdapter();
        eventAdapter.addAll(getData());
        eventAdapter.setItems(getData());

        return eventAdapter;
    }

    public List<Post> getData() {
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
                R.drawable.bg_post_event,
                R.drawable.bg_post_event));
        return data;
    }
}
