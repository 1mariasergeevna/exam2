package com.example.lebedeva_v_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener {


    Button btnGo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGo =  findViewById(R.id.btnGo);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, book.class);
        startActivity(intent);
    }
}