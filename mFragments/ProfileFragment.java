package com.example.subeksha.shopar.mFragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.subeksha.shopar.R;

/**
 * Created by Subeksha on 11/13/16.
 */
public class ProfileFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.profile_fragment,container,false);

        return rootView;
    }
}
