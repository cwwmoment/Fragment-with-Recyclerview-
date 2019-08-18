package com.example.mahadi.frgmtandrcycle;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Mahadi on 3/7/2018.
 */

public class Frmt_fav extends Fragment{

    View v;

    public Frmt_fav() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fav_frmt,container,false);
        return v;
    }
}
