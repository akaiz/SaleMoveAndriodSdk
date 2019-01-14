package com.salemove.salemoveandriodlibdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.salemove.androidbundle.Main;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Main main = new Main();
        Log.d("LogHelloWorld",main.HelloWorldString());
        Log.d("LogRandomString",main.RandomString());
    }
}
