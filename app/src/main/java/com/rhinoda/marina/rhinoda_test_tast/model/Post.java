package com.rhinoda.marina.rhinoda_test_tast.model;

public class Post implements IPost{

    private String txtName;
    private String txtData;
    private String txtPost;
    private String txtLikers;
    private int txtLikes;
    private int txtComments;
    private int txtShare;
    private int imgAvatar;
    private int imgPost;
    public boolean isLike = false;

    public Post(String txtName,
                String txtData,
                String txtPost,
                String txtLikers,
                int txtLikes,
                int txtComments,
                int txtShare,
                int imgAvatar,
                int imgPost) {


        this.txtName = txtName;
        this.txtData = txtData;
        this.txtPost = txtPost;
        this.txtLikers = txtLikers;
        this.txtLikes = txtLikes;
        this.txtComments = txtComments;
        this.txtShare = txtShare;
        this.imgAvatar = imgAvatar;
        this.imgPost = imgPost;
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

    public int getImgAvatar() {return imgAvatar;}
    public void setImgAvatar(int avatar) {imgAvatar = avatar;}

    public int getImgPost() {return imgPost;}
    public void setImgPost(int post) {imgPost=post;}

}