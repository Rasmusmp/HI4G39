package com.example.rasmus.hi4g39;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;



/*
* listView ref: http://theopentutorials.com/tutorials/android/listview/android-create-listview-in-xml-and-populate-items-using-arrayadapter/
*  hhh
*/

public class MainActivity extends FragmentActivity implements SeriesSelectorInterface {

    String msg = "Rasmus Logging ";

    private String item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onItemPicked(View view){
        //Do something with list item clicked
        Toast.makeText(getApplicationContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();


        Intent itemIntent = new Intent(this, ContentActivity.class);
        itemIntent.putExtra("item", ((TextView) view).getText());
        startActivity(itemIntent);
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

    @Override
    public void onItemReceived(String string) {

    }
}
