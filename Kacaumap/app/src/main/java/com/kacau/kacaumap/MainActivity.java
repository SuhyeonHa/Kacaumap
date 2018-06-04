package com.kacau.kacaumap;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.ActivityCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.skt.Tmap.TMapGpsManager;
import com.skt.Tmap.TMapMarkerItem;
import com.skt.Tmap.TMapPOIItem;
import com.skt.Tmap.TMapPoint;
import com.skt.Tmap.TMapView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,TMapGpsManager.onLocationChangedCallback{

    private boolean m_bTrackingMode = true;
    private TMapGpsManager tmapgps = null;
    private TMapView tMapView = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        LinearLayout contentTmap = (LinearLayout)findViewById(R.id.contentTmap);
        tMapView = new TMapView(this);
        tMapView.setSKTMapApiKey( "28f96670-7443-42b8-ba92-6cf3e2b1e8f2" );
        contentTmap.addView( tMapView );
        tMapView.setCenterPoint(126.956895, 37.504242);
        tMapView.setZoomLevel(17);
        tMapView.setMapType(TMapView.MAPTYPE_STANDARD);
        tMapView.setLanguage(TMapView.LANGUAGE_KOREAN);
        //지도

        //Bitmap gpsmarker = BitmapFactory.decodeResource(getResources(),R.drawable.gpsmarker);
        tMapView.setIconVisibility(true);
        //tMapView.setIcon(gpsmarker);
        tmapgps= new TMapGpsManager(MainActivity.this);
        tmapgps.setMinTime(1000);
        tmapgps.setMinDistance(5);
        tmapgps.setProvider(tmapgps.NETWORK_PROVIDER);
        setGps();
//        tMapView.setTrackingMode(true);
        tMapView.setCompassMode(true);
        tMapView.setSightVisible(true);
/////////////////////////////////////////
//        Edges edges=new Edges();
//        tMapView.addTMapPolyLine("1", edges.n1n2.tMapPolyLine);
//        tMapView.addTMapPolyLine("2", edges.n2n3.tMapPolyLine);
//        tMapView.addTMapPolyLine("3", edges.n2n9.tMapPolyLine);
//        tMapView.addTMapPolyLine("4", edges.n3n4.tMapPolyLine);
//        tMapView.addTMapPolyLine("5", edges.n3n44.tMapPolyLine);
//        tMapView.addTMapPolyLine("6", edges.n4n5.tMapPolyLine);
//        tMapView.addTMapPolyLine("7", edges.n4n43.tMapPolyLine);
//        tMapView.addTMapPolyLine("8", edges.n5n6.tMapPolyLine);
//        tMapView.addTMapPolyLine("9", edges.n5n45.tMapPolyLine);
//        tMapView.addTMapPolyLine("10", edges.n6n7.tMapPolyLine);
//        tMapView.addTMapPolyLine("11", edges.n6n46.tMapPolyLine);
//        tMapView.addTMapPolyLine("12", edges.n7n8.tMapPolyLine);
//        tMapView.addTMapPolyLine("13", edges.n7n47.tMapPolyLine);
//        tMapView.addTMapPolyLine("14", edges.n8n9.tMapPolyLine);
//        tMapView.addTMapPolyLine("15", edges.n8n17.tMapPolyLine);
//        tMapView.addTMapPolyLine("16", edges.n9n10.tMapPolyLine);
//        tMapView.addTMapPolyLine("17", edges.n10n11.tMapPolyLine);
//        tMapView.addTMapPolyLine("18", edges.n10n48.tMapPolyLine);
//        tMapView.addTMapPolyLine("19", edges.n10n49.tMapPolyLine);
//        tMapView.addTMapPolyLine("20", edges.n11n12.tMapPolyLine);
//        tMapView.addTMapPolyLine("21", edges.n11n50.tMapPolyLine);
//        tMapView.addTMapPolyLine("22", edges.n12n13.tMapPolyLine);
//        tMapView.addTMapPolyLine("23", edges.n12n14.tMapPolyLine);
//        tMapView.addTMapPolyLine("24", edges.n13n15.tMapPolyLine);
//        tMapView.addTMapPolyLine("25", edges.n13n16.tMapPolyLine);
//        tMapView.addTMapPolyLine("26", edges.n15n20.tMapPolyLine);
//        tMapView.addTMapPolyLine("27", edges.n15n51.tMapPolyLine);
//        tMapView.addTMapPolyLine("28", edges.n16n17.tMapPolyLine);
//        tMapView.addTMapPolyLine("29", edges.n16n18.tMapPolyLine);
//        tMapView.addTMapPolyLine("30", edges.n17n58.tMapPolyLine);
//        tMapView.addTMapPolyLine("31", edges.n18n19.tMapPolyLine);
//        tMapView.addTMapPolyLine("32", edges.n18n43.tMapPolyLine);
//        tMapView.addTMapPolyLine("33", edges.n19n20.tMapPolyLine);
//        tMapView.addTMapPolyLine("34", edges.n19n22.tMapPolyLine);
//        tMapView.addTMapPolyLine("35", edges.n19n41.tMapPolyLine);
//        tMapView.addTMapPolyLine("36", edges.n20n21.tMapPolyLine);
//        tMapView.addTMapPolyLine("37", edges.n21n22.tMapPolyLine);
//        tMapView.addTMapPolyLine("38", edges.n21n38.tMapPolyLine);
//        tMapView.addTMapPolyLine("39", edges.n22n23.tMapPolyLine);
//        tMapView.addTMapPolyLine("40", edges.n23n24.tMapPolyLine);
//        tMapView.addTMapPolyLine("41", edges.n23n34.tMapPolyLine);
//        tMapView.addTMapPolyLine("42", edges.n23n38.tMapPolyLine);
//        tMapView.addTMapPolyLine("43", edges.n24n25.tMapPolyLine);
//        tMapView.addTMapPolyLine("44", edges.n24n53.tMapPolyLine);
//        tMapView.addTMapPolyLine("45", edges.n25n26.tMapPolyLine);
//        tMapView.addTMapPolyLine("46", edges.n25n54.tMapPolyLine);
//        tMapView.addTMapPolyLine("47", edges.n26n27.tMapPolyLine);
//        tMapView.addTMapPolyLine("48", edges.n26n55.tMapPolyLine);
//        tMapView.addTMapPolyLine("49", edges.n27n28.tMapPolyLine);
//        tMapView.addTMapPolyLine("50", edges.n27n30.tMapPolyLine);
//        tMapView.addTMapPolyLine("51", edges.n28n29.tMapPolyLine);
//        tMapView.addTMapPolyLine("52", edges.n28n56.tMapPolyLine);
//        tMapView.addTMapPolyLine("53", edges.n30n31.tMapPolyLine);
//        tMapView.addTMapPolyLine("54", edges.n31n32.tMapPolyLine);
//        tMapView.addTMapPolyLine("55", edges.n32n33.tMapPolyLine);
//        tMapView.addTMapPolyLine("56", edges.n32n34.tMapPolyLine);
//        tMapView.addTMapPolyLine("57", edges.n33n35.tMapPolyLine);
//        tMapView.addTMapPolyLine("58", edges.n34n37.tMapPolyLine);
//        tMapView.addTMapPolyLine("59", edges.n35n36.tMapPolyLine);
//        tMapView.addTMapPolyLine("60", edges.n35n39.tMapPolyLine);
//        tMapView.addTMapPolyLine("61", edges.n36n37.tMapPolyLine);
//        tMapView.addTMapPolyLine("62", edges.n37n42.tMapPolyLine);
//        tMapView.addTMapPolyLine("63", edges.n39n40.tMapPolyLine);
//        tMapView.addTMapPolyLine("64", edges.n39n43.tMapPolyLine);
//        tMapView.addTMapPolyLine("65", edges.n40n41.tMapPolyLine);
//        tMapView.addTMapPolyLine("66", edges.n40n52.tMapPolyLine);
//        tMapView.addTMapPolyLine("67", edges.n41n42.tMapPolyLine);
//        tMapView.addTMapPolyLine("68", edges.n42n57.tMapPolyLine);
//
//
/////////////////////////////////////////
        Button searchbtn = (Button) findViewById(R.id.searchbtn);
        searchbtn.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, Search.class);
                        EditText editSearch1 = (EditText)findViewById(R.id.editSearch1);
                        String keyword=editSearch1.getText().toString();
                        intent.putExtra("SearchKeywordOnMap", keyword);
                        startActivity(intent);
                    }
                }
        );
        //버튼누르면 값전달과함께 화면전환

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    public void setGps() {
        final LocationManager lm = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
        if (!lm.isProviderEnabled(LocationManager.GPS_PROVIDER)||ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED &&
                ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            GpsManager gpsManager=new GpsManager(MainActivity.this);
            gpsManager.showSettingsAlert();
                ActivityCompat.requestPermissions(MainActivity.this, new String[]{android.Manifest.permission.ACCESS_COARSE_LOCATION, android.Manifest.permission.ACCESS_FINE_LOCATION}, 1);
                Toast.makeText(MainActivity.this, "위치정보를 받아올 수 없습니다.", Toast.LENGTH_SHORT).show();
        }
        else {
            lm.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, // 등록할 위치제공자(실내에선 NETWORK_PROVIDER 권장)
                    1000, // 통지사이의 최소 시간간격 (miliSecond)
                    1, // 통지사이의 최소 변경거리 (m)
                    mLocationListener);
        }
    }

    private final LocationListener mLocationListener = new LocationListener() {
        public void onLocationChanged(Location location) {

            if (location != null) {
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                tMapView.setLocationPoint(longitude, latitude);
                tMapView.setCenterPoint(longitude, latitude);
            }

        }

        public void onProviderDisabled(String provider) {
        }

        public void onProviderEnabled(String provider) {
        }

        public void onStatusChanged(String provider, int status, Bundle extras) {
        }
    };


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
            Intent intent = new Intent(MainActivity.this, Search.class);
            startActivity(intent);
        } else if (id == R.id.nav_navigation) {
            Intent intent = new Intent(MainActivity.this, Navigation.class);
            startActivity(intent);
        } else if (id == R.id.nav_adminlogin) {
            Intent intent = new Intent(MainActivity.this, ManagerLogin.class);
            startActivity(intent);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onLocationChange(Location location) {
        if (m_bTrackingMode){
            tMapView.setLocationPoint(location.getLongitude(),location.getLatitude());
        }
    }
}