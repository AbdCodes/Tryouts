package com.e.tryouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String TAG=MainActivity.class.getSimpleName();
    private EditText editTextSample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"in method onCreate");
//        android:id="@+id/editTextSample"


//        editTextSample=(EditText)findViewById(R.id.editTextSample);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG,"in method onStart");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG,"in method onPause");
    }

//    @Override
//    protected void onSaveInstanceState(Bundle outState){
//        super.onSaveInstanceState(outState);
//        Log.i(TAG,"in method onSaveInstance State_ABD");
//    }

//    @Override
//    protected void onRestoreInstanceState(Bundle SavedInstanceState){
//        super.onRestoreInstanceState(SavedInstanceState);
//        Log.i(TAG,"in method Restore InstanceState_ABD");
//    }
//
    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG,"in method onResume");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG,"in method onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG,"in method onDestroy");
    }

}
