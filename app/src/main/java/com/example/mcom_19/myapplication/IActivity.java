package com.example.mcom_19.myapplication;

import android.app.Fragment;
import android.content.Context;

/**
 * Created by domik_000 on 2015-03-23.
 */
public interface IActivity {

    public void exit();
    public void replaceFragment(Fragment f);
    public Context getApplicationContext();
}
