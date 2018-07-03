package com.example.catarina.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of must see places in the city.
 */
public class MustSeeFragment extends Fragment {


    public MustSeeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.attraction_list, container, false);
        // Create a list of must see attractions
        final ArrayList<Attraction> attractions = new ArrayList<Attraction>();
        attractions.add(new Attraction(R.string.name_diana, R.string.descr_diana,
                R.drawable.diana));
        attractions.add(new Attraction(R.string.name_giraldo, R.string.descr_giraldo,
                R.drawable.giraldo));
        attractions.add(new Attraction(R.string.name_jardim, R.string.descr_jardim,
                R.drawable.jardim));
        attractions.add(new Attraction(R.string.name_aqueduct, R.string.descr_aqueduct,
                R.drawable.aqueduto));
        attractions.add(new Attraction(R.string.name_streets, R.string.descr_streets,
                R.drawable.streets));
        attractions.add(new Attraction(R.string.name_university, R.string.descr_university,
                R.drawable.universidade));
        attractions.add(new Attraction(R.string.name_moura, R.string.descr_moura,
                R.drawable.moura));

        // Create an {@link AttractionAdapter}, whose data source is a list of {@link Attraction}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionAdapter adapter = new AttractionAdapter(getActivity(), attractions, R.color.category_mustSee);

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
