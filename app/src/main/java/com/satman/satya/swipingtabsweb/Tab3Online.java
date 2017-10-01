package com.satman.satya.swipingtabsweb;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by satya on 07-04-2017.
 */

public class Tab3Online extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.tab3online,container,false);
        return rootview;
    }


    @Override
    public void onStart() {
        super.onStart();


        Toast.makeText(getContext(),"tab3online",Toast.LENGTH_SHORT).show();



    }
}
