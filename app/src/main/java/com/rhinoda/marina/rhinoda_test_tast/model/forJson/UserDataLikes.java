package com.rhinoda.marina.rhinoda_test_tast.model.forJson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserDataLikes {


    @SerializedName("uid")
    @Expose
    private Integer uid;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("online")
    @Expose
    private Integer online;
    @SerializedName("vip_bg")
    @Expose
    private String vipBg;
    @SerializedName("nik")
    @Expose
    private String nik;
    @SerializedName("verified")
    @Expose
    private Integer verified;
    @SerializedName("avatar_date")
    @Expose
    private Integer avatarDate;
    @SerializedName("avatar")
    @Expose
    private String avatar;
    @SerializedName("avatar_small")
    @Expose
    private String avatarSmall;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOnline() {
        return online;
    }

    public void setOnline(Integer online) {
        this.online = online;
    }

    public String getVipBg() {
        return vipBg;
    }

    public void setVipBg(String vipBg) {
        this.vipBg = vipBg;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public Integer getVerified() {
        return verified;
    }

    public void setVerified(Integer verified) {
        this.verified = verified;
    }

    public Integer getAvatarDate() {
        return avatarDate;
    }

    public void setAvatarDate(Integer avatarDate) {
        this.avatarDate = avatarDate;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAvatarSmall() {
        return avatarSmall;
    }

    public void setAvatarSmall(String avatarSmall) {
        this.avatarSmall = avatarSmall;
    }

}
