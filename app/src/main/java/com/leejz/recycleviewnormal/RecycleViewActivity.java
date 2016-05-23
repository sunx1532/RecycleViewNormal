package com.leejz.recycleviewnormal;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.widget.Toast;

/**
 * Created by Lijizhou on 2016/2/3.
 */
public class RecycleViewActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private String[] title = {"Blog : http://blog.csdn.net/Leejizhou.",
            "A good laugh and a long sleep are the best cures in the doctor's book.",
            "all or nothing, now or never ",
            "Be nice to people on the way up, because you'll need them on your way down.",
            "Be confident with yourself and stop worrying what other people think. Do what's best for your future happiness!",
            "Blessed is he whose fame does not outshine his truth.",
            "Create good memories today, so that you can have a good past"
    };

    /**
     * 图片资源版权归属于Smartisan.com
     */
    private int[] pic = {R.mipmap.aa1, R.mipmap.aa0, R.mipmap.aa2, R.mipmap.aa3, R.mipmap.aa4, R.mipmap.aa5, R.mipmap.aa6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        mRecyclerView = (RecyclerView) findViewById(R.id.rv_list);
        if (getIntent().getIntExtra("type", 0) == 0) {

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);

    } else if (getIntent().getIntExtra("type", 0) == 1) {
        mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));

    } else {
        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, OrientationHelper.VERTICAL));//这里用线性宫格显示 类似于瀑布流
    }

    mRecyclerView.setAdapter(new RecyclerViewAdapter(this, title, pic));
    mRecyclerView.setItemAnimator(new DefaultItemAnimator());


    }



}

