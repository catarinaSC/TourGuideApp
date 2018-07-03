package com.example.catarina.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SleepFragment extends Fragment {


    public SleepFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.attraction_list, container, false);
        // Create a list of options to sleep
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.name_ar, R.string.descr_ar,
                R.drawable.ar));
        attractions.add(new Attraction(R.string.name_pousada, R.string.descr_pousada,
                R.drawable.pousada));
        attractions.add(new Attraction(R.string.name_stone, R.string.descr_stone,
                R.drawable.stone));
        attractions.add(new Attraction(R.string.name_solar, R.string.descr_solar,
                R.drawable.solar));
        attractions.add(new Attraction(R.string.name_dom, R.string.descr_dom,
                R.drawable.dom));
        attractions.add(new Attraction(R.string.name_moov, R.string.descr_moov,
                R.drawable.moov));
        attractions.add(new Attraction(R.string.name_ibis, R.string.descr_ibis,
                R.drawable.ibis));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_sleep);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // attraction_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link AttractionAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Attraction} in the list.
        listView.setAdapter(adapter);

        return rootView;

    }

}
