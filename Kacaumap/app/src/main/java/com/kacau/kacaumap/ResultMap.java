package com.kacau.kacaumap;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

import com.skt.Tmap.TMapMarkerItem;
import com.skt.Tmap.TMapPoint;
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
        tMapView.setLanguage(TMapView.LANGUAGE_KOREAN);
//지도띄우기
        Intent intent =getIntent();
        String searchPOI= intent.getStringExtra("searchPOI");
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        ////여기부터 마커
        TMapMarkerItem markerItem1 = new TMapMarkerItem();
        TMapPoint tMapPoint1 = new TMapPoint(37.503667, 126.957139);   //이 정보를 변수로 설정하고 클릭시 받아옴
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.mapmarker);
        markerItem1.setIcon(bitmap); // 마커 아이콘 지정
        markerItem1.setPosition(0.5f, 1.0f); // 마커의 중심점을 중앙, 하단으로 설정
        markerItem1.setTMapPoint( tMapPoint1 ); // 마커의 좌표 지정
        markerItem1.setName("208관"); // 마커의 타이틀 지정
        tMapView.addMarkerItem("markerItem1", markerItem1); // 지도에 마커 추가

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
