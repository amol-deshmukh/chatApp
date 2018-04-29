package com.example.hp.chatapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by HP on 31-03-2018.
 */

public class Buttons extends AppCompatActivity {
     private Button allowButton;
     private Button denyButton;
     private Button chatroomButton;

      protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
          Log.v("@@@@","Buttons ");

        allowButton= (Button) findViewById(R.id.allowButton);
        denyButton=(Button) findViewById(R.id.denyButtom);
        chatroomButton=(Button) findViewById(R.id.denyButtom);

          allowButton.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent allowIntent = new Intent(Buttons.this,MainActivity.class);
                  startActivity(allowIntent);
                  Toast.makeText(getBaseContext(),"Door Opened!!!",Toast.LENGTH_SHORT).show();
              }
          });
            denyButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent denyIntent = new Intent(Buttons.this,MainActivity.class);
                    startActivity(denyIntent);
                    Toast.makeText(getBaseContext(),"Door remain Closed!!!",Toast.LENGTH_SHORT).show();

                }
            });
            chatroomButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent denyIntent = new Intent(Buttons.this,MainActivity.class);
                }
            });
      }



   /* public void allowButtonClicked(View view){

        Intent allowIntent = new Intent(Buttons.this,MainActivity.class);
        startActivity(allowIntent);

    }
    public void denyButtonClicked(View view){
        Intent denyIntent = new Intent(Buttons.this,MainActivity.class);
        startActivity(denyIntent);


    }
    public void chatroomButtonClicked(View view){
        Intent denyIntent = new Intent(Buttons.this,MainActivity.class);
    }*/
}
