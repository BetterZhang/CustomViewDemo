package com.jsdttec.customviewdemo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Android Studio.
 * Author : zhangzhongqiang
 * Email  : zhangzhongqiang@jsdttec.com
 * Time   : 2017/06/05 下午 4:50
 * Desc   : description
 */

public class MyView2 extends View {

    public MyView2(Context context) {
        super(context);
    }

    public MyView2(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView2(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(5);

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



    }
}
