package com.book.andrewisnew.onclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addSymbol(View view){
        EditText editText = findViewById(R.id.et);
        String symbol = (String) ((Button) view).getText();
        if((editText.getText().length() != 0 &&
                !editText.getText().toString().matches(".*\\+")) || !symbol.equals("+")) {
            editText.append(symbol);
        }
    }

    public void compute(View view){
        EditText et = findViewById(R.id.et);
        String text = et.getText().toString();
        if(!text.matches(".*\\+") || !text.contains("+")) {
            String[] numbers = text.split("\\+");
            int sum = 0;
            for (String number : numbers) {
                sum += Integer.parseInt(number);
            }
            et.setText(String.valueOf(sum));
        }
    }
}
