package com.leejz.recycleviewnormal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //List Onclick
        findViewById(R.id.btn_list).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,RecycleViewActivity.class);
                intent.putExtra("type",0);
                startActivity(intent);
            }
        });

        //Grid Onclick
        findViewById(R.id.btn_grid).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,RecycleViewActivity.class);
                intent.putExtra("type",1);

                startActivity(intent);
            }
        });

        //Staggered Onclick
        findViewById(R.id.btn_Staggered).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,RecycleViewActivity.class);
                intent.putExtra("type",2);
                startActivity(intent);
            }
        });

    }
}
