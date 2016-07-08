package com.example.alunoinf.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class UserAccountInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_account_info);
    }

    private void editUserAccount(){
        Intent it = new Intent(this, UserAccountEditActivity.class);
        startActivity(it);
    }
}
