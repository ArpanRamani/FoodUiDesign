package com.example.fooduidesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;

public class DasBoardPage extends AppCompatActivity {

    ImageView  Plus,Plus1,Plus2,Plus3;
    CircleImageView imgCTP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_das_board_page);

        initView();
    }

    private void initView() {

        Plus = findViewById(R.id.Plus);
        Plus1 = findViewById(R.id.Plus1);
        Plus2 = findViewById(R.id.Plus2);
        Plus3 = findViewById(R.id.Plus3);
        imgCTP = findViewById(R.id.imgCTP);


        Plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DasBoardPage.this,OrderPage.class);
                startActivity(intent);

            }
        });

        Plus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DasBoardPage.this,OrderPage.class);
                startActivity(intent);

            }
        });

        Plus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DasBoardPage.this,OrderPage.class);
                startActivity(intent);

            }
        });

        Plus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DasBoardPage.this,OrderPage.class);
                startActivity(intent);

            }
        });

        imgCTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(DasBoardPage.this,CTPDetailsPage.class);
                startActivity(intent);

            }
        });

    }
}