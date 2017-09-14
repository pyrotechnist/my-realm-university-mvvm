package com.example.longyuan.my_realm_university_mvvm.university;

import android.app.Fragment;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.longyuan.my_realm_university_mvvm.R;
import com.example.longyuan.my_realm_university_mvvm.databinding.FragUniversityBinding;
import com.example.longyuan.my_realm_university_mvvm.model.University;

import java.util.ArrayList;
import java.util.List;

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

        FragUniversityBinding binding = DataBindingUtil.setContentView(getActivity(), R.layout.frag_university);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        binding.contactList.setLayoutManager(layoutManager);

        List<University> universities = new ArrayList<>();

        universities.add(new University("1","BIT","test"));

        UniversityAdapter adapter = new UniversityAdapter(universities, getActivity());
        binding.contactList.setAdapter(adapter);

        return binding.getRoot();
    }

    @Override
    public void onResume() {
        super.onResume();
    }


    public void setUniversityViewModel(UniversityViewModel universityViewModel) {
        this.mUniversityViewModel = universityViewModel;
    }
}
