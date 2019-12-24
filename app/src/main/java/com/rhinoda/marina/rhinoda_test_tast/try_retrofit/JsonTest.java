package com.rhinoda.marina.rhinoda_test_tast.try_retrofit;

import com.google.gson.annotations.SerializedName;

public class JsonTest {

    @SerializedName("address")
    private String address;

    @SerializedName("email")
    private String email;

    @SerializedName("full_name")
    private String full_name;

    @SerializedName("id")
    private int id;

    @SerializedName("short_name")
    private String short_name;

    public JsonTest(String address, String email, String full_name, int id, String short_name) {
        this.address = address;
        this.email = email;
        this.full_name = full_name;
        this.id = id;
        this.short_name = short_name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getFull_name() {
        return full_name;
    }

    public int getId() {
        return id;
    }

    public String getShort_name() {
        return short_name;
    }
}
