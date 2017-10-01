package com.satman.satya.swipingtabsweb;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by satya on 07-04-2017.
 */

public class Tab2Chat extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootview = inflater.inflate(R.layout.tab2chat,container,false);
        return rootview;
    }


    @Override
    public void onResume() {
        super.onResume();


    }


   /* @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (hidden) {
            //do when hidden
            no();
        } else {
            //do when show
            yes();
        }
    }*/



    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if (isVisibleToUser) {
            // Do your Work

            Log.d("visibility","visible");


        } else {
            // Do your Work
            Log.d("visibility","invisible");

        }


    }


    void yes(){
        Toast.makeText(getContext(),"tab2chatvisible",Toast.LENGTH_SHORT).show();


    }

    void no(){
        Toast.makeText(getContext(),"tab2chatinvisible",Toast.LENGTH_SHORT).show();

    }


}

