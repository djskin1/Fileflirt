package com.example.kevin.fileflirt;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button Cancel = (Button)findViewById(R.id.Cancel);

        Cancel.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent Cancel = new Intent(Register.this, MainActivity.class);
                startActivity(Cancel);
            }
        });
    }
}

