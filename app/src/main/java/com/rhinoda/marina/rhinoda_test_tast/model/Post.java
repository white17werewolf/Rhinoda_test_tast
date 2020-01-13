package com.rhinoda.marina.rhinoda_test_tast.model;

public class Post implements IPost{

    private String txtName;
    private String txtDate;
    private String txtPost;
    private String txtLikers;
    private int txtLikes;
    private int txtComments;
    private int txtShare;
    private String imgAvatar;
    private String imgPost;
    public boolean isLike = false;
    public boolean isComment = false;
    public boolean isShare = false;

    public Post(String txtName,
                String txtDate,
                String txtPost,
                String txtLikers,
                int txtLikes,
                int txtComments,
                int txtShare,
                String imgAvatar,
                String imgPost) {

        this.txtName = txtName;
        this.txtDate = txtDate;
        this.txtPost = txtPost;
        this.txtLikers = txtLikers;
        this.txtLikes = txtLikes;
        this.txtComments = txtComments;
        this.txtShare = txtShare;
        this.imgAvatar = imgAvatar;
        this.imgPost = imgPost;
    }

    public String getTxtName() {return txtName;}

    public String getTxtDate() {return txtDate;}
    public void setTxtData(String data) {txtDate = data;}

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

    public String getImgAvatar() { return imgAvatar;}
    public void setImgAvatar(String avatar) {imgAvatar = avatar;}

    public String getImgPost() {return imgPost;}
    public void setImgPost(String post) {imgPost=post;}

}