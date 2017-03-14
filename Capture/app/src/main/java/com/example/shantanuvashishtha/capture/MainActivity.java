package com.example.shantanuvashishtha.capture;

import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button) findViewById(R.id.configure);
        Button b2 = (Button) findViewById(R.id.send);
        Button b3 = (Button) findViewById(R.id.camera);
        Button b4 = (Button) findViewById(R.id.exit);

        // This button is for configuration. Pressing this button will lead to another activity.

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i1 = new Intent(MainActivity.this, config.class);    // This will tell the intent about the source and destination
                startActivity(i1);                                          // This will start the activity.

            }
        });


        // This button is for sending the clicked picture. This will be removed from the main page.

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(), "Not yet configured", Toast.LENGTH_LONG).show();

            }
        });


        // This button is for going to the camera activity (or page).

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i3 = new Intent(MainActivity.this, camera.class);
                startActivity(i3);

            }
        });


        // This button is used for exiting the application

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
                System.exit(0);

            }
        });
    }

    /********************* Check if this device has a camera ***********************/

    private boolean checkCameraHardware(Context context) {
        if (context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)){
            // this device has a camera
            return true;
        } else {
            // no camera on this device
            return false;
        }
    }

}
