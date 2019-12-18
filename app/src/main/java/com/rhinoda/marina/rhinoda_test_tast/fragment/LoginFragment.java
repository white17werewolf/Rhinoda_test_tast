package com.rhinoda.marina.rhinoda_test_tast.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.rhinoda.marina.rhinoda_test_tast.ILoginView;
import com.rhinoda.marina.rhinoda_test_tast.Presenter.LoginPresenter;
import com.rhinoda.marina.rhinoda_test_tast.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LoginFragment extends Fragment implements ILoginView {

    @BindView(R.id.email)
    EditText email;

    @BindView(R.id.password)
    EditText password;

    @BindView(R.id.btnLogIn)
    Button btnLogIn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login, container, false);

    }

    @Override
    public void onViewCreated( View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

        final LoginPresenter loginPresenter =new LoginPresenter(this);
        btnLogIn.setOnClickListener(v -> loginPresenter.onLogin(email.getText().toString(), password.getText().toString()));
    }

    @Override
    public void onLoginStatus(String message) {
        Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
    }
    }

