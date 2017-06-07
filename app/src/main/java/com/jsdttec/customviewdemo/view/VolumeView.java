package com.jsdttec.customviewdemo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Android Studio.
 * Author : zhangzhongqiang
 * Email  : zhangzhongqiang@jsdttec.com
 * Time   : 2017/06/07 下午 3:32
 * Desc   : description
 */

public class VolumeView extends View {

    private int mWidth;
    private int mRectWidth;
    private int mRectHeight;

    private Paint mPaint;
    private int mRectCount;
    private int offset = 5;
    private double mRandom;

    private LinearGradient mLinearGradient;

    public VolumeView(Context context) {
        this(context, null);
    }

    public VolumeView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public VolumeView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    private void initView() {
        mPaint = new Paint();
        mPaint.setColor(Color.BLUE);
        mPaint.setStyle(Paint.Style.FILL);
        mRectCount = 12;
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth = getWidth();
        mRectHeight = getHeight();
        mRectWidth = mWidth / mRectCount;
        mLinearGradient = new LinearGradient(0, 0,
                mRectWidth, mRectHeight,
                Color.YELLOW, Color.GREEN,
                Shader.TileMode.CLAMP
        );
        mPaint.setShader(mLinearGradient);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < mRectCount; i++) {
            mRandom = Math.random();
            float currentHeight = (float) (mRectHeight * mRandom);
            canvas.drawRect(
                    mRectWidth * i + offset,
                    currentHeight,
                    mRectWidth * (i + 1),
                    mRectHeight,
                    mPaint
            );
        }
        postInvalidateDelayed(300);
    }
}
