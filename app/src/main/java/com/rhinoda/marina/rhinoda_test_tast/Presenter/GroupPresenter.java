package com.rhinoda.marina.rhinoda_test_tast.Presenter;

import com.rhinoda.marina.rhinoda_test_tast.IGroupView;
import com.rhinoda.marina.rhinoda_test_tast.model.Group;

public class GroupPresenter implements IGroupPresenter {

    IGroupView groupView;

    public GroupPresenter(IGroupView groupView){
        this.groupView = groupView;
    }

    @Override
    public void onGroup(String groupName, int membersNumber) {
        Group group = new Group(groupName,membersNumber);
        group.getGroupName();
        group.getMembersNumber();

        groupView.TestToast("Good Job!");


    /*int isLoginSuccess = user.isValidate();

        if(isLoginSuccess==1){
            loginView.onLoginStatus("Enter email!");
        }*/
    }


//    ILoginView loginView;
//
//    public LoginPresenter(ILoginView loginView){
//        this.loginView = loginView;
//    }
}
