package com.kacau.kacaumap;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.skt.Tmap.TMapMarkerItem;
import com.skt.Tmap.TMapPoint;
import com.skt.Tmap.TMapView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class ResultMap extends AppCompatActivity {
    private static String TAG = "phpquerytest";
    TMapView tMapView;
    String gpsJsonString;

    String bld;
    String room;
    String floor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_map);
        Intent intent = getIntent();
        String[] POI=intent.getStringArrayExtra("POI");
        bld = POI[0];
        room = POI[1];

        GetBldGPS getBldGPS = new GetBldGPS();
        getBldGPS.execute(bld);

        LinearLayout ResultTmap = (LinearLayout) findViewById(R.id.ResultTmap);
        tMapView = new TMapView(this);
        tMapView.setSKTMapApiKey("28f96670-7443-42b8-ba92-6cf3e2b1e8f2");
        ResultTmap.addView(tMapView);
        tMapView.setCenterPoint(126.956895, 37.504242);
        tMapView.setZoomLevel(17);
        tMapView.setLanguage(TMapView.LANGUAGE_KOREAN);
//지도띄우기

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Intent intent;
                //floor = calFloor(room);

                if(bld.equals("101")){
                    intent = new Intent(ResultMap.this, InternalMap.InternalMap101.class);
                }else if(bld.equals("102")){
                    intent = new Intent(ResultMap.this, InternalMap.InternalMap102.class);
                }else if(bld.equals("103")){
                    intent = new Intent(ResultMap.this, InternalMap.InternalMap103.class);
                }else if(bld.equals("104")){
                    intent = new Intent(ResultMap.this, InternalMap.InternalMap104.class);
                }else if(bld.equals("105")){
                    intent = new Intent(ResultMap.this, InternalMap.InternalMap105.class);
                }else if(bld.equals("106")){
                    intent = new Intent(ResultMap.this, InternalMap.InternalMap106.class);
                }else if(bld.equals("107")){
                    intent = new Intent(ResultMap.this, InternalMap.InternalMap107.class);
                }else if(bld.equals("201")){
                    intent = new Intent(ResultMap.this, InternalMap.InternalMap201.class);
                }else if(bld.equals("202")){
                    intent = new Intent(ResultMap.this, InternalMap.InternalMap202.class);
                }else if(bld.equals("203")){
                    intent = new Intent(ResultMap.this, InternalMap.InternalMap203.class);
                }else if(bld.equals("204")){
                    intent = new Intent(ResultMap.this, InternalMap.InternalMap204.class);
                }else if(bld.equals("207")){
                    intent = new Intent(ResultMap.this, InternalMap.InternalMap207.class);
                }else if(bld.equals("208")){
                    intent = new Intent(ResultMap.this, InternalMap.InternalMap208.class);
                }else if(bld.equals("209")){
                    intent = new Intent(ResultMap.this, InternalMap.InternalMap209.class);
                }else if(bld.equals("301")){
                    intent = new Intent(ResultMap.this, InternalMap.InternalMap301.class);
                }else if(bld.equals("302")){
                    intent = new Intent(ResultMap.this, InternalMap.InternalMap302.class);
                }else if(bld.equals("303")){
                    intent = new Intent(ResultMap.this, InternalMap.InternalMap303.class);
                }else if(bld.equals("304")){
                    intent = new Intent(ResultMap.this, InternalMap.InternalMap304.class);
                }else if(bld.equals("305")){
                    intent = new Intent(ResultMap.this, InternalMap.InternalMap305.class);
                }else if(bld.equals("307")){
                    intent = new Intent(ResultMap.this, InternalMap.InternalMap307.class);
                }else{ //310관
                    intent = new Intent(ResultMap.this, InternalMap.InternalMap310.class);}

                    intent.putExtra("floor", floor);
                    startActivity(intent);
            }
        });

    }
    @NonNull
    private String substringBetween(String str, String open, String close) {
        if (str == null || open == null || close == null) {
            return "gpsJsonIsNull";
        }
        int start = str.indexOf(open);
        if (start != -1) {
            int end = str.indexOf(close, start + open.length());
            if (end != -1) {
                return str.substring(start + open.length(), end);
            }
        }
        return "gpsJsonIsNull";
    }

    private class GetBldGPS extends AsyncTask<String, Void, String> {


        ProgressDialog progressDialog;
        String errorString = null;

        @Override
        protected void onPreExecute() {

            super.onPreExecute();

            progressDialog = ProgressDialog.show(ResultMap.this,

                    "Please Wait", null, true, true);

        }

        @Override

        protected void onPostExecute(String result) {

            super.onPostExecute(result);

            progressDialog.dismiss();

            Log.d(TAG, "response - " + result);

            if (result == null) {

                gpsJsonString="gpsJsonIsNull";

            } else {

                gpsJsonString = result;
                String latitude=substringBetween(gpsJsonString,"latitude\":\"","\"");
                String longitude=substringBetween(gpsJsonString,"longitude\":\"","\"");
                ////여기부터 마커
                TMapMarkerItem markerItem1 = new TMapMarkerItem();
                TMapPoint tMapPoint1 = new TMapPoint(Double.parseDouble(latitude), Double.parseDouble(longitude));   //이 정보를 변수로 설정하고 클릭시 받아옴
                Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.mapmarker);
                markerItem1.setIcon(bitmap); // 마커 아이콘 지정
                markerItem1.setPosition(0.5f, 1.0f); // 마커의 중심점을 중앙, 하단으로 설정
                markerItem1.setTMapPoint(tMapPoint1); // 마커의 좌표 지정
                markerItem1.setName("마커"); // 마커의 타이틀 지정
                tMapView.addMarkerItem("markerItem1", markerItem1); // 지도에 마커 추가

            }
        }


        @Override
        protected String doInBackground(String... params) {

            String building = params[0];

            String serverURL = "http://hyeonixd.cafe24.com/buildingGpsQuery.php";

            StringBuffer buffer = new StringBuffer();

            buffer.append("building").append("=").append(building);


            try {

                URL url = new URL(serverURL);

                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

                httpURLConnection.setReadTimeout(5000);

                httpURLConnection.setConnectTimeout(5000);

                httpURLConnection.setRequestMethod("POST");

                httpURLConnection.setDoInput(true);

                httpURLConnection.connect();

                OutputStream outputStream = httpURLConnection.getOutputStream();

                outputStream.write(buffer.toString().getBytes("UTF-8"));
                //요기 부분이 서버로 값을 전송하는 부분

                outputStream.flush();

                outputStream.close();

                int responseStatusCode = httpURLConnection.getResponseCode();

                Log.d(TAG, "response code - " + responseStatusCode);

                InputStream inputStream;

                if (responseStatusCode == HttpURLConnection.HTTP_OK) {

                    inputStream = httpURLConnection.getInputStream();

                } else {

                    inputStream = httpURLConnection.getErrorStream();

                }

                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");

                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                StringBuilder sb = new StringBuilder();

                String line;

                while ((line = bufferedReader.readLine()) != null) {

                    sb.append(line);
                }

                bufferedReader.close();

                return sb.toString().trim();

            } catch (Exception e) {

                Log.d(TAG, "InsertData: Error ", e);

                errorString = e.toString();

                return null;
            }
        }
    }
}