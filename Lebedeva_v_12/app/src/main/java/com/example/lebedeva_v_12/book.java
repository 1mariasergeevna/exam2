package com.example.lebedeva_v_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class book extends AppCompatActivity implements OnClickListener {


    Button btnSite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        btnSite =  findViewById(R.id.btnSite);
    }

    @Override
    public void onClick(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://developer.android.com"));
        startActivity(i);
    }
}