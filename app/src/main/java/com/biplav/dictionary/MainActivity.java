package com.biplav.dictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

  private   AutoCompleteTextView actv;
 private    Button btn;
 private    ListView lv;
    private String WordAndMeaning[]={
            
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
