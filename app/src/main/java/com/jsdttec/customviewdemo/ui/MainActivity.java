package com.jsdttec.customviewdemo.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import com.jsdttec.customviewdemo.R;
import com.jsdttec.customviewdemo.view.MyTopBar;

public class MainActivity extends AppCompatActivity {

    private MyTopBar mTopBar;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTopBar = (MyTopBar) findViewById(R.id.topBar);
        btn = (Button) findViewById(R.id.btn);

        mTopBar.setOnTopbarClickListener(new MyTopBar.topbarClickListener() {
            @Override
            public void leftClick() {
//                Toast.makeText(MainActivity.this, "left", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this, LearnViewActivity.class);
                startActivity(intent);
            }

            @Override
            public void rightClick() {
//                Toast.makeText(MainActivity.this, "right", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(MainActivity.this, CircleProgressActivity.class);
                Intent intent = new Intent(MainActivity.this, VolumeViewActivity.class);
                startActivity(intent);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, TestEventActivity.class);
                startActivity(intent);
            }
        });

        // 控制TopBar上组件的状态
        mTopBar.setButtonVisible(0, true);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mTopBar.setButtonVisible(1, false);
            }
        }, 10000);
    }
}
