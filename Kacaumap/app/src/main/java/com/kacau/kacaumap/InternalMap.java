package com.kacau.kacaumap;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class InternalMap extends AppCompatActivity{
    ViewPager pager;
    LinearLayout container;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internal_map);

        pager = (ViewPager) findViewById(R.id.pager);

        //ViewPager에 설정할 Adapter 객체 생성
        //ListView에서 사용하는 Adapter와 같은 역할.
        //다만. ViewPager로 스크롤 될 수 있도록 되어 있다는 것이 다름
        //PagerAdapter를 상속받은 CustomAdapter 객체 생성
        //CustomAdapter에게 LayoutInflater 객체 전달

        CustomAdapter adapter= new CustomAdapter(getLayoutInflater());

        //ViewPager에 Adapter 설정
        pager.setAdapter(adapter);

        // 층 버튼 나타내기
        container = (LinearLayout) findViewById(R.id.floorButtons);

        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.buttons_208,container,true);


    }

}