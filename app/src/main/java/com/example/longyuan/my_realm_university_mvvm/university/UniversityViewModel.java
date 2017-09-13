package com.example.longyuan.my_realm_university_mvvm.university;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;

import com.example.longyuan.my_realm_university_mvvm.model.University;

/**
 * Created by LONGYUAN on 2017/9/13.
 */

public class UniversityViewModel extends BaseObservable {

    public final ObservableList<University> items = new ObservableArrayList<>();

    private Context mContext;

    public UniversityViewModel(
            //TasksRepository repository,
            Context context) {
            mContext = context.getApplicationContext(); // Force use of Application Context.
      //  mTasksRepository = repository;

        // Set initial state
        //setFiltering(TasksFilterType.ALL_TASKS);
    }

    public void start(){
        loadUniversity(false);
    }

    private void loadUniversity(boolean forceUpdate) {

    }

}
