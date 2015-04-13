package com.example.mcom_19.myapplication;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import static com.example.mcom_19.myapplication.R.id.ex_butt;

/**
 * Created by mcom-19 on 09.03.15.
 */
public class MyFragment extends Fragment {

    public IActivity iActivity;

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        iActivity = (IActivity) activity;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_my, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button sim = (Button)view.findViewById(R.id.sim_butt);
        Button adv = (Button)view.findViewById(R.id.adv_butt);
        Button abo = (Button)view.findViewById(R.id.abo_butt);
        Button exit = (Button)view.findViewById(ex_butt);



        exit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                iActivity.exit();

            }
        });
        sim.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                iActivity.replaceFragment(new SimFragment());
            }
        });
        adv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                iActivity.replaceFragment(new AdvFragment());
            }
        });
        abo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                iActivity.replaceFragment(new AboFragment());
            }
        });
    }
}
