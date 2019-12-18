package com.rhinoda.marina.rhinoda_test_tast.Presenter;

import com.rhinoda.marina.rhinoda_test_tast.EventAdapter;
import com.rhinoda.marina.rhinoda_test_tast.model.Post;

import java.util.List;

public interface IEventPresenter {
    EventAdapter onPost();
    List<Post> getData();

}
