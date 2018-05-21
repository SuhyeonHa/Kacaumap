package com.kacau.kacaumap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class Navigation extends AppCompatActivity {

    String sBld;
    String sRoom;
    String sName;
    String dBld;
    String dRoom;
    String dName;
    String[] gps;
    String[] sdPOI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        Button button1 = (Button) findViewById(R.id.searchbtn);
        EditText text1 = (EditText) findViewById(R.id.editSearch1);
        EditText text2 = (EditText) findViewById(R.id.editSearch2);

        Intent intent = getIntent();
        sdPOI=intent.getStringArrayExtra("sdPOI");
        gps = intent.getStringArrayExtra("gps");

        if(sdPOI != null) {
            sBld = sdPOI[0];
            sRoom = sdPOI[1];
            sName = sdPOI[2];
            dBld = sdPOI[3];
            dRoom = sdPOI[4];
            dName = sdPOI[5];
        }
        text1.setText(sName);
        text2.setText(dName);

        Log.i("startAft", sBld+sRoom+sName);
        Log.i("destAft",dBld+dRoom+dName);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //버튼이 눌렸을 때
                Intent intent = new Intent(getApplicationContext(), NavigationMap.class);
                if(gps!=null) {
                    intent.putExtra("gps", gps);
                }
                intent.putExtra("sdPOI", sdPOI);
                startActivity(intent); //액티비티 이동
            }
        });

        // 출발지 editText가 눌렸을 때
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NaviStartSearch.class);
                if(dBld!=null) {
                    String[] destPOI = {dBld, dRoom, dName};
                    intent.putExtra("destPOI", destPOI);
                }
                startActivity(intent); //액티비티 이동
            }
        });

        // 도착지 editText가 눌렸을 때
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), NaviDestSearch.class);
                if(sBld!=null) {
                    String[] startPOI = {sBld, sRoom, sName};
                    intent.putExtra("startPOI", startPOI);
                }
                if(gps!=null){
                    intent.putExtra("gps", gps);
                }
                startActivity(intent); //액티비티 이동
            }
        });
    }
}