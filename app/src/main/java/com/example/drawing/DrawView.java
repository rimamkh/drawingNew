package com.example.drawing;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class DrawView extends View {
    public DrawView(Context context) {
        super(context);
    }


    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        Paint paint=new Paint();
        //drawing circle
        int width=getWidth();
        int height=getHeight();
        int radius=100;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.WHITE);
        canvas.drawPaint(paint);
        paint.setColor(Color.parseColor("#CD5C5C"));
        canvas.drawCircle(width/2,height/2,radius,paint);
        ///rectangle
        paint.setColor(Color.parseColor("#FF0000"));
        canvas.drawRect(100,50,300,300,paint);
        ///draw Triangle
        paint.setColor(Color.RED);
        Path path=new Path();
        Point a=new Point(350,50);
        Point b=new Point(350,300);
        Point c=new Point(550,300);
        path.setFillType(Path.FillType.EVEN_ODD);
        path.lineTo(a.x,a.y);
        path.lineTo(b.x,b.y);
        path.lineTo(c.x,c.y);
        path.lineTo(a.x,a.y);
        path.close();

        canvas.drawPath(path,paint);

        }
    }


