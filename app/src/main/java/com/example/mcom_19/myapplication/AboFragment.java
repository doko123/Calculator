package com.example.mcom_19.myapplication;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mcom_19.myapplication.IActivity;
import com.example.mcom_19.myapplication.R;

public class AboFragment extends Fragment {

    public IActivity iActivity;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        iActivity = (IActivity) activity;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.abo_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}
