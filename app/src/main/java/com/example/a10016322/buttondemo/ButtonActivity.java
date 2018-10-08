package com.example.a10016322.buttondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ButtonActivity extends AppCompatActivity
{

    Button textButton; //declare things up here (button, text, etc.)

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button_layout);

        textButton = (Button) (findViewById(R.id.button_id)); //cast it down here
        //add (Button) bc the other parentheses is not of the button class. it's of the superclass
    }

    public void onClickGo(View view)
    {
        textButton.setText("CLICKED");
    }
}
