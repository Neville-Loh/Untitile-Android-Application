package com.neville.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String TAG = "ActivityOne";
//    TextView textView;

    ListView listView;
    ArrayAdapter<String> adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_listview);


        Log.i(TAG, "--onCreate--");

        //textView = (TextView) findViewById(R.id.textView);
        // to find the list view
        listView = (ListView) findViewById(R.id.listView);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
        adapter.add("Please");
        adapter.add("Send");
        adapter.add("Help");
        adapter.add("Feras");

        listView.setAdapter(adapter);

        // To implement a listenter
        // activity extend AdapterView.OnItemClickListener)
        // implement onItemClick method
        // listView.setONItemClickListener
        listView.setOnItemClickListener(this);

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "--onStart--");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "--onRestart--");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "--onResume--");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "--onPause--");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "--onStop--");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "--onDestroy--");
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
        String item = adapter.getItem(i);
        Toast.makeText(this, "You selected " + item,Toast.LENGTH_LONG).show();

        // making it on click on any item launches activitiy 2
        // Navigate from A1 to A2
        Intent intent = new Intent(MainActivity.this, ActivityTwo.class);
        startActivity(intent);
    }

//    public void clickHandler(View view){
//        // show up in longer duration of time
//        Date data = new Date();
//        textView.setText("Today is:" + data.toString());
//
//        Toast.makeText(this, "You Clicked Button", Toast.LENGTH_LONG).show();
//
//    }
}

