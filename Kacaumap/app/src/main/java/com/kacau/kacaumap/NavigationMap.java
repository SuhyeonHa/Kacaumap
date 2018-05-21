package com.kacau.kacaumap;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.skt.Tmap.TMapGpsManager;
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

public class NavigationMap extends AppCompatActivity
        implements TMapGpsManager.onLocationChangedCallback{

    private boolean m_bTrackingMode = true;
    private TMapGpsManager tmapgps = null;
    private TMapView tMapView = null;
    String TAG="phpquerytest";
    String start;
    String dest;
    String[] gps;
    String[] sdPOI;
    String startNode;
    String finalNode;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_map);

        LinearLayout testTmap = (LinearLayout)findViewById(R.id.testmap);
        tMapView = new TMapView(this);
        tMapView.setSKTMapApiKey( "28f96670-7443-42b8-ba92-6cf3e2b1e8f2" );
        testTmap.addView( tMapView );
        tMapView.setCenterPoint(126.956895, 37.504242);
        tMapView.setZoomLevel(17);
        tMapView.setMapType(TMapView.MAPTYPE_STANDARD);
        tMapView.setLanguage(TMapView.LANGUAGE_KOREAN);
        //지도

        //tMapView.setCompassMode(true);
        Bitmap gpsmarker = BitmapFactory.decodeResource(getResources(),R.drawable.gpsmarker);
        tMapView.setIconVisibility(true);
        tMapView.setIcon(gpsmarker);
        tmapgps= new TMapGpsManager(NavigationMap.this);
        tmapgps.setMinTime(1000);
        tmapgps.setMinDistance(5);
        tmapgps.setProvider(tmapgps.NETWORK_PROVIDER);
        tmapgps.OpenGps();
        tMapView.setTrackingMode(true);
        tMapView.setSightVisible(true);
        //현재위치마커

        Intent intent = getIntent();
        gps=intent.getStringArrayExtra("gps");
        sdPOI=intent.getStringArrayExtra("sdPOI");

        if(gps!=null){  //내위치에서 검색
            GetNearNode getNearNode=new GetNearNode();
            getNearNode.execute(gps[0],gps[1]);

            TMapPoint tMapPoint1 = new TMapPoint(Double.parseDouble(gps[0]),Double.parseDouble(gps[1]));

            TMapMarkerItem startmarkerItem = new TMapMarkerItem();
            Bitmap startmarker = BitmapFactory.decodeResource(getResources(), R.drawable.startmarker);
            startmarkerItem.setIcon(startmarker); // 마커 아이콘 지정
            startmarkerItem.setPosition(0.5f, 1.0f); // 마커의 중심점을 중앙, 하단으로 설정
            startmarkerItem.setTMapPoint(tMapPoint1); // 마커의 좌표 지정
            startmarkerItem.setName("startMarker"); // 마커의 타이틀 지정
            tMapView.addMarkerItem("startMarker", startmarkerItem); // 지도에 마커 추가
        }
        else{
            BldToBldPath bldToBldPath =new BldToBldPath();
            bldToBldPath.execute(sdPOI[0],sdPOI[3]);
        }
    }
    @Override
    public void onLocationChange(Location location) {
        if (m_bTrackingMode){
            tMapView.setLocationPoint(location.getLongitude(),location.getLatitude());
            Log.i("asdg",Double.toString(location.getLongitude()) + Double.toString(location.getLatitude()));
        }
    }
    @NonNull
    private String substringBetween(String str, String open, String close) {
        if (str == null || open == null || close == null) {
            return "JsonIsNull";
        }
        int start = str.indexOf(open);
        if (start != -1) {
            int end = str.indexOf(close, start + open.length());
            if (end != -1) {
                return str.substring(start + open.length(), end);
            }
        }
        return "JsonIsNull";
    }

    private class GetNearNode extends AsyncTask<String, Void, String> {

        String latitude=null;
        String longitude=null;
        String NearNodeJsonString;
        String NodeId=null;
        ProgressDialog progressDialog;

        String errorString = null;

        @Override

        protected void onPreExecute() {

            super.onPreExecute();

            progressDialog = ProgressDialog.show(NavigationMap.this,

                    "Please Wait", null, true, true);

        }

        @Override

        protected void onPostExecute(String result) {

            super.onPostExecute(result);

            progressDialog.dismiss();

            Log.d(TAG, "response - " + result);

            if (result == null) {

                NearNodeJsonString="JsonIsNull";

            } else {

                NearNodeJsonString = result;
                this.NodeId=substringBetween(this.NearNodeJsonString,"nodeId\":\"","\"}");
                Toast.makeText(getApplicationContext(),"nearNode"+":"+NodeId,Toast.LENGTH_SHORT).show();
                UserToBldPath userToBldPath =new UserToBldPath();
                userToBldPath.execute(NodeId,sdPOI[3]);
            }
        }


        @Override
        protected String doInBackground(String... params) {

            this.latitude = params[0];
            this.longitude = params[1];

            String serverURL = "http://hyeonixd.cafe24.com/nearNodeQuery.php";

            StringBuffer buffer = new StringBuffer();

            buffer.append("latitude").append("=").append(latitude).append("&");
            buffer.append("longitude").append("=").append(longitude);


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

    private class  BldToBldPath extends AsyncTask<String, Void, String> {

        String departure=null;
        String arrival=null;
        String PathJsonString;
        String PathString;
        ArrayList<String> nodeOrder=new ArrayList<String>();
        ProgressDialog progressDialog;

        String errorString = null;

        @Override

        protected void onPreExecute() {

            super.onPreExecute();

            progressDialog = ProgressDialog.show(NavigationMap.this,

                    "Please Wait", null, true, true);

        }

        @Override

        protected void onPostExecute(String result) {

            super.onPostExecute(result);
            progressDialog.dismiss();

            Log.d(TAG, "response - " + result);

            if (result == null) {

                PathJsonString = "JsonIsNull";

            } else {
                PathJsonString = result;
                PathString = substringBetween(this.PathJsonString, "nodeOrder\":\"", "\"");
                startNode=substringBetween(this.PathJsonString, "departure\":\"", "\"");
                finalNode=substringBetween(this.PathJsonString, "arrival\":\"", "\"");

                String[] tempArray = PathString.split(",");
                for (int i = 0; i < tempArray.length; i++) {
                    this.nodeOrder.add(tempArray[i]);
                }
                for (int i = 0; i < nodeOrder.size() - 1; i++) {
                    start = nodeOrder.get(i);
                    dest = nodeOrder.get(i + 1);

                    if (start.compareTo(dest) > 0) {
                        String temp;
                        temp = start;
                        start = dest;
                        dest = temp;

                    }


                    Edges edges = new Edges();
                    if (start.equals("1")) {
                        if (dest.equals("2"))
                            tMapView.addTMapPolyLine("n1n2", edges.n1n2.tMapPolyLine);
                    } else if (start.equals("2")) {
                        if (dest.equals("3"))
                            tMapView.addTMapPolyLine("n2n3", edges.n2n3.tMapPolyLine);
                        else if (dest.equals("9"))
                            tMapView.addTMapPolyLine("n2n9", edges.n2n9.tMapPolyLine);
                    } else if (start.equals("3")) {
                        if (dest.equals("4"))
                            tMapView.addTMapPolyLine("n3n4", edges.n3n4.tMapPolyLine);
                        else if (dest.equals("44"))
                            tMapView.addTMapPolyLine("n3n44", edges.n3n44.tMapPolyLine);
                    } else if (start.equals("4")) {
                        if (dest.equals("5"))
                            tMapView.addTMapPolyLine("n4n5", edges.n4n5.tMapPolyLine);
                        else if (dest.equals("43"))
                            tMapView.addTMapPolyLine("n4n43", edges.n4n43.tMapPolyLine);
                    } else if (start.equals("5")) {
                        if (dest.equals("6"))
                            tMapView.addTMapPolyLine("n5n6", edges.n5n6.tMapPolyLine);
                        else if (dest.equals("45"))
                            tMapView.addTMapPolyLine("n5n45", edges.n5n45.tMapPolyLine);
                    }
                    else if (start.equals("6")) {
                        if (dest.equals("7"))
                            tMapView.addTMapPolyLine("n6n7", edges.n6n7.tMapPolyLine);
                        else if (dest.equals("46"))
                            tMapView.addTMapPolyLine("n6n46", edges.n6n46.tMapPolyLine);
                    }
                    else if (start.equals("7")) {
                        if (dest.equals("8"))
                            tMapView.addTMapPolyLine("n7n8", edges.n7n8.tMapPolyLine);
                        else if (dest.equals("47"))
                            tMapView.addTMapPolyLine("n7n47", edges.n7n47.tMapPolyLine);
                    }
                    else if (start.equals("8")) {
                        if (dest.equals("9"))
                            tMapView.addTMapPolyLine("n8n9", edges.n8n9.tMapPolyLine);
                        else if (dest.equals("17"))
                            tMapView.addTMapPolyLine("n8n17", edges.n8n17.tMapPolyLine);
                    }
                    else if (start.equals("9")) {
                        if (dest.equals("10"))
                            tMapView.addTMapPolyLine("n9n10", edges.n9n10.tMapPolyLine);
                    }
                    else if (start.equals("10")) {
                        if (dest.equals("11"))
                            tMapView.addTMapPolyLine("n10n11", edges.n10n11.tMapPolyLine);
                        else if (dest.equals("48"))
                            tMapView.addTMapPolyLine("n10n48", edges.n10n48.tMapPolyLine);
                        else if (dest.equals("49"))
                            tMapView.addTMapPolyLine("n10n49", edges.n10n49.tMapPolyLine);
                    }
                    else if (start.equals("11")) {
                        if (dest.equals("12"))
                            tMapView.addTMapPolyLine("n11n12", edges.n11n12.tMapPolyLine);
                        else if (dest.equals("50"))
                            tMapView.addTMapPolyLine("n11n50", edges.n11n50.tMapPolyLine);
                    }
                    else if (start.equals("12")) {
                        if (dest.equals("13"))
                            tMapView.addTMapPolyLine("n12n13", edges.n12n13.tMapPolyLine);
                        else if (dest.equals("14"))
                            tMapView.addTMapPolyLine("n12n14", edges.n12n14.tMapPolyLine);
                    }
                    else if (start.equals("13")) {
                        if (dest.equals("15"))
                            tMapView.addTMapPolyLine("n13n15", edges.n13n15.tMapPolyLine);
                        else if (dest.equals("16"))
                            tMapView.addTMapPolyLine("n13n16", edges.n13n16.tMapPolyLine);
                    }
                    else if (start.equals("15")) {
                        if (dest.equals("20"))
                            tMapView.addTMapPolyLine("n15n20", edges.n15n20.tMapPolyLine);
                        else if (dest.equals("51"))
                            tMapView.addTMapPolyLine("n15n51", edges.n15n51.tMapPolyLine);
                    }
                    else if (start.equals("16")) {
                        if (dest.equals("17"))
                            tMapView.addTMapPolyLine("n16n17", edges.n16n17.tMapPolyLine);
                        else if (dest.equals("18"))
                            tMapView.addTMapPolyLine("n16n18", edges.n16n18.tMapPolyLine);
                    }
                    else if (start.equals("18")) {
                        if (dest.equals("19"))
                            tMapView.addTMapPolyLine("n18n19", edges.n18n19.tMapPolyLine);
                        else if (dest.equals("43"))
                            tMapView.addTMapPolyLine("n18n43", edges.n18n43.tMapPolyLine);
                    }
                    else if (start.equals("19")) {
                        if (dest.equals("20"))
                            tMapView.addTMapPolyLine("n19n20", edges.n19n20.tMapPolyLine);
                        else if (dest.equals("22"))
                            tMapView.addTMapPolyLine("n19n22", edges.n19n22.tMapPolyLine);
                        else if (dest.equals("41"))
                            tMapView.addTMapPolyLine("n19n41", edges.n19n41.tMapPolyLine);
                    }
                    else if (start.equals("20")) {
                        if (dest.equals("21"))
                            tMapView.addTMapPolyLine("n20n21", edges.n20n21.tMapPolyLine);
                    }
                    else if (start.equals("21")) {
                        if (dest.equals("22"))
                            tMapView.addTMapPolyLine("n21n22", edges.n21n22.tMapPolyLine);
                        else if (dest.equals("38"))
                            tMapView.addTMapPolyLine("n21n38", edges.n21n38.tMapPolyLine);
                    }
                    else if (start.equals("22")) {
                        if (dest.equals("23"))
                            tMapView.addTMapPolyLine("n22n23", edges.n22n23.tMapPolyLine);
                    }
                    else if (start.equals("23")) {
                        if (dest.equals("24"))
                            tMapView.addTMapPolyLine("n23n24", edges.n23n24.tMapPolyLine);
                        else if (dest.equals("34"))
                            tMapView.addTMapPolyLine("n23n34", edges.n23n34.tMapPolyLine);
                        else if (dest.equals("38"))
                            tMapView.addTMapPolyLine("n23n38", edges.n23n38.tMapPolyLine);
                    }
                    else if (start.equals("24")) {
                        if (dest.equals("25"))
                            tMapView.addTMapPolyLine("n24n25", edges.n24n25.tMapPolyLine);
                        else if (dest.equals("53"))
                            tMapView.addTMapPolyLine("n24n53", edges.n24n53.tMapPolyLine);
                    }
                    else if (start.equals("25")) {
                        if (dest.equals("26"))
                            tMapView.addTMapPolyLine("n25n26", edges.n25n26.tMapPolyLine);
                        else if (dest.equals("54"))
                            tMapView.addTMapPolyLine("n25n54", edges.n25n54.tMapPolyLine);
                    }
                    else if (start.equals("26")) {
                        if (dest.equals("27"))
                            tMapView.addTMapPolyLine("n26n27", edges.n26n27.tMapPolyLine);
                        else if (dest.equals("55"))
                            tMapView.addTMapPolyLine("n26n55", edges.n26n55.tMapPolyLine);
                    }
                    else if (start.equals("27")) {
                        if (dest.equals("28"))
                            tMapView.addTMapPolyLine("n27n28", edges.n27n28.tMapPolyLine);
                        else if (dest.equals("30"))
                            tMapView.addTMapPolyLine("n27n30", edges.n27n30.tMapPolyLine);
                    }
                    else if (start.equals("28")) {
                        if (dest.equals("29"))
                            tMapView.addTMapPolyLine("n28n29", edges.n28n29.tMapPolyLine);
                        else if (dest.equals("56"))
                            tMapView.addTMapPolyLine("n28n56", edges.n28n56.tMapPolyLine);
                    }
                    else if (start.equals("30")) {
                        if (dest.equals("31"))
                            tMapView.addTMapPolyLine("n30n31", edges.n30n31.tMapPolyLine);
                    }
                    else if (start.equals("31")) {
                        if (dest.equals("32"))
                            tMapView.addTMapPolyLine("n31n32", edges.n31n32.tMapPolyLine);
                    }
                    else if (start.equals("32")) {
                        if (dest.equals("33"))
                            tMapView.addTMapPolyLine("n32n33", edges.n32n33.tMapPolyLine);
                        else if (dest.equals("34"))
                            tMapView.addTMapPolyLine("n32n34", edges.n32n34.tMapPolyLine);
                    }
                    else if (start.equals("33")) {
                        if (dest.equals("35"))
                            tMapView.addTMapPolyLine("n33n35", edges.n33n35.tMapPolyLine);
                    }
                    else if (start.equals("34")) {
                        if (dest.equals("37"))
                            tMapView.addTMapPolyLine("n34n37", edges.n34n37.tMapPolyLine);
                    }
                    else if (start.equals("35")) {
                        if (dest.equals("36"))
                            tMapView.addTMapPolyLine("n35n36", edges.n35n36.tMapPolyLine);
                        else if (dest.equals("39"))
                            tMapView.addTMapPolyLine("n35n39", edges.n35n39.tMapPolyLine);
                    }
                    else if (start.equals("36")) {
                        if (dest.equals("37"))
                            tMapView.addTMapPolyLine("n36n37", edges.n36n37.tMapPolyLine);
                    }
                    else if (start.equals("37")) {
                        if (dest.equals("42"))
                            tMapView.addTMapPolyLine("n37n42", edges.n37n42.tMapPolyLine);
                    }
                    else if (start.equals("39")) {
                        if (dest.equals("40"))
                            tMapView.addTMapPolyLine("n39n40", edges.n39n40.tMapPolyLine);
                        else if (dest.equals("43"))
                            tMapView.addTMapPolyLine("n39n43", edges.n39n43.tMapPolyLine);
                    }
                    else if (start.equals("40")) {
                        if (dest.equals("41"))
                            tMapView.addTMapPolyLine("n40n41", edges.n40n41.tMapPolyLine);
                        else if (dest.equals("52"))
                            tMapView.addTMapPolyLine("n40n52", edges.n40n52.tMapPolyLine);
                    }
                    else if (start.equals("41")) {
                        if (dest.equals("42"))
                            tMapView.addTMapPolyLine("n41n42", edges.n41n42.tMapPolyLine);
                    }
                    else if (start.equals("42")) {
                        if (dest.equals("57"))
                            tMapView.addTMapPolyLine("n42n57", edges.n42n57.tMapPolyLine);
                    }

                }
                GetNodeGps getNodeGps=new GetNodeGps(3);
                getNodeGps.execute(startNode);
                GetNodeGps getNodeGps1=new GetNodeGps(2);
                getNodeGps1.execute(finalNode);

            }
        }


        @Override
        protected String doInBackground(String... params) {

            this.departure = params[0];
            this.arrival = params[1];

            String serverURL = "http://hyeonixd.cafe24.com/navigationQuery.php";

            StringBuffer buffer = new StringBuffer();

            buffer.append("departure").append("=").append(departure).append("&");
            buffer.append("arrival").append("=").append(arrival);


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

    private class  UserToBldPath extends AsyncTask<String, Void, String> {

        String depNodeId=null;
        String arrival=null;
        String PathJsonString;
        String PathString;
        ArrayList<String> nodeOrder=new ArrayList<String>();
        ProgressDialog progressDialog;

        String errorString = null;

        @Override

        protected void onPreExecute() {

            super.onPreExecute();

            progressDialog = ProgressDialog.show(NavigationMap.this,

                    "Please Wait", null, true, true);

        }

        @Override

        protected void onPostExecute(String result) {

            super.onPostExecute(result);
            progressDialog.dismiss();

            Log.d(TAG, "response - " + result);

            if (result == null) {

                PathJsonString = "JsonIsNull";

            } else {
                PathJsonString = result;
                PathString = substringBetween(this.PathJsonString, "nodeOrder\":\"", "\"");
                startNode=substringBetween(this.PathJsonString, "departure\":\"", "\"");
                finalNode=substringBetween(this.PathJsonString, "arrival\":\"", "\"");

                String[] tempArray = PathString.split(",");
                for (int i = 0; i < tempArray.length; i++) {
                    this.nodeOrder.add(tempArray[i]);
                }
                for (int i = 0; i < nodeOrder.size() - 1; i++) {
                    start = nodeOrder.get(i);
                    dest = nodeOrder.get(i + 1);

                    if (start.compareTo(dest) > 0) {
                        String temp;
                        temp = start;
                        start = dest;
                        dest = temp;

                    }

                    Edges edges = new Edges();
                    if (start.equals("1")) {
                        if (dest.equals("2"))
                            tMapView.addTMapPolyLine("n1n2", edges.n1n2.tMapPolyLine);
                    } else if (start.equals("2")) {
                        if (dest.equals("3"))
                            tMapView.addTMapPolyLine("n2n3", edges.n2n3.tMapPolyLine);
                        else if (dest.equals("9"))
                            tMapView.addTMapPolyLine("n2n9", edges.n2n9.tMapPolyLine);
                    } else if (start.equals("3")) {
                        if (dest.equals("4"))
                            tMapView.addTMapPolyLine("n3n4", edges.n3n4.tMapPolyLine);
                        else if (dest.equals("44"))
                            tMapView.addTMapPolyLine("n3n44", edges.n3n44.tMapPolyLine);
                    } else if (start.equals("4")) {
                        if (dest.equals("5"))
                            tMapView.addTMapPolyLine("n4n5", edges.n4n5.tMapPolyLine);
                        else if (dest.equals("43"))
                            tMapView.addTMapPolyLine("n4n43", edges.n4n43.tMapPolyLine);
                    } else if (start.equals("5")) {
                        if (dest.equals("6"))
                            tMapView.addTMapPolyLine("n5n6", edges.n5n6.tMapPolyLine);
                        else if (dest.equals("45"))
                            tMapView.addTMapPolyLine("n5n45", edges.n5n45.tMapPolyLine);
                    }
                    else if (start.equals("6")) {
                        if (dest.equals("7"))
                            tMapView.addTMapPolyLine("n6n7", edges.n6n7.tMapPolyLine);
                        else if (dest.equals("46"))
                            tMapView.addTMapPolyLine("n6n46", edges.n6n46.tMapPolyLine);
                    }
                    else if (start.equals("7")) {
                        if (dest.equals("8"))
                            tMapView.addTMapPolyLine("n7n8", edges.n7n8.tMapPolyLine);
                        else if (dest.equals("47"))
                            tMapView.addTMapPolyLine("n7n47", edges.n7n47.tMapPolyLine);
                    }
                    else if (start.equals("8")) {
                        if (dest.equals("9"))
                            tMapView.addTMapPolyLine("n8n9", edges.n8n9.tMapPolyLine);
                        else if (dest.equals("17"))
                            tMapView.addTMapPolyLine("n8n17", edges.n8n17.tMapPolyLine);
                    }
                    else if (start.equals("9")) {
                        if (dest.equals("10"))
                            tMapView.addTMapPolyLine("n9n10", edges.n9n10.tMapPolyLine);
                    }
                    else if (start.equals("10")) {
                        if (dest.equals("11"))
                            tMapView.addTMapPolyLine("n10n11", edges.n10n11.tMapPolyLine);
                        else if (dest.equals("48"))
                            tMapView.addTMapPolyLine("n10n48", edges.n10n48.tMapPolyLine);
                        else if (dest.equals("49"))
                            tMapView.addTMapPolyLine("n10n49", edges.n10n49.tMapPolyLine);
                    }
                    else if (start.equals("11")) {
                        if (dest.equals("12"))
                            tMapView.addTMapPolyLine("n11n12", edges.n11n12.tMapPolyLine);
                        else if (dest.equals("50"))
                            tMapView.addTMapPolyLine("n11n50", edges.n11n50.tMapPolyLine);
                    }
                    else if (start.equals("12")) {
                        if (dest.equals("13"))
                            tMapView.addTMapPolyLine("n12n13", edges.n12n13.tMapPolyLine);
                        else if (dest.equals("14"))
                            tMapView.addTMapPolyLine("n12n14", edges.n12n14.tMapPolyLine);
                    }
                    else if (start.equals("13")) {
                        if (dest.equals("15"))
                            tMapView.addTMapPolyLine("n13n15", edges.n13n15.tMapPolyLine);
                        else if (dest.equals("16"))
                            tMapView.addTMapPolyLine("n13n16", edges.n13n16.tMapPolyLine);
                    }
                    else if (start.equals("15")) {
                        if (dest.equals("20"))
                            tMapView.addTMapPolyLine("n15n20", edges.n15n20.tMapPolyLine);
                        else if (dest.equals("51"))
                            tMapView.addTMapPolyLine("n15n51", edges.n15n51.tMapPolyLine);
                    }
                    else if (start.equals("16")) {
                        if (dest.equals("17"))
                            tMapView.addTMapPolyLine("n16n17", edges.n16n17.tMapPolyLine);
                        else if (dest.equals("18"))
                            tMapView.addTMapPolyLine("n16n18", edges.n16n18.tMapPolyLine);
                    }
                    else if (start.equals("18")) {
                        if (dest.equals("19"))
                            tMapView.addTMapPolyLine("n18n19", edges.n18n19.tMapPolyLine);
                        else if (dest.equals("43"))
                            tMapView.addTMapPolyLine("n18n43", edges.n18n43.tMapPolyLine);
                    }
                    else if (start.equals("19")) {
                        if (dest.equals("20"))
                            tMapView.addTMapPolyLine("n19n20", edges.n19n20.tMapPolyLine);
                        else if (dest.equals("22"))
                            tMapView.addTMapPolyLine("n19n22", edges.n19n22.tMapPolyLine);
                        else if (dest.equals("41"))
                            tMapView.addTMapPolyLine("n19n41", edges.n19n41.tMapPolyLine);
                    }
                    else if (start.equals("20")) {
                        if (dest.equals("21"))
                            tMapView.addTMapPolyLine("n20n21", edges.n20n21.tMapPolyLine);
                    }
                    else if (start.equals("21")) {
                        if (dest.equals("22"))
                            tMapView.addTMapPolyLine("n21n22", edges.n21n22.tMapPolyLine);
                        else if (dest.equals("38"))
                            tMapView.addTMapPolyLine("n21n38", edges.n21n38.tMapPolyLine);
                    }
                    else if (start.equals("22")) {
                        if (dest.equals("23"))
                            tMapView.addTMapPolyLine("n22n23", edges.n22n23.tMapPolyLine);
                    }
                    else if (start.equals("23")) {
                        if (dest.equals("24"))
                            tMapView.addTMapPolyLine("n23n24", edges.n23n24.tMapPolyLine);
                        else if (dest.equals("34"))
                            tMapView.addTMapPolyLine("n23n34", edges.n23n34.tMapPolyLine);
                        else if (dest.equals("38"))
                            tMapView.addTMapPolyLine("n23n38", edges.n23n38.tMapPolyLine);
                    }
                    else if (start.equals("24")) {
                        if (dest.equals("25"))
                            tMapView.addTMapPolyLine("n24n25", edges.n24n25.tMapPolyLine);
                        else if (dest.equals("53"))
                            tMapView.addTMapPolyLine("n24n53", edges.n24n53.tMapPolyLine);
                    }
                    else if (start.equals("25")) {
                        if (dest.equals("26"))
                            tMapView.addTMapPolyLine("n25n26", edges.n25n26.tMapPolyLine);
                        else if (dest.equals("54"))
                            tMapView.addTMapPolyLine("n25n54", edges.n25n54.tMapPolyLine);
                    }
                    else if (start.equals("26")) {
                        if (dest.equals("27"))
                            tMapView.addTMapPolyLine("n26n27", edges.n26n27.tMapPolyLine);
                        else if (dest.equals("55"))
                            tMapView.addTMapPolyLine("n26n55", edges.n26n55.tMapPolyLine);
                    }
                    else if (start.equals("27")) {
                        if (dest.equals("28"))
                            tMapView.addTMapPolyLine("n27n28", edges.n27n28.tMapPolyLine);
                        else if (dest.equals("30"))
                            tMapView.addTMapPolyLine("n27n30", edges.n27n30.tMapPolyLine);
                    }
                    else if (start.equals("28")) {
                        if (dest.equals("29"))
                            tMapView.addTMapPolyLine("n28n29", edges.n28n29.tMapPolyLine);
                        else if (dest.equals("56"))
                            tMapView.addTMapPolyLine("n28n56", edges.n28n56.tMapPolyLine);
                    }
                    else if (start.equals("30")) {
                        if (dest.equals("31"))
                            tMapView.addTMapPolyLine("n30n31", edges.n30n31.tMapPolyLine);
                    }
                    else if (start.equals("31")) {
                        if (dest.equals("32"))
                            tMapView.addTMapPolyLine("n31n32", edges.n31n32.tMapPolyLine);
                    }
                    else if (start.equals("32")) {
                        if (dest.equals("33"))
                            tMapView.addTMapPolyLine("n32n33", edges.n32n33.tMapPolyLine);
                        else if (dest.equals("34"))
                            tMapView.addTMapPolyLine("n32n34", edges.n32n34.tMapPolyLine);
                    }
                    else if (start.equals("33")) {
                        if (dest.equals("35"))
                            tMapView.addTMapPolyLine("n33n35", edges.n33n35.tMapPolyLine);
                    }
                    else if (start.equals("34")) {
                        if (dest.equals("37"))
                            tMapView.addTMapPolyLine("n34n37", edges.n34n37.tMapPolyLine);
                    }
                    else if (start.equals("35")) {
                        if (dest.equals("36"))
                            tMapView.addTMapPolyLine("n35n36", edges.n35n36.tMapPolyLine);
                        else if (dest.equals("39"))
                            tMapView.addTMapPolyLine("n35n39", edges.n35n39.tMapPolyLine);
                    }
                    else if (start.equals("36")) {
                        if (dest.equals("37"))
                            tMapView.addTMapPolyLine("n36n37", edges.n36n37.tMapPolyLine);
                    }
                    else if (start.equals("37")) {
                        if (dest.equals("42"))
                            tMapView.addTMapPolyLine("n37n42", edges.n37n42.tMapPolyLine);
                    }
                    else if (start.equals("39")) {
                        if (dest.equals("40"))
                            tMapView.addTMapPolyLine("n39n40", edges.n39n40.tMapPolyLine);
                        else if (dest.equals("43"))
                            tMapView.addTMapPolyLine("n39n43", edges.n39n43.tMapPolyLine);
                    }
                    else if (start.equals("40")) {
                        if (dest.equals("41"))
                            tMapView.addTMapPolyLine("n40n41", edges.n40n41.tMapPolyLine);
                        else if (dest.equals("52"))
                            tMapView.addTMapPolyLine("n40n52", edges.n40n52.tMapPolyLine);
                    }
                    else if (start.equals("41")) {
                        if (dest.equals("42"))
                            tMapView.addTMapPolyLine("n41n42", edges.n41n42.tMapPolyLine);
                    }
                    else if (start.equals("42")) {
                        if (dest.equals("57"))
                            tMapView.addTMapPolyLine("n42n57", edges.n42n57.tMapPolyLine);
                    }

                }
                GetNodeGps getNodeGps=new GetNodeGps(1);
                getNodeGps.execute(startNode);
                GetNodeGps getNodeGps1=new GetNodeGps(2);
                getNodeGps1.execute(finalNode);
                Toast.makeText(getApplicationContext(),"nodeOrder"+":"+PathString,Toast.LENGTH_SHORT).show();
            }
        }


        @Override
        protected String doInBackground(String... params) {

            this.depNodeId = params[0];
            this.arrival = params[1];

            String serverURL = "http://hyeonixd.cafe24.com/userNavigationQuery.php";

            StringBuffer buffer = new StringBuffer();

            buffer.append("nodeId").append("=").append(depNodeId).append("&");
            buffer.append("arrival").append("=").append(arrival);


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

    private class GetNodeGps extends AsyncTask<String, Void, String> {

        String NodeId=null;
        String JsonString;
        String latitude=null;
        String longitude=null;
        ProgressDialog progressDialog;
        String errorString = null;
        int useInfo;

        GetNodeGps(int useInfo){
            this.useInfo=useInfo;
        }

        @Override
        protected void onPreExecute() {

            super.onPreExecute();

            progressDialog = ProgressDialog.show(NavigationMap.this,

                    "Please Wait", null, true, true);

        }

        @Override

        protected void onPostExecute(String result) {

            super.onPostExecute(result);

            progressDialog.dismiss();

            Log.d(TAG, "response - " + result);

            if (result == null) {

                JsonString="JsonIsNull";

            } else {

                JsonString = result;
                latitude=substringBetween(JsonString,"latitude\":\"","\"");
                longitude=substringBetween(JsonString,"longitude\":\"","\"");
                TMapPoint tMapPoint1 = null;

                if(useInfo==1){
                    Edges edges=new Edges();
                    edges.newLine.drawLine(latitude,longitude,gps[0],gps[1]);
                    tMapView.addTMapPolyLine("startLine", edges.newLine.tMapPolyLine);
                }
                else if(useInfo==2){
                    tMapPoint1 = new TMapPoint(Double.parseDouble(latitude),Double.parseDouble(longitude));
                    //도착마커
                    TMapMarkerItem destmarkerItem = new TMapMarkerItem();
                    Bitmap destmarker = BitmapFactory.decodeResource(getResources(), R.drawable.destmarker);
                    destmarkerItem.setIcon(destmarker); // 마커 아이콘 지정
                    destmarkerItem.setPosition(0.5f, 1.0f); // 마커의 중심점을 중앙, 하단으로 설정
                    destmarkerItem.setTMapPoint(tMapPoint1); // 마커의 좌표 지정
                    destmarkerItem.setName("destMarker"); // 마커의 타이틀 지정
                    tMapView.addMarkerItem("destMarker", destmarkerItem); // 지도에 마커 추가
                }
                else {  //출발마커
                    tMapPoint1 = new TMapPoint(Double.parseDouble(latitude),Double.parseDouble(longitude));
                    TMapMarkerItem startmarkerItem = new TMapMarkerItem();
                    Bitmap startmarker = BitmapFactory.decodeResource(getResources(), R.drawable.startmarker);
                    startmarkerItem.setIcon(startmarker); // 마커 아이콘 지정
                    startmarkerItem.setPosition(0.5f, 1.0f); // 마커의 중심점을 중앙, 하단으로 설정
                    startmarkerItem.setTMapPoint(tMapPoint1); // 마커의 좌표 지정
                    startmarkerItem.setName("startMarker"); // 마커의 타이틀 지정
                    tMapView.addMarkerItem("startMarker", startmarkerItem); // 지도에 마커 추가
                }
            }
        }


        @Override
        protected String doInBackground(String... params) {

            this.NodeId = params[0];

            String serverURL = "http://hyeonixd.cafe24.com/nodeGpsQuery.php";

            StringBuffer buffer = new StringBuffer();

            buffer.append("nodeId").append("=").append(NodeId);


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

