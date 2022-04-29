package com.example.drawing;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class CustomView extends View {
    public int SQURE_SIZE=200;
    private Rect rect;
    private Point point;//for triangle
    private Paint paint;
    public CustomView(Context context) {
        super(context);
        init(null);
    }



    public CustomView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }
    private  void init(@Nullable AttributeSet set){
        //square
       rect=new Rect();
        //triangle
        //point=new Point();
        paint=new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.GREEN);
    }
    public  void swapcolor(){
        paint.setColor(paint.getColor()==Color.GREEN? Color.RED:Color.GREEN);
        postInvalidate();
    }
    protected void onDraw(Canvas canvas) {
        //give color for draw
        //triangle

       /* Point a=new Point(350,50);
        Point b=new Point(350,300);
        Point c=new Point(550,300);
        Path path=new Path();
        path.setFillType(Path.FillType.EVEN_ODD);
        path.lineTo(a.x,a.y);
        path.lineTo(b.x,b.y);
        path.lineTo(c.x,c.y);
        path.lineTo(a.x,a.y);
        path.close();
        canvas.drawPath(path,paint);*/
        //Draw rectangle

        rect.left=50;
        rect.top=50;
        rect.right=rect.left+SQURE_SIZE;
        rect.bottom=rect.top+SQURE_SIZE;
        canvas.drawRect(rect,paint);
    }
}

