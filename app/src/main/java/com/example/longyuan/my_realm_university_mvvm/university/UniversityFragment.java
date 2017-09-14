package com.example.longyuan.my_realm_university_mvvm.university;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by loxu on 14/09/2017.
 */

public class UniversityFragment extends Fragment {

    private UniversityViewModel mUniversityViewModel;

    public UniversityFragment() {

    }

    public static UniversityFragment getInstance(){

        return  new UniversityFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();
    }


    public void setUniversityViewModel(UniversityViewModel universityViewModel) {
        this.mUniversityViewModel = universityViewModel;
    }
}
