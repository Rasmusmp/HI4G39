package com.example.rasmus.hi4g39;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class ContentActivity extends FragmentActivity {

    String msg = "Rasmus Logging ";

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

}
