package com.rhinoda.marina.rhinoda_test_tast;

import android.widget.ImageView;
import android.widget.TextView;

public class RecycleItem {

    TextView txtName;
    TextView txtData;
    TextView txtPost;
    TextView txtLikers;
    TextView txtLikes;
    TextView txtComments;
    ImageView avatar;
    ImageView imgPost;
    ImageView imgLikers;
    ImageView imgLike;
    ImageView imgComment;
    ImageView imgShare;



    public RecycleItem(TextView txtName, TextView txtData) {
        this.txtName = txtName;
        this.txtData = txtData;
    }

    public String getTitle() {
        return String.valueOf(txtName.getText());
    }

    public void setTitle(String title) {
        this.txtName = txtName;
    }

    public String getDescription() {
        return String.valueOf(txtData);
    }

    public void setDescription(String description) {
        this.txtData = txtData;
    }
}