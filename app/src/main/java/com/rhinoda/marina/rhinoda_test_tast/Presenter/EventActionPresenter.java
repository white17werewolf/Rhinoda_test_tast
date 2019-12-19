package com.rhinoda.marina.rhinoda_test_tast.Presenter;

import com.rhinoda.marina.rhinoda_test_tast.IActionView;

public class EventActionPresenter implements IEventActionPresenter {

    private IActionView evenView;

    public EventActionPresenter(IActionView evenView) {this.evenView = evenView;}




    @Override
    public void getLike(int likeNumber) {
        evenView.like(likeNumber++);
    }

    @Override
    public void getComment(int commentNumber) {
        evenView.comment(commentNumber++);
    }

    @Override
    public void getShare(int shareNumber) {
        evenView.share(shareNumber++);
    }
}
