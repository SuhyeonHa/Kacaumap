package com.kacau.kacaumap;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class Navigation extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

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
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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
                if(dName.equals("")||dName==null) {
                    Toast.makeText(getApplicationContext(), "목적지를 입력해주세요!", Toast.LENGTH_LONG).show();}
                    else if(sName.equals("")||sName==null){
                    Toast.makeText(getApplicationContext(), "출발지를 입력해주세요!", Toast.LENGTH_LONG).show();
                }
                else {startActivity(intent);} //액티비티 이동

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

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

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
            Intent intent = new Intent(Navigation.this, Search.class);
            startActivity(intent);
        } else if (id == R.id.nav_navigation) {
            Intent intent = new Intent(Navigation.this, Navigation.class);
            startActivity(intent);
        } else if (id == R.id.nav_adminlogin) {
            Intent intent = new Intent(Navigation.this, ManagerLogin.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}