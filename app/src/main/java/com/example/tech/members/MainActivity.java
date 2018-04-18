package com.example.tech.members;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView registerScreen= (TextView) findViewById(R.id.link_to_register);

        //Listening to register new account link
        registerScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //switch to register screen
                Intent i = new Intent(getApplicationContext(),RegisterActivity.class);
                        startActivity(i);
            }
        });
    }

}
