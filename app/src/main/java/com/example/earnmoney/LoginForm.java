package com.example.earnmoney;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginForm extends AppCompatActivity {
    private Button Login,SignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);

        SignUp=findViewById(R.id.SignUp);
        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSignUp();
            }
        });
    }

    private void openSignUp() {
        Intent intent=new Intent(this,SignUp.class);
        intent.putExtra("Sign Up","invsible");
        startActivity(intent);
    }
    }

