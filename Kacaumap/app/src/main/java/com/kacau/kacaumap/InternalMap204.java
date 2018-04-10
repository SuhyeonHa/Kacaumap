package com.kacau.kacaumap;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.github.chrisbanes.photoview.PhotoView;

// for bld 204

public class InternalMap204 extends AppCompatActivity {
    PhotoView photoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internal_map_204);

        photoView = (PhotoView)findViewById(R.id.images204);

        final Button clb1 = (Button)findViewById(R.id.cl_b1) ;
        final Button cl1 = (Button)findViewById(R.id.cl_1) ;
        final Button cl2 = (Button)findViewById(R.id.cl_2) ;
        final Button cl3 = (Button)findViewById(R.id.cl_3) ;
        final Button cl4 = (Button)findViewById(R.id.cl_4) ;
        final Button cl5 = (Button)findViewById(R.id.cl_5) ;
        final Button cl6 = (Button)findViewById(R.id.cl_6) ;
        final Button cl7 = (Button)findViewById(R.id.cl_7) ;

        // b1
        clb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                photoView.setImageResource(R.drawable.cl_b1);
                clb1.setTextColor(Color.BLUE);
                cl1.setTextColor(Color.BLACK);
                cl2.setTextColor(Color.BLACK);
                cl3.setTextColor(Color.BLACK);
                cl4.setTextColor(Color.BLACK);
                cl5.setTextColor(Color.BLACK);
                cl6.setTextColor(Color.BLACK);
                cl7.setTextColor(Color.BLACK);
            }
        });

        // 1
        cl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                photoView.setImageResource(R.drawable.cl_1);
                clb1.setTextColor(Color.BLACK);
                cl1.setTextColor(Color.BLUE);
                cl2.setTextColor(Color.BLACK);
                cl3.setTextColor(Color.BLACK);
                cl4.setTextColor(Color.BLACK);
                cl5.setTextColor(Color.BLACK);
                cl6.setTextColor(Color.BLACK);
                cl7.setTextColor(Color.BLACK);
            }
        });

        // 2
        cl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                photoView.setImageResource(R.drawable.cl_2);
                clb1.setTextColor(Color.BLACK);
                cl1.setTextColor(Color.BLACK);
                cl2.setTextColor(Color.BLUE);
                cl3.setTextColor(Color.BLACK);
                cl4.setTextColor(Color.BLACK);
                cl5.setTextColor(Color.BLACK);
                cl6.setTextColor(Color.BLACK);
                cl7.setTextColor(Color.BLACK);
            }
        });

        // 3
        cl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                photoView.setImageResource(R.drawable.cl_3);
                clb1.setTextColor(Color.BLACK);
                cl1.setTextColor(Color.BLACK);
                cl2.setTextColor(Color.BLACK);
                cl3.setTextColor(Color.BLUE);
                cl4.setTextColor(Color.BLACK);
                cl5.setTextColor(Color.BLACK);
                cl6.setTextColor(Color.BLACK);
                cl7.setTextColor(Color.BLACK);
            }
        });

        // 4
        cl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                photoView.setImageResource(R.drawable.cl_4);
                clb1.setTextColor(Color.BLACK);
                cl1.setTextColor(Color.BLACK);
                cl2.setTextColor(Color.BLACK);
                cl3.setTextColor(Color.BLACK);
                cl4.setTextColor(Color.BLUE);
                cl5.setTextColor(Color.BLACK);
                cl6.setTextColor(Color.BLACK);
                cl7.setTextColor(Color.BLACK);
            }
        });

        // 5
        cl5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                photoView.setImageResource(R.drawable.cl_5);
                clb1.setTextColor(Color.BLACK);
                cl1.setTextColor(Color.BLACK);
                cl2.setTextColor(Color.BLACK);
                cl3.setTextColor(Color.BLACK);
                cl4.setTextColor(Color.BLACK);
                cl5.setTextColor(Color.BLUE);
                cl6.setTextColor(Color.BLACK);
                cl7.setTextColor(Color.BLACK);
            }
        });

        // 6
        cl6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                photoView.setImageResource(R.drawable.cl_6);
                clb1.setTextColor(Color.BLACK);
                cl1.setTextColor(Color.BLACK);
                cl2.setTextColor(Color.BLACK);
                cl3.setTextColor(Color.BLACK);
                cl4.setTextColor(Color.BLACK);
                cl5.setTextColor(Color.BLACK);
                cl6.setTextColor(Color.BLUE);
                cl7.setTextColor(Color.BLACK);
            }

        });

        // 7
        cl7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                photoView.setImageResource(R.drawable.cl_7);
                clb1.setTextColor(Color.BLACK);
                cl1.setTextColor(Color.BLACK);
                cl2.setTextColor(Color.BLACK);
                cl3.setTextColor(Color.BLACK);
                cl4.setTextColor(Color.BLACK);
                cl5.setTextColor(Color.BLACK);
                cl6.setTextColor(Color.BLACK);
                cl7.setTextColor(Color.BLUE);
            }

        });


    }

}