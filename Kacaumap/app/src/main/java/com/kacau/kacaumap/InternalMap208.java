package com.kacau.kacaumap;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.github.chrisbanes.photoview.PhotoView;

// for bld 208

public class InternalMap208 extends AppCompatActivity{
    PhotoView photoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internal_map_208);

        photoView = (PhotoView)findViewById(R.id.images208);

        final Button seb1 = (Button)findViewById(R.id.se_b1) ;
        final Button se1 = (Button)findViewById(R.id.se_1) ;
        final Button se2 = (Button)findViewById(R.id.se_2) ;
        final Button se3 = (Button)findViewById(R.id.se_3) ;
        final Button se4 = (Button)findViewById(R.id.se_4) ;
        final Button se5 = (Button)findViewById(R.id.se_5) ;
        final Button se6 = (Button)findViewById(R.id.se_6) ;

        // b1
        seb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                photoView.setImageResource(R.drawable.se_b1);
                seb1.setTextColor(Color.BLUE);
                se1.setTextColor(Color.BLACK);
                se2.setTextColor(Color.BLACK);
                se3.setTextColor(Color.BLACK);
                se4.setTextColor(Color.BLACK);
                se5.setTextColor(Color.BLACK);
                se6.setTextColor(Color.BLACK);
            }
        });

        // 1
        se1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                photoView.setImageResource(R.drawable.se_1);
                se1.setTextColor(Color.BLUE);
                seb1.setTextColor(Color.BLACK);
                se2.setTextColor(Color.BLACK);
                se3.setTextColor(Color.BLACK);
                se4.setTextColor(Color.BLACK);
                se5.setTextColor(Color.BLACK);
                se6.setTextColor(Color.BLACK);
            }
        });

        // 2
        se2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                photoView.setImageResource(R.drawable.se_2);
                se2.setTextColor(Color.BLUE);
                seb1.setTextColor(Color.BLACK);
                se1.setTextColor(Color.BLACK);
                se3.setTextColor(Color.BLACK);
                se4.setTextColor(Color.BLACK);
                se5.setTextColor(Color.BLACK);
                se6.setTextColor(Color.BLACK);
            }
        });

        // 3
        se3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                photoView.setImageResource(R.drawable.se_3);
                se3.setTextColor(Color.BLUE);
                se1.setTextColor(Color.BLACK);
                se2.setTextColor(Color.BLACK);
                se3.setTextColor(Color.BLACK);
                se4.setTextColor(Color.BLACK);
                se5.setTextColor(Color.BLACK);
                se6.setTextColor(Color.BLACK);
            }
        });

        // 4
        se4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                photoView.setImageResource(R.drawable.se_4);
                se4.setTextColor(Color.BLUE);
                seb1.setTextColor(Color.BLACK);
                se1.setTextColor(Color.BLACK);
                se2.setTextColor(Color.BLACK);
                se3.setTextColor(Color.BLACK);
                se5.setTextColor(Color.BLACK);
                se6.setTextColor(Color.BLACK);
            }
        });

        // 5
        se5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                photoView.setImageResource(R.drawable.se_5);
                se5.setTextColor(Color.BLUE);
                seb1.setTextColor(Color.BLACK);
                se1.setTextColor(Color.BLACK);
                se2.setTextColor(Color.BLACK);
                se3.setTextColor(Color.BLACK);
                se4.setTextColor(Color.BLACK);
                se6.setTextColor(Color.BLACK);
            }
        });

        // 6
        se6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                photoView.setImageResource(R.drawable.se_6);
                se6.setTextColor(Color.BLUE);
                seb1.setTextColor(Color.BLACK);
                se1.setTextColor(Color.BLACK);
                se2.setTextColor(Color.BLACK);
                se3.setTextColor(Color.BLACK);
                se4.setTextColor(Color.BLACK);
                se5.setTextColor(Color.BLACK);
            }
        });


    }

}