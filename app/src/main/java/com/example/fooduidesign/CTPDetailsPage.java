package com.example.fooduidesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CTPDetailsPage extends AppCompatActivity {

    ImageView imgBa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctpdetails_page);

        initView();
    }

    private void initView() {

        imgBa = findViewById(R.id.imgBa);
        imgBa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                onBackPressed();

            }
        });
    }
}