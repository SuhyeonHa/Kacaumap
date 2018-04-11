package com.kacau.kacaumap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ManagerSearch extends AppCompatActivity {

    static  final  String[] LIST_MENU={"LIST9","LIST10","LIST11"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_list_item_1,LIST_MENU);

        ListView listview=(ListView)findViewById(R.id.listview);
        listview.setAdapter(adapter);


        listview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(ManagerSearch.this, item, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ManagerSearch.this, ManagerEdit.class);
                startActivity(intent);
            }});
    }
}
