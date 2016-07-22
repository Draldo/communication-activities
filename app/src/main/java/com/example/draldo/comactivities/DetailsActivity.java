package com.example.draldo.comactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private TextView mTextViewUsername;
    private TextView mTextViewPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        mTextViewUsername = (TextView) findViewById(R.id.a_main_textname);
        mTextViewPassword = (TextView) findViewById(R.id.a_main_textpass);

        Intent intent = getIntent();
        String usr = intent.getStringExtra("username");
        String pass = intent.getStringExtra("password");

        mTextViewUsername.setText(usr);
        mTextViewPassword.setText(pass);
    }
}
