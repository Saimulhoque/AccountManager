package com.forbitbd.accountmanager;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.button.MaterialButton;
import com.google.firebase.auth.FirebaseAuth;

public class AccountActivity extends AppCompatActivity implements View.OnClickListener {
    private MaterialButton btnlogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

       btnlogout = findViewById(R.id.logout);
       btnlogout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FirebaseAuth.getInstance().signOut();
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}