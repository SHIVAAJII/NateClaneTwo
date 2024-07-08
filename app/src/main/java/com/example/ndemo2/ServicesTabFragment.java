package com.example.ndemo2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class ServicesTabFragment extends Fragment {

    View view;
    ListView listView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_businesses_tab, container, false);


        listView=(ListView) view.findViewById(R.id.businesses_listViewId);

        ArrayList arrayList=new ArrayList();
        arrayList.add(new ClassForAddTwoItem(R.drawable.pk,"pramod one"));
        arrayList.add(new ClassForAddTwoItem(R.drawable.pk1,"pramod Two"));
        arrayList.add(new ClassForAddTwoItem(R.drawable.pk2,"pramod three"));
        arrayList.add(new ClassForAddTwoItem(R.drawable.pk3,"pramod four"));
        arrayList.add(new ClassForAddTwoItem(R.drawable.pk4,"pramod five"));
        arrayList.add(new ClassForAddTwoItem(R.drawable.pk,"pramod one"));
        arrayList.add(new ClassForAddTwoItem(R.drawable.pk1,"pramod Two"));
        arrayList.add(new ClassForAddTwoItem(R.drawable.pk2,"pramod three"));
        arrayList.add(new ClassForAddTwoItem(R.drawable.pk3,"pramod four"));
        arrayList.add(new ClassForAddTwoItem(R.drawable.pk4,"pramod five"));
        arrayList.add(new ClassForAddTwoItem(R.drawable.pk,"pramod one"));
        arrayList.add(new ClassForAddTwoItem(R.drawable.pk1,"pramod Two"));
        arrayList.add(new ClassForAddTwoItem(R.drawable.pk2,"pramod three"));
        arrayList.add(new ClassForAddTwoItem(R.drawable.pk3,"pramod four"));
        arrayList.add(new ClassForAddTwoItem(R.drawable.pk4,"pramod five"));
        arrayList.add(new ClassForAddTwoItem(R.drawable.pk,"pramod one"));
        arrayList.add(new ClassForAddTwoItem(R.drawable.pk1,"pramod Two"));
        arrayList.add(new ClassForAddTwoItem(R.drawable.pk2,"pramod three"));
        arrayList.add(new ClassForAddTwoItem(R.drawable.pk3,"pramod four"));
        arrayList.add(new ClassForAddTwoItem(R.drawable.pk4,"pramod five"));

        AdapterForList adapterForList=new AdapterForList(getActivity(),R.layout.single_item_ui,arrayList);
        listView.setAdapter(adapterForList);


        return view;

    }
}