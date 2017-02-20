package com.example.subeksha.shopar.mFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.subeksha.shopar.R;
/**
 * Created by Subeksha on 11/13/16.
 */
public class NotificationFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.notification_fragment,container,false);

        return rootView;
    }
}
