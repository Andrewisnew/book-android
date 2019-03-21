package com.book.andrewisnew.verticalhorisontalswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hey(View view){


        Toast toast = Toast.makeText(this, ((Button)view).getText(), Toast.LENGTH_SHORT);
        toast.show();
    }
}
