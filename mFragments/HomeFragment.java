package com.example.subeksha.shopar.mFragments;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

import com.example.subeksha.shopar.AdapterHome;
import com.example.subeksha.shopar.BrandHome;
import com.example.subeksha.shopar.R;

import java.util.ArrayList;

/**
 *Created by Subeksha on 11/13/16.
 */
public class HomeFragment extends Fragment {
    Animation fade_in,fade_out;
    ViewFlipper viewFlipper;

    RecyclerView recyclerView;
    AdapterHome adapterHome;
    RecyclerView.LayoutManager layoutManager;
    String[] F_name_home = {"Hat","watch","shoe","bags"};
    String[] textView;
    int [] Img_res = {R.drawable.hat, R.drawable.watch,R.drawable.shoe,
            R.drawable.bags};
    int [] Image_id = {R.drawable.saree, R.drawable.fifth,R.drawable.big,
            R.drawable.camera};
    int [] Img2_res = {R.drawable.bags, R.drawable.shoe,R.drawable.watch,
            R.drawable.hat};
    int [] Image2_id = {R.drawable.saree, R.drawable.fifth,R.drawable.big,
            R.drawable.camera};

    ArrayList<BrandHome> list = new ArrayList<BrandHome>();
    private String detail;
    Context ctx;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.home_fragment, container, false);

        viewFlipper = (ViewFlipper) v.findViewById(R.id.backgroundViewFlipper1);

        fade_in= AnimationUtils.loadAnimation(getActivity(), R.anim.fade_in);
        fade_out=AnimationUtils.loadAnimation(getActivity(),R.anim.fade_out);

        viewFlipper.setAnimation(fade_in);
        viewFlipper.setAnimation(fade_out);

        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(2000);
        viewFlipper.startFlipping();


        super.onCreate(savedInstanceState);
        RecyclerView recyclerView = (RecyclerView) v.findViewById(R.id.my_recyclerView);
        textView = getResources().getStringArray(R.array.s_name_home);
        int i=0;

        for (String name : F_name_home)
        {
            BrandHome BrandHome = new BrandHome(Img_res[i], Img2_res[i],name, Image_id[i], Image2_id[i], textView[i]);
            list.add(BrandHome);
            i++;

        }


        adapterHome = new AdapterHome(list, getContext());
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);



        recyclerView.setAdapter(adapterHome);
        return v;


    }


}
