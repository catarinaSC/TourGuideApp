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
public class EatFragment extends Fragment {


    public EatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.attraction_list, container, false);
        // Create a list of eat options
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.name_botequim, R.string.descr_botequim));
        attractions.add(new Attraction(R.string.name_salsa, R.string.descr_salsa));
        attractions.add(new Attraction(R.string.name_janeiro, R.string.descr_janeiro));
        attractions.add(new Attraction(R.string.name_joaquim, R.string.descr_joaquim));
        attractions.add(new Attraction(R.string.name_quarta, R.string.descr_quarta));
        attractions.add(new Attraction(R.string.name_covas, R.string.descr_covas));
        attractions.add(new Attraction(R.string.name_nove, R.string.descr_nove));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_eat);

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
