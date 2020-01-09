package com.rhinoda.marina.rhinoda_test_tast.model.forJson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserDataLikesList {

    @SerializedName("likes_user")
    @Expose
    private List<UserDataLikes> likes_user;


    public List<UserDataLikes> getUserLikesList() {
        return likes_user;
    }

    public void setUserLikesList(List<UserDataLikes> likes_user) {
        this.likes_user = likes_user;
    }
}
