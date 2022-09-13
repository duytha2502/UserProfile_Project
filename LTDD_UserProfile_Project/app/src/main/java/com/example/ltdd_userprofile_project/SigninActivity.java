package com.example.ltdd_userprofile_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class SigninActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        TextView txtEmail = (TextView) findViewById(R.id.txtEmail);
        TextView txtPassword = (TextView) findViewById(R.id.txtPassword);

        Button btnSignin = (Button) findViewById(R.id.btnSignin);
        Button btnSignup = (Button) findViewById(R.id.btnSignup);

        btnSignin.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if(txtEmail.getText().toString().equals("duythai2502@gmail.com") && txtPassword.getText().toString().equals("0788024737")){
                    Toast.makeText(SigninActivity.this,"Login successful",Toast.LENGTH_SHORT).show();
                    Intent mainUI = new Intent(SigninActivity.this,MainActivity.class);
                    startActivity(mainUI);
                }
                else
                    Toast.makeText(SigninActivity.this,"Login Failed",Toast.LENGTH_SHORT).show();
            }
                                     }
        );
        btnSignup.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(SigninActivity.this,"Login successful",Toast.LENGTH_SHORT).show();
                Intent signupUI = new Intent(SigninActivity.this,SignupActivity.class);
                startActivity(signupUI);
            }
        }
        );
    }
}
