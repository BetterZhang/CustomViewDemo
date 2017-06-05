package com.jsdttec.customviewdemo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Android Studio.
 * Author : zhangzhongqiang
 * Email  : zhangzhongqiang@jsdttec.com
 * Time   : 2017/06/05 下午 3:07
 * Desc   : description
 */

public class MyView1 extends View {

    Context mContext;

    public MyView1(Context context) {
        super(context);
        mContext = context;
    }

    public MyView1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
    }

    public MyView1(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        /*
        // 设置画笔基本属性
        Paint paint = new Paint();
        paint.setAntiAlias(true);   // 抗锯齿功能
        paint.setColor(Color.RED);  // 设置画笔颜色
        paint.setStyle(Paint.Style.FILL);// 设置填充样式
        paint.setStrokeWidth(5);    // 设置画笔宽度
        paint.setShadowLayer(10, 15, 15, Color.GREEN);// 设置阴影

        // 设置画布背景颜色设置画布背景颜色
        canvas.drawRGB(255, 255, 255);
        // 画圆
        canvas.drawCircle(200, 200, 150, paint);
        */

        /*
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(5);

//        canvas.drawLine(100, 100, 200, 200, paint);
        float[] pts = {10, 10, 100, 100, 200, 200, 400, 400};
//        canvas.drawLines(pts, paint);
        canvas.drawLines(pts, 2, 4, paint);
        */

        /*
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(15);

//        canvas.drawPoint(100, 100, paint);
        float[] pts = {10, 10, 100, 100, 200, 200, 400, 400};
//        canvas.drawPoints(pts, paint);
        canvas.drawPoints(pts, 2, 4, paint);
        */

        /*
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(15);

        canvas.drawRect(10, 10, 100, 100, paint);

        // 使用RectF构造
        RectF rectF = new RectF(120, 10, 210, 100);
        canvas.drawRect(rectF, paint);

        // 使用Rect构造
        Rect rect = new Rect(230, 10, 320, 100);
        canvas.drawRect(rect, paint);
        */

        /*
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(15);

        RectF rectF = new RectF(100, 10, 300, 100);
        canvas.drawRoundRect(rectF, 50, 20, paint);
        */

        /*
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(15);

        canvas.drawCircle(150, 150, 100, paint);
        */

        /*
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);

        RectF rectF = new RectF(100, 10, 300, 100);
        canvas.drawRect(rectF, paint);

        paint.setColor(Color.GREEN);
        canvas.drawOval(rectF, paint);
        */

        Paint paint = new Paint();
        paint.setColor(Color.RED);
//        paint.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(5);

        RectF rectF = new RectF(100, 10, 300, 100);
        canvas.drawArc(rectF, 0, 90, true, paint);

        RectF rectF1 = new RectF(400, 10, 600, 100);
//        canvas.drawArc(rectF1, 90, 270, true, paint);
//        canvas.drawArc(rectF1, 0, 90, false, paint);
        canvas.drawArc(rectF1, 0, 90, true, paint);
    }
}
