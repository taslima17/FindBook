package com.example.taslimarumky.findbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner =(Spinner)findViewById(R.id.spinner);
        List<String> list = new ArrayList<>();

        list.add("Bangla");
        list.add("English");
        list.add("General Knowledge");
        list.add("History");
        list.add("liberation war");
        list.add("Mathematics");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

       spinner.setAdapter(arrayAdapter);
       spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
           @Override
           public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               spinner.setSelection(position);
           }

           @Override
           public void onNothingSelected(AdapterView<?> parent) {

           }
       });


    }
}
