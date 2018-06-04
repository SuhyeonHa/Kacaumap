package com.kacau.kacaumap;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.*;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import org.w3c.dom.Text;
import java.lang.reflect.Array;
import java.io.*;
import java.net.*;
import android.app.*;
import android.os.*;
import android.util.*;
import android.view.*;
import android.widget.*;
import android.app.ProgressDialog;

import android.content.Intent;
import android.os.AsyncTask;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.util.Log;

import android.view.View;

import android.widget.AdapterView;
import android.widget.Button;

import android.widget.EditText;

import android.widget.ListAdapter;

import android.widget.ListView;

import android.widget.SimpleAdapter;

import android.widget.TextView;
import android.widget.Toast;


import org.json.JSONArray;

import org.json.JSONException;

import org.json.JSONObject;


import java.io.BufferedReader;


import java.io.InputStream;

import java.io.InputStreamReader;


import java.io.OutputStream;

import java.net.HttpURLConnection;

import java.net.URL;

import java.util.ArrayList;

import java.util.HashMap;

import static android.R.attr.tag;


public class ManagerEdit extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    public String mBuilding,mRoomNum,mName,mPurpose,mDept,mTelephone;

    private static String TAG = "phpquerytest";
    String bld="";
    String room="";
    String name="";
    String purpose="";
    String dept="";
    String keyword="";
    String telephone="";

    int pPosition=0;
    int dPosition=0;

    TextView textview;
    EditText editText;
    EditText editText2;
    Button cButton;
    Button uButton;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_edit);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textview = (TextView)findViewById(R.id.bldroom);
        editText = (EditText)findViewById(R.id.name);
        editText2 = (EditText)findViewById(R.id.telephone);

        Intent intent = getIntent();
        bld = intent.getStringExtra("bld");
        room = intent.getStringExtra("room");
        name = intent.getStringExtra("name");
        purpose = intent.getStringExtra("purpose");
        dept = intent.getStringExtra("dept");
        telephone = intent.getStringExtra("telephone");
        keyword = intent.getStringExtra("keyword");

        textview.setText(bld+" "+room);
        editText.setText(name);
        editText2.setText(telephone);


        Spinner purposeSpinner = (Spinner)findViewById(R.id.spinner_purpose);
        ArrayAdapter purposeAdapter = ArrayAdapter.createFromResource(this,
                R.array.purpose, android.R.layout.simple_spinner_item);
        pPosition = purposeAdapter.getPosition(purpose);
        purposeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        purposeSpinner.setAdapter(purposeAdapter);
        purposeSpinner.setSelection(pPosition);

        Spinner deptSpinner = (Spinner)findViewById(R.id.spinner_dept);
        ArrayAdapter monthAdapter = ArrayAdapter.createFromResource(this,
                R.array.dept, android.R.layout.simple_spinner_item);
        dPosition = monthAdapter.getPosition(dept);
        monthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        deptSpinner.setAdapter(monthAdapter);
        deptSpinner.setSelection(dPosition);

        cButton = (Button) findViewById(R.id.cancel);
        uButton = (Button) findViewById(R.id.update);

        cButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ManagerEdit.this, ManagerSearch.class);
                intent.putExtra("keyword",keyword);
                startActivity(intent);
            }
        });
        uButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mBuilding=bld;
                mRoomNum=room;
                mName=((EditText)(findViewById(R.id.name))).getText().toString();
                mPurpose=((Spinner)(findViewById(R.id.spinner_purpose))).getSelectedItem().toString();
                mDept=((Spinner)(findViewById(R.id.spinner_dept))).getSelectedItem().toString();
                mTelephone=((EditText)(findViewById(R.id.telephone))).getText().toString();
                GetData task = new GetData();
                task.execute();

                Intent intent = new Intent(ManagerEdit.this, ManagerSearch.class);
                intent.putExtra("keyword",keyword);
                startActivity(intent);

            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }



    private class GetData extends AsyncTask<String, Void, String> {


        ProgressDialog progressDialog;

        String errorString = null;

        @Override

        protected void onPreExecute() {

            super.onPreExecute();

            progressDialog = ProgressDialog.show(ManagerEdit.this,

                    "Please Wait", null, true, true);

        }

        @Override

        protected void onPostExecute(String result) {

            super.onPostExecute(result);

            progressDialog.dismiss();


            Log.d(TAG, "response - " + result);



        }

        @Override

        protected String doInBackground(String... params) {


            String serverURL = "http://hyeonixd.cafe24.com/editQuery.php";


            StringBuffer buffer = new StringBuffer();

            buffer.append("building").append("=").append(mBuilding).append("&");                 // php 변수에 값 대입
            buffer.append("roomNum").append("=").append(mRoomNum).append("&");   // php 변수 앞에 '$' 붙이지 않는다
            buffer.append("name").append("=").append(mName).append("&");           // 변수 구분은 '&' 사용
            buffer.append("purpose").append("=").append(mPurpose).append("&");           // 변수 구분은 '&' 사용
            buffer.append("dept").append("=").append(mDept).append("&");           // 변수 구분은 '&' 사용
            buffer.append("telephone").append("=").append(mTelephone);


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

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_search) {
            Intent intent = new Intent(ManagerEdit.this, Search.class);
            startActivity(intent);
        } else if (id == R.id.nav_navigation) {
            Intent intent = new Intent(ManagerEdit.this, Navigation.class);
            startActivity(intent);
        } else if (id == R.id.nav_adminlogin) {
            Intent intent = new Intent(ManagerEdit.this, ManagerLogin.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}