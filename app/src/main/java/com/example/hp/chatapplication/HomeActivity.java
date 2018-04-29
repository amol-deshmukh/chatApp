package com.example.hp.chatapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Amol Deshmukh on 29/4/18.
 */

public class HomeActivity  extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_home);
        Log.v("@@@@","HomeActivity called");
        // TODO check if user is  already signed in

        if (!TextUtils.isEmpty(ChatPreferenceManager.instance(this).getUserName())){
            //username  is  present
            // Do  what  ever you want
            Toast.makeText(getApplicationContext(),"User is  laready signed in",Toast.LENGTH_LONG).show();
        }else {
            //User  is not signed in
            //  navigate to signin page
            Intent loginIntent=new Intent(HomeActivity.this,LoginActivity.class);
            startActivity(loginIntent);
        }
    }
}
