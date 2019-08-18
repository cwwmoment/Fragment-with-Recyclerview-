package com.example.mahadi.frgmtandrcycle;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mahadi on 3/7/2018.
 */

public class FrmtContact extends Fragment {

    View v;
    RecyclerView recyclerView;
    List<Contact> listCont;

    public FrmtContact() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.contact_frmt,container,false);
        recyclerView = (RecyclerView) v.findViewById(R.id.contact_recycleView);
        RecycleViewAdapter viewAdapter = new RecycleViewAdapter(getContext(), listCont);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(viewAdapter);
        return v;
    }

     @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listCont = new ArrayList<>();
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Smart Caiwei","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
        listCont.add(new Contact("Mahadi Hasan","01717677540",R.drawable.ic_launcher_background));
    }
}
