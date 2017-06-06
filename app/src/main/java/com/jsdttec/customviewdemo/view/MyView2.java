package com.jsdttec.customviewdemo.view;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by Android Studio.
 * Author : zhangzhongqiang
 * Email  : zhangzhongqiang@jsdttec.com
 * Time   : 2017/06/05 下午 4:50
 * Desc   : description
 */

public class MyView2 extends View {

    Context mContext;

    public MyView2(Context context) {
        super(context);
        mContext = context;
    }

    public MyView2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
    }

    public MyView2(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        /*
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);
        */

        /*
        Path path = new Path();

        path.moveTo(10, 10);
        path.lineTo(10, 100);
        path.lineTo(300, 100);
        path.lineTo(500, 100);
        path.close();

        canvas.drawPath(path, paint);
        */

        /*
        // 先创建两个大小一样的路径
        // 第一个逆向生成
        Path CCWRectPath = new Path();
        RectF rect = new RectF(50, 50, 240, 200);
        CCWRectPath.addRect(rect, Path.Direction.CCW);

        // 第二个顺向生成
        Path CWRectPath = new Path();
        RectF rect2 = new RectF(290, 50, 480, 200);
        CWRectPath.addRect(rect2, Path.Direction.CW);

        // 先画出这两个路径
        canvas.drawPath(CCWRectPath, paint);
        canvas.drawPath(CWRectPath, paint);

        // 依据路径写出文字
        String text = "风萧萧兮易水寒，壮士一去兮不复返";
        paint.setColor(Color.GRAY);
        paint.setTextSize(35);
        canvas.drawTextOnPath(text, CCWRectPath, 0, 0, paint);
        canvas.drawTextOnPath(text, CWRectPath, 0, 18, paint);
        */

        /*
        Path path = new Path();
        RectF rect1 = new RectF(50, 50, 240, 200);
        path.addRoundRect(rect1, 10, 15, Path.Direction.CCW);

        RectF rect2 = new RectF(290, 50, 480, 200);
        float radii[] = {10, 15, 20, 25, 30, 35, 40, 45};
        path.addRoundRect(rect2, radii, Path.Direction.CCW);

        canvas.drawPath(path, paint);
        */

        /*
        Path path = new Path();
        path.addCircle(200, 200, 100, Path.Direction.CCW);
        canvas.drawPath(path, paint);
        */

        /*
        Path path = new Path();
        RectF rect = new RectF(50, 50, 240, 200);
        path.addOval(rect, Path.Direction.CCW);
        canvas.drawPath(path, paint);
        */

        /*
        Path path = new Path();
        RectF rect = new RectF(50, 50, 240, 200);
        path.addArc(rect, 0, 130);

        canvas.drawPath(path, paint);
        */

        /*
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(5);
        paint.setAntiAlias(true);
        paint.setTextSize(80);
        */

        /*
        paint.setStyle(Paint.Style.FILL);
        canvas.drawText("欢迎光临我的博客", 10, 100, paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawText("欢迎光临我的博客", 10, 200, paint);

        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawText("欢迎光临我的博客", 10, 300, paint);
        */

        /*
        paint.setStyle(Paint.Style.FILL);
        */

        /*
        paint.setFakeBoldText(true);
        paint.setUnderlineText(true);
        paint.setStrikeThruText(true);

        // 设置字体水平倾斜度，普通斜体字是-0.25，往右斜
        paint.setTextSkewX((float) -0.25);
        canvas.drawText("欢迎来到我的博客", 10, 100, paint);

        // 设置水平倾斜度为0.25，往左斜
        paint.setTextSkewX((float) 0.25);
        canvas.drawText("欢迎来到我的博客", 10, 200, paint);
        */

        /*
        canvas.drawText("欢迎光临我的博客", 10, 100, paint);

        // 水平方向拉伸2倍
        paint.setTextScaleX(2);
        canvas.drawText("欢迎光临我的博客", 10, 200, paint);

        // 写在同一位置,不同颜色,看下高度是否看的不变
        paint.setTextScaleX(1);
        canvas.drawText("欢迎光临我的博客", 10, 300, paint);

        paint.setColor(Color.GREEN);
        paint.setTextScaleX(2);//重新设置拉伸效果
        canvas.drawText("欢迎光临我的博客", 10, 300, paint);
        */

        /*
        float[] pos = new float[] {
                80, 100,
                80, 200,
                80, 300,
                80, 400
        };
        canvas.drawPosText("画图示例", pos, paint);
        */

        /*
        Paint paint = new Paint();
        paint.setColor(Color.RED);

        paint.setStrokeWidth(5);
        paint.setAntiAlias(true);
        paint.setTextSize(45);
        paint.setStyle(Paint.Style.STROKE);

        String string="风萧萧兮易水寒，壮士一去兮不复返";

        // 先创建两个相同的圆形路径，并先画出两个路径原图
        Path circlePath1 = new Path();
        circlePath1.addCircle(220, 200, 180, Path.Direction.CCW);
        canvas.drawPath(circlePath1, paint);

        Path circlePath2 = new Path();
        circlePath2.addCircle(750, 200, 180, Path.Direction.CCW);
        canvas.drawPath(circlePath2, paint);

        paint.setColor(Color.GREEN);
        // hoffset、voffset参数值全部设为0，看原始状态是怎样的
        canvas.drawTextOnPath(string, circlePath1, 0, 0 ,paint);
        // 第二个路径，改变hoffset、voffset参数值
        canvas.drawTextOnPath(string, circlePath2, 80, 30 ,paint);
        */

        /*
        Paint paint = new Paint();
        paint.setColor(Color.RED);

        paint.setStrokeWidth(5);
        paint.setAntiAlias(true);
        paint.setTextSize(60);
        paint.setStyle(Paint.Style.STROKE);

        String familyName = "宋体";
        Typeface font = Typeface.create(familyName, Typeface.NORMAL);
        paint.setTypeface(font);
        canvas.drawText("欢迎光临我的博客", 10, 100, paint);
        */

        Paint paint = new Paint();
        paint.setColor(Color.RED);

        paint.setStrokeWidth(5);
        paint.setAntiAlias(true);
        paint.setTextSize(60);
        paint.setStyle(Paint.Style.FILL);

        AssetManager manager = mContext.getAssets();
        Typeface font = Typeface.createFromAsset(manager, "fonts/jian_luobo.ttf");
        paint.setTypeface(font);

        Log.v("msg", font.toString());
        canvas.drawText("欢迎光临我的博客", 10, 100, paint);

    }
}
