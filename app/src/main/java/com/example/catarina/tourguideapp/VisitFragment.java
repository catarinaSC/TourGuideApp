package com.example.catarina.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of places to visit in the city.
 */
public class VisitFragment extends Fragment {


    public VisitFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.attraction_list, container, false);
        // Create a list of visit attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.name_ossos, R.string.descr_ossos,
                R.drawable.ossos));
        attractions.add(new Attraction(R.string.name_museu, R.string.descr_museu,
                R.drawable.museu));
        attractions.add(new Attraction(R.string.name_almendres, R.string.descr_almendres,
                R.drawable.almendres));
        attractions.add(new Attraction(R.string.name_catedral, R.string.descr_catedral,
                R.drawable.catedral));
        attractions.add(new Attraction(R.string.name_francisco, R.string.descr_francisco,
                R.drawable.francisco));
        attractions.add(new Attraction(R.string.name_cadaval, R.string.descr_cadaval,
                R.drawable.cadaval));
        attractions.add(new Attraction(R.string.name_fundacao, R.string.descr_fundacao,
                R.drawable.fundacao));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_visit);

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
