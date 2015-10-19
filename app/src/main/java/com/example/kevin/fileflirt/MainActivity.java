package com.example.kevin.fileflirt;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.graphics.drawable.*;
import android.graphics.drawable.BitmapDrawable;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private static Drawable sBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Login = (Button)findViewById(R.id.Login);
        Button Register = (Button)findViewById(R.id.Register);
        Button Exit = (Button)findViewById(R.id.Exit);

        if(Login!=null) {
            Login.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    Intent Login = new Intent(MainActivity.this, Startpage.class);
                    startActivity(Login);
                }
            });
        } else {
            Log.i("Myapp", "Button is null");
        }

        if(Register!=null) {
            Register.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    Intent Register = new Intent(MainActivity.this, Register.class);
                    startActivity(Register);
                }
            });
        } else {
            Log.i("Myapp", "Button is null");
        }

        if(Exit!=null) {
            Exit.setOnClickListener(new Button.OnClickListener() {
                public void onClick(View v) {
                    System.exit(0);
                }
            });
        } else {
            Log.i("Myapp", "Button is null");
        }
    }
}
