package com.example.drawing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private com.example.drawing.CustomView customeView;
    Button change;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * to dispaly the 2d graph like rectangle and traingle and circle  as  here the code
         * */
     /*   DrawView paint=new DrawView(this);
        setContentView(paint);*/
        /* to dispaly the painter as painter here the code
         * */

    /*PaintView paint=new PaintView(this);
      setContentView(paint);*/
        ///here the code for the customeview where the user can change the color of the rectangle
        com.example.drawing.CustomView rectangle=new com.example.drawing.CustomView(this);
        setContentView(R.layout.activity_main);
        customeView=findViewById(R.id.custom);
        change=findViewById(R.id.button);
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customeView.swapcolor();
            }
        });

    }
}