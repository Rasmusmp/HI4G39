package com.example.rasmus.hi4g39;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


/*
* listView ref: http://theopentutorials.com/tutorials/android/listview/android-create-listview-in-xml-and-populate-items-using-arrayadapter/
*
*/

public class MainActivity extends FragmentActivity implements AdapterView.OnItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView seriesListView = (ListView) findViewById(R.id.series_listView);
        String[] series = getResources().getStringArray(R.array.series_array);
        seriesListView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, series));
        seriesListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(getApplicationContext(), ((TextView) view).getText(),
                Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


}
