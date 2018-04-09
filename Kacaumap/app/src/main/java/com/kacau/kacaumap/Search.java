package com.kacau.kacaumap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class Search extends AppCompatActivity {

    static  final  String[] LIST_MENU={"LIST9","LIST10","LIST11"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,LIST_MENU);
        ListView listview=(ListView)findViewById(R.id.listview2);
        listview.setAdapter(adapter);
        Intent intent =getIntent();

        EditText editSearch=(EditText)findViewById(R.id.editSearch);
        String keyword= intent.getStringExtra("editSearch1");

        editSearch.setText(keyword); //임시로 값띄워 값전달확인

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(Search.this, item, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Search.this, ResultMap.class);
                String[] POI={"37.503667","126.957139","5층"};//나중에 받을 list의 위치정보
                intent.putExtra("searchPOI", POI);
                startActivity(intent);


            }});
    }
}
