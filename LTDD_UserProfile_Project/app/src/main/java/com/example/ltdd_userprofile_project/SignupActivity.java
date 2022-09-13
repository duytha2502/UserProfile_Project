package com.example.ltdd_userprofile_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignupActivity extends Activity {
    Button btnBackToSignin;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate  (savedInstanceState);
        setContentView(R.layout.activity_signup);
        btnBackToSignin = (Button)findViewById(R.id.btnBackToSignin);
        btnBackToSignin.setOnClickListener(V -> {
            Intent signinView = new Intent(SignupActivity.this,SigninActivity.class);
            startActivity(signinView);
        });
    }
}
