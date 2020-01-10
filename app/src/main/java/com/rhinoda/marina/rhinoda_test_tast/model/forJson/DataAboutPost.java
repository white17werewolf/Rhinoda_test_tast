package com.rhinoda.marina.rhinoda_test_tast.model.forJson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataAboutPost  {

    @SerializedName("post_id")
    @Expose
    private Integer postId;
    @SerializedName("type")
    @Expose
    private Integer type;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("comment_count")
    @Expose
    private Integer commentCount;
    @SerializedName("likes")
    @Expose
    private Integer likes;
    @SerializedName("complaint")
    @Expose
    private Integer complaint;
    @SerializedName("like")
    @Expose
    private Integer like;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("comment_permission")
    @Expose
    private Integer commentPermission;
    @SerializedName("is_allow_edit")
    @Expose
    private Integer isAllowEdit;
    @SerializedName("image_aspect")
    @Expose
    private Integer imageAspect;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("image_small")
    @Expose
    private String imageSmall;
    @SerializedName("user")
    @Expose
    private UserData user;

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Integer getComplaint() {
        return complaint;
    }

    public void setComplaint(Integer complaint) {
        this.complaint = complaint;
    }

    public Integer getLike() {
        return like;
    }

    public void setLike(Integer like) {
        this.like = like;
    }


    //////////////////////////////****************************DATA*********************//////////////////////////////////////////////////

    public String getDate() {return date;

//        Long tmp = Long.parseLong(date);
//        Calendar calendar = Calendar.getInstance();
//        Date date = new Date(tmp*1000);
//        calendar.setTime(date);
//        GregorianCalendar today = new GregorianCalendar();
//        Month month = Month.of(calendar.get(Calendar.MONTH)+1);
//        String monthRus = month.getDisplayName(TextStyle.FULL_STANDALONE, Locale.forLanguageTag("ru"));
//
//        boolean thisDate =  calendar.get(Calendar.YEAR)==today.get(Calendar.YEAR) && calendar.get(Calendar.MONTH)==today.get(Calendar.MONTH)+1;
//        String hour = String.valueOf(calendar.get(Calendar.HOUR_OF_DAY));
//        String minute = String.valueOf(calendar.get(Calendar.MINUTE));
//
//        if(calendar.get(Calendar.MINUTE)<10){
//            minute = "0" + calendar.get(Calendar.MINUTE);
//        }
//
//        if(calendar.get(Calendar.HOUR_OF_DAY)<10){
//            hour = "0" + calendar.get(Calendar.HOUR_OF_DAY);
//        }
//
//        if(calendar.get(Calendar.DAY_OF_MONTH)==today.get(Calendar.DAY_OF_MONTH) && thisDate){
//            return "Сегодня в " + hour+ ":"+ minute;
//        }
//        else  if(calendar.get(Calendar.DAY_OF_MONTH)==today.get(Calendar.DAY_OF_MONTH)-1 && thisDate){ return "Вчера в " + hour+":"+minute;}
//        else return calendar.get(Calendar.DAY_OF_MONTH) + " " + monthRus + " в " + hour+":"+minute;
       }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getCommentPermission() {
        return commentPermission;
    }

    public void setCommentPermission(Integer commentPermission) {
        this.commentPermission = commentPermission;
    }

    public Integer getIsAllowEdit() {
        return isAllowEdit;
    }

    public void setIsAllowEdit(Integer isAllowEdit) {
        this.isAllowEdit = isAllowEdit;
    }

    public Integer getImageAspect() {
        return imageAspect;
    }

    public void setImageAspect(Integer imageAspect) {
        this.imageAspect = imageAspect;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageSmall() {
        return imageSmall;
    }

    public void setImageSmall(String imageSmall) {
        this.imageSmall = imageSmall;
    }

    public UserData getUserData() {
        return user;
    }

    public void setUserData(UserData user) {
        this.user = user;
    }


}