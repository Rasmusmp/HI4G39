package com.example.rasmus.hi4g39;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * Created by Rasmus on 09-05-2015.
 *
 * References:
 * listView:
 * http://theopentutorials.com/tutorials/android/listview/android-create-listview-in-xml-and-populate-items-using-arrayadapter/
 * http://www.vogella.com/tutorials/AndroidListView/article.html#listactivity
 *
 * Fragment -> Activity communication:
 * http://simpledeveloper.com/how-to-communicate-between-fragments-and-activities/
 */


public class MenuFragment extends Fragment implements AdapterView.OnItemClickListener{

    public MenuFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_menu, container, false);

        ListView listView = (ListView) view.findViewById(R.id.series_listView);
        String[] series = getResources().getStringArray(R.array.series_array);

        listView.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, series));
        listView.setOnItemClickListener(this);

        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        //Toast.makeText(getActivity(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();

        try {
            ((SeriesSelectorInterface) getActivity()).onItemPicked(view);
        }catch (ClassCastException cce){}

    }

}
