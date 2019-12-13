package com.rhinoda.marina.rhinoda_test_tast;

public class RecycleItem {

    String txtName;
    String txtData;
    String txtPost;
    String txtLikers;
    int txtLikes;
    int txtComments;
    int txtShare;
    String URLimgAvatar;
    String URLimgPost;


    public RecycleItem(String txtName,
                       String txtData,
                       String txtPost,
                       String txtLikers,
                       int txtLikes,
                       int txtComments,
                       int txtShare,
                       String URLimgAvatar,
                       String URLimgPost) {
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
    //public void setTxtData(String data) {txtData.setText(data);}

    public String getTxtPost() {return txtPost;}
   // public void setTxtPost(String post) { txtPost.setText(post);}

    public String getTxtLikers() {return txtLikers;}
    //public void setTxtLikers(String likers) {txtLikers.setText(likers);}

    public String getTxtLikes() {return String.valueOf(txtLikes);}
   // public void setTxtLikes(String likes) {txtLikes.setText(likes);}

    public String getTxtComments() {return String.valueOf(txtComments);}
    //public void setTxtComments(String comments) { txtComments.setText(comments);}

    public String getTxtShare() {return String.valueOf(txtShare);}
    // public void setTxtLikes(String likes) {txtLikes.setText(likes);}

    public String getURLimgAvatar() {return URLimgAvatar;}
    //public void setImgAvatar(Image avatar) {imgAvatar.setImageResource(URI);}

    public String getURLimgPost() {return URLimgPost;}
    //public void setImgAvatar(Image imgAvatar) {;}


}