package com.kacau.kacaumap;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.skt.Tmap.TMapView;

public class ResultMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_map);
        LinearLayout ResultTmap = (LinearLayout)findViewById(R.id.ResultTmap);
        TMapView tMapView = new TMapView(this);
        tMapView.setSKTMapApiKey( "28f96670-7443-42b8-ba92-6cf3e2b1e8f2" );
        ResultTmap.addView( tMapView );
        tMapView.setCenterPoint(126.956895, 37.504242);
        tMapView.setZoomLevel(17);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Intent intent = new Intent(ResultMap.this, InternalMap310.class);
                // 몇 관 몇 층인지에 따라 보여주는 xml 다르게
                startActivity(intent);
            }
        });



    }
}
