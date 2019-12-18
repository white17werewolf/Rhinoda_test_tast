package com.rhinoda.marina.rhinoda_test_tast.Presenter;

import com.rhinoda.marina.rhinoda_test_tast.ILoginView;
import com.rhinoda.marina.rhinoda_test_tast.model.User;

public class LoginPresenter implements ILoginPresenter {

    ILoginView loginView;

    public LoginPresenter(ILoginView loginView){
        this.loginView = loginView;
    }

    @Override
    public void onLogin(String email, String password) {

        User user = new User(email, password);
        int isLoginSuccess = user.isValidate();

        if(isLoginSuccess==1){
            loginView.onLoginStatus("Enter email!");
        }
        if(isLoginSuccess==2){
            loginView.onLoginStatus("Incorrect email");
        }
        if(isLoginSuccess==3){
            loginView.onLoginStatus("You password is too short");
        }
        if(isLoginSuccess==-1){
            loginView.onLoginStatus("Ok");}
    }
}
