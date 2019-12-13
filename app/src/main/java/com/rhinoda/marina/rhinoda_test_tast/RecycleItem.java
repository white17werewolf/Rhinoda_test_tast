package com.rhinoda.marina.rhinoda_test_tast;

import android.graphics.drawable.Drawable;

public class RecycleItem {

    String txtName;
    String txtData;
    String txtPost;
    String txtLikers;
    int txtLikes;
    int txtComments;
    int txtShare;
    Drawable URLimgAvatar;
    Drawable URLimgPost;


    public RecycleItem(String txtName,
                       String txtData,
                       String txtPost,
                       String txtLikers,
                       int txtLikes,
                       int txtComments,
                       int txtShare,
                       Drawable URLimgAvatar,
                       Drawable URLimgPost) {
        this.txtName = txtName;
        this.txtData = txtData;
        this.txtPost = txtPost;
        this.txtLikers = txtLikers;
        this.txtLikes = txtLikes;
        this.txtComments = txtComments;
        this.txtShare = txtShare;
        this.URLimgAvatar = URLimgAvatar;
        this.URLimgPost = URLimgPost;
    }

    public String getTxtName() {return txtName;}

    public String getTxtData() {return txtData;}
    public void setTxtData(String data) {txtData = data;}

    public String getTxtPost() {return txtPost;}
   public void setTxtPost(String post) {txtPost=post;}

    public String getTxtLikers() {return txtLikers;}
    public void setTxtLikers(String likers) {txtLikers=likers;}

    public String getTxtLikes() {return String.valueOf(txtLikes);}
    public void setTxtLikes(int likes) {txtLikes=likes;}

    public String getTxtComments() {return String.valueOf(txtComments);}
    public void setTxtComments(int comments) { txtComments = comments;}

    public String getTxtShare() {return String.valueOf(txtShare);}
    public void setTxtShare(int share) {txtLikes=share;}

    public Drawable getURLimgAvatar() {return URLimgAvatar;}
    public void setImgAvatar(Drawable avatar) {URLimgAvatar = avatar;}

    public Drawable getURLimgPost() {return URLimgPost;}
    public void setImgPost(Drawable post) {URLimgPost=post;}


}