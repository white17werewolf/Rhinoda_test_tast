package com.rhinoda.marina.rhinoda_test_tast.model;

import android.text.TextUtils;
import android.util.Patterns;

public class User implements IUser {

    private String email, password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public int isValidate() {
        if(TextUtils.isEmpty(getEmail()) || TextUtils.isEmpty(getPassword())){
            return 1;
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(getEmail()).matches()){
            return 2;
        }
        if (password.length()<5){
            return 3;
        }
        else
            return -1;
    }
}
