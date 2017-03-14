package com.example.shantanuvashishtha.capture;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class camera extends AppCompatActivity {

    int new_pic = 1;

    Button b1, b2, b3;

    ImageView image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        b1 = (Button) findViewById(R.id.cancel);
        b2 = (Button) findViewById(R.id.again);
        b3 = (Button) findViewById(R.id.ok);


        /*
        b1.setVisibility(View.VISIBLE);
        b2.setVisibility(View.VISIBLE);
        b3.setVisibility(View.VISIBLE);
        */

        image1 = (ImageView) findViewById(R.id.image);


        Intent i6 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (i6.resolveActivity(getPackageManager()) != null)
        {
            startActivityForResult(i6, 1);
        }


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i2 = new Intent(camera.this, MainActivity.class);
                startActivityForResult(i2, 1);

            }
        });


        // This button will again click the image.

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i3 = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(i3, new_pic);

            }
        });


        // This button will send the clicked image to the network.

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Sending the image to the server", Toast.LENGTH_LONG).show();

            }
        });

        // This button will direct to the main page of the application.


    }




    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        b1.setVisibility(View.VISIBLE);
        b2.setVisibility(View.VISIBLE);
        b3.setVisibility(View.VISIBLE);

        image1.setVisibility(View.VISIBLE);

    }



}
