package com.jsdttec.customviewdemo.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import com.jsdttec.customviewdemo.R;
import com.jsdttec.customviewdemo.view.MyView1;

/**
 * Created by Android Studio.
 * Author : zhangzhongqiang
 * Email  : zhangzhongqiang@jsdttec.com
 * Time   : 2017/06/05 下午 3:03
 * Desc   : description
 */

public class LearnViewActivity extends AppCompatActivity {

    FrameLayout root;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_view);

        root = (FrameLayout) findViewById(R.id.root);
        root.addView(new MyView1(LearnViewActivity.this));
    }
}
