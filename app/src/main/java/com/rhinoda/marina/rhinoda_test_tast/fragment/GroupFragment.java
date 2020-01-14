package com.rhinoda.marina.rhinoda_test_tast.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.rhinoda.marina.rhinoda_test_tast.IGroupView;
import com.rhinoda.marina.rhinoda_test_tast.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class GroupFragment extends Fragment implements IGroupView {


    @BindView(R.id.txtGroupName)
    TextView txtGroupName;

    @BindView(R.id.btnWrite)
    Button btnWrite;

    @BindView(R.id.btnAllGroups)
    Button btnAllGroups;
    @BindView(R.id.btnMyGroups)
    Button btnMyGroups;
    @BindView(R.id.btnInvitations)
    Button btnInvitations;
    @BindView(R.id.txtSearch)
    EditText txtSearch;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_groups, container, false);

    }

    @Override
    public void onViewCreated( View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        //final GroupPresenter groupPresenter = new GroupPresenter(this);

        //final LoginPresenter loginPresenter =new LoginPresenter(this);
        //btnLogIn.setOnClickListener(v -> loginPresenter.onLogin(email.getText().toString(), password.getText().toString()));
    }

    @Override
    public void TestToast(String message) {
        Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
    }
}
