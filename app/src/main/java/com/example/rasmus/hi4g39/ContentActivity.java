package com.example.rasmus.hi4g39;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class ContentActivity extends FragmentActivity implements SeriesSelectorInterface {

    String msg = "Rasmus Logging ";
    private String itemReceived;



    private String item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        item = getIntent().getStringExtra("item");

        Log.d(msg, "ContentAct: item: " + item);

        try {
            Log.d(msg, "Sending item: " + item);
            ((SeriesSelectorInterface) this).onItemReceived(item);
        }catch (ClassCastException cce){}

    }

    @Override
    public void onItemPicked(View view) {

    }

    @Override
    public void onItemReceived(String string) {
        //Do something with string received
        itemReceived = string;
        Log.d(msg, "ContentFrag: item: " + itemReceived);

    }
}
