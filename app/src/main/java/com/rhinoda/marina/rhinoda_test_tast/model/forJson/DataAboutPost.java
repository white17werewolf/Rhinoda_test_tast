package com.rhinoda.marina.rhinoda_test_tast.model.forJson;

import android.icu.util.GregorianCalendar;
import android.os.Build;

import androidx.annotation.RequiresApi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;

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



    @RequiresApi(api = Build.VERSION_CODES.O)


    public String getDate() {//return date;

        //Long tmp = Long.parseLong(date);
        //Calendar calendar = new GregorianCalendar();
        //Calendar today = new GregorianCalendar();

        GregorianCalendar calendar = new GregorianCalendar();
        GregorianCalendar today = new GregorianCalendar();
        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 10);
        calendar.set(Calendar.HOUR_OF_DAY, 5);
        calendar.set(Calendar.MINUTE, 2);

        String hour = String.valueOf(calendar.get(Calendar.HOUR_OF_DAY));
        String minute = String.valueOf(calendar.get(Calendar.MINUTE));
        Month month = Month.of(calendar.get(Calendar.MONTH));
        String monthRus = month.getDisplayName(TextStyle.FULL_STANDALONE, Locale.forLanguageTag("ru"));
        boolean thisDate =  calendar.get(Calendar.YEAR)==today.get(Calendar.YEAR)&& calendar.get(Calendar.MONTH)==today.get(Calendar.MONTH)+1;
                System.out.println("\nMONTH     " + today.get(Calendar.MONTH) + "\nDAY     " + today.get(Calendar.DAY_OF_MONTH) + "\n Year" + today.get(Calendar.YEAR));

        if(calendar.get(Calendar.MINUTE)<10){
            minute = "0" + calendar.get(Calendar.MINUTE);
        }

        if(calendar.get(Calendar.HOUR_OF_DAY)<10){
            hour = "0" + calendar.get(Calendar.HOUR_OF_DAY);
        }

        if(calendar.get(Calendar.DAY_OF_MONTH)==today.get(Calendar.DAY_OF_MONTH) && thisDate){
            return "Сегодня в " + hour+ ":"+ minute;
        }
        else  if(calendar.get(Calendar.DAY_OF_MONTH)==today.get(Calendar.DAY_OF_MONTH)-1 && thisDate){ return "Вчера в " + hour+":"+minute;}
        else return calendar.get(Calendar.DAY_OF_MONTH) + " " + monthRus + " в " + hour+":"+minute;


        /*DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
        String data2 = dateFormat.format(calendar);
        StringTokenizer strToken = new StringTokenizer(data2, " ");
        strToken.nextToken();
        data2 = strToken.nextToken();

        String hour = String.valueOf(calendar.get(Calendar.HOUR_OF_DAY));
        String minute = String.valueOf(calendar.get(Calendar.MINUTE));
        Month month = Month.of(Calendar.MONTH);
        String date = month.getDisplayName(TextStyle.FULL_STANDALONE, Locale.forLanguageTag("ru"));


        if(calendar.get(Calendar.DATE)==today.get(Calendar.DATE)){
            return "Сегодня в " + hour+":"+minute;
        }
        else  if(calendar.get(Calendar.DATE)==today.get(Calendar.DATE)-1){ return "Вчера в " + hour+":"+minute;}
              else //return calendar.get(Calendar.DAY_OF_MONTH) + " " + date + " в " + hour+":"+minute;
        return data2;*/


         /*Long tmp = Long.parseLong(date);
         Date thisDate = new Date(tmp*1000);
         Date today = new Date();

        String hour = String.valueOf(thisDate.getHours());
        String minute = String.valueOf(thisDate.getMinutes());

        if(thisDate.getMinutes()<10){
            minute = "0" + thisDate.getMinutes();
        }

        if(thisDate.getHours()<10){
            hour = "0" + thisDate.getHours();
        }

        //DataAboutPost thisPost = new DataAboutPost();

        if(thisDate.getDay() == today.getDay()){
            return "Сегодня в " + hour+":"+minute;
        }
        else if (thisDate.getDay() == today.getDay()-1) {return "Вчера в " + hour+":"+minute; }
        else return thisDate.getDate() + " " + thisDate.getMonth() + " в " + hour+":"+minute;*/}

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