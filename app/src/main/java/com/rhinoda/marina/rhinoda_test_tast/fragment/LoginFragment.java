package com.rhinoda.marina.rhinoda_test_tast.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.rhinoda.marina.rhinoda_test_tast.R;

public class LoginFragment extends Fragment {

    EditText email;
    EditText password;
    Button btnLogIn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.login, container, false);

    }

    @Override
    public void onViewCreated( View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        email = view.findViewById(R.id.email);
        password = view.findViewById(R.id.password);
        btnLogIn = view.findViewById(R.id.btnLogIn);

        btnLogIn.setOnClickListener(v -> {
            validate();
/*            String toastEmail, toastPass;
            toastEmail = !ValEmail(email.getText()) ? "No Valid Email" : "Valid email";
            toastPass = ValPassword(password.getText()) ? "No Valid Password" : "Valid Password";*/
        });
    }

    public boolean ValEmail(CharSequence email){
        return !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }


    public boolean ValPassword(CharSequence password){
        return !TextUtils.isEmpty(password) && password.length() > 5;
    }

    public void tost(String message){
        Toast.makeText(getContext(),
                message,
                Toast.LENGTH_SHORT)
                .show();
    }

    public void validate(){

        if (!ValEmail(email.getText()) && !ValPassword(password.getText())){
            tost("No Valid Email && Password");
            Log.d("validate", "1");
            return;
        }

        if (!ValEmail(email.getText())) {
            tost("No Valid Email");
            Log.d("validate", "2");
            return;

        }
        if (!ValPassword(password.getText())) {
            tost("No Valid Password");
            Log.d("validate", "3");
            return;

        }

        tost("ok");
        Log.d("validate", "4");
    }


}
