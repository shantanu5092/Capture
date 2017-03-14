package com.example.shantanuvashishtha.capture;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class config extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        final EditText E1 = (EditText) findViewById(R.id.username);
        final EditText E2 = (EditText) findViewById(R.id.password);

        Button b1 = (Button) findViewById(R.id.login);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ((E1.getText().toString().equals("shantanu")) && (E2.getText().toString().equals("abcd")))
                {
                    Toast.makeText(getApplicationContext(), "Login successful", Toast.LENGTH_LONG).show();
                }
                else if (E1.getText().toString().equals(""))
                {
                    if (E2.getText().toString().equals(""))
                    {
                        Toast.makeText(getApplicationContext(), "No username and password entered", Toast.LENGTH_SHORT).show();

                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(), "No username entered", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Wrong username or password entered", Toast.LENGTH_LONG).show();
                }

            }
        });


    }
}
