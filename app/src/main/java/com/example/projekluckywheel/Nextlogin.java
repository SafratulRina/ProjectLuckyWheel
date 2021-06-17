package com.example.projekluckywheel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Nextlogin extends AppCompatActivity {

    Button admin, member;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nextlogin);

        admin = (Button)findViewById(R.id.btnAdmin);
        member = (Button)findViewById(R.id.btnMember);

        //admin
        admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent adminActivityIntent = new Intent(Nextlogin.this, AdminActivity.class);
                startActivity(adminActivityIntent);
                finish();
            }
        });
        //member
        member.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent getActivityIntent = new Intent(Nextlogin.this, GetActivity.class);
                startActivity(getActivityIntent);
                finish();
            }
        });
    }
}