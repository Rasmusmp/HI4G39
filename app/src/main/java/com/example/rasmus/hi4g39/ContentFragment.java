package com.example.rasmus.hi4g39;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


public class ContentFragment extends Fragment implements SeriesSelectorInterface{

    String msg = "Rasmus Logging ";
    TextView txtView;
    private String itemReceived;
    private SeriesSelectorInterface seriesSelector;



    public ContentFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_content, container, false);


        txtView = (TextView) view.findViewById(R.id.textViewA);
        updateInformation();

        return view;

    }


    public void updateInformation() {

        txtView.setText("blaaa     " + itemReceived);

    }



    @Override
    public void onItemReceived(String s) {
        //Do something with string received
        itemReceived = s;
        Log.d(msg, "ContentFrag: item: " + itemReceived);
    }


    @Override
    public void onItemPicked(View view) {

    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        try{
            seriesSelector = (SeriesSelectorInterface) activity;
        } catch (ClassCastException ex) {
            //Activity does not implement correct interface
            throw new ClassCastException(activity.toString() + " must implement MovieSelectorInterface");
        }

    }



}
