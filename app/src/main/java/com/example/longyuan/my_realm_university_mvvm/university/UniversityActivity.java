package com.example.longyuan.my_realm_university_mvvm.university;

import android.app.Activity;
import android.os.Bundle;

import com.example.longyuan.my_realm_university_mvvm.R;

public class UniversityActivity extends Activity {

    public static final String UNIVERSITIES_VIEWMODEL_TAG = "UNIVERSITIES_VIEWMODEL_TAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_university);

        UniversityFragment universityFragment = (UniversityFragment) getFragmentManager().findFragmentById(R.id.contentFrame_university);

        if(universityFragment == null)
        {
            universityFragment = UniversityFragment.getInstance();
            getFragmentManager().beginTransaction().add(R.id.contentFrame_university,universityFragment).commit();
        }


    }


}
