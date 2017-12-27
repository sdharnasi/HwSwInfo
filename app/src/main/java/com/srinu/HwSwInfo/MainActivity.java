package com.srinu.HwSwInfo;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonGetInfo;
    private TextView textViewSetInformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize the views
        initViews();
        //initialize the listeners
        initListeners();
    }
    private void initViews(){
        buttonGetInfo = (Button) findViewById(R.id.buttonGetInfo);
        textViewSetInformation = (TextView) findViewById(R.id.textViewSetInformation);

    }
    private void initListeners(){
        buttonGetInfo.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String information = getHardwareSoftwareInfo();
                textViewSetInformation.setText(information);
            }
        });
    }

    private String getHardwareSoftwareInfo(){
        return getString(R.string.serial) +" "+ Build.SERIAL +"\n" +
                getString(R.string.model) +" "+ Build.MODEL +"\n" +
                getString(R.string.id) +" "+ Build.ID +"\n" +
                getString(R.string.manufacturer) +" "+ Build.MANUFACTURER +"\n" +
                getString(R.string.brand) +" "+ Build.BRAND +"\n" +
                getString(R.string.type) +" "+ Build.TYPE +"\n" +
                getString(R.string.user) +" "+ Build.USER +"\n" +
                getString(R.string.base) +" "+ Build.VERSION_CODES.BASE +"\n" +
                getString(R.string.incremental) +" "+ Build.VERSION.INCREMENTAL +"\n" +
                getString(R.string.sdk) +" "+ Build.VERSION.SDK +"\n" +
                getString(R.string.board) +" "+ Build.BOARD +"\n" +
                getString(R.string.host) +" "+ Build.HOST +"\n" +
                getString(R.string.fingerprint) +" "+ Build.FINGERPRINT +"\n" +
                getString(R.string.version_code) +" "+ Build.VERSION.RELEASE +"\n";
    }



}
