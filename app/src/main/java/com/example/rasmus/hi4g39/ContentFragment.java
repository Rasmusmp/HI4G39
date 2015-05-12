package com.example.rasmus.hi4g39;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ContentFragment extends Fragment implements SeriesSelectorInterface{

    String msg = "Rasmus Logging ";

    private String itemReceived;

    public ContentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_content, container, false);

       // TextView itemTitle = (TextView) view.findViewById(R.id.content_title);
        //itemTitle.setText(itemReceived);

        TextView tvId = (TextView)view.findViewById(R.id.textViewA);
        tvId.setText("Information about " + itemReceived);

        return view;
    }


    @Override
    public void onItemReceived(String string) {
        //Do something with string received
        itemReceived = string;
        Log.d(msg, "ContentFrag: item: " + itemReceived);
        updateDescription(string);

    }

    public void updateDescription(String s) {

     tvId = s;

    }

    @Override
    public void onItemPicked(View view) {

    }

}
