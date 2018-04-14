package com.kacau.kacaumap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

public class ManagerLogin extends AppCompatActivity {


    public String response=null;
    String mId, mPassword;
    String mJsonString;
    private static final String TAG_JSON = "webnautes";
    ArrayList<HashMap<String, String>> mArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_manager_login);

        ////managersearch로 넘어가는 부분
        Button b = (Button) findViewById(R.id.loginButton);

        b.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                mId = ((EditText) (findViewById(R.id.idInput))).getText().toString();
                mPassword = ((EditText) (findViewById(R.id.passwordInput))).getText().toString();

                if (mId.equals("master")&&mPassword.equals("1234")) {

                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(ManagerLogin.this, "Login Success", Toast.LENGTH_SHORT).show();

                        }
                    });
                    Intent intent = new Intent(getApplicationContext(), ManagerSearch.class);
                    startActivity(intent);
                }
                else {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(ManagerLogin.this, "Login Fail", Toast.LENGTH_SHORT).show();

                        }
                    });
                }
            }
        });
    }
}
