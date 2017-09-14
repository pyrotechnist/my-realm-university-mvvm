package com.example.longyuan.my_realm_university_mvvm.university;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.BindingAdapter;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableList;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.longyuan.my_realm_university_mvvm.model.University;

/**
 * Created by LONGYUAN on 2017/9/13.
 */

public class UniversityViewModel extends BaseObservable {

    //public final ObservableList<University> items = new ObservableArrayList<>();

    private University mUniversity;

    private Context mContext;

    public UniversityViewModel(
            University university,
            Context context) {
        mUniversity = university;
        mContext= context.getApplicationContext();

    }

    @BindingAdapter({"image"})
    public static void loadImage(ImageView view, String url) {
        Glide.with(view.getContext()).load(url).centerCrop().into(view);
    }

   public String getId(){
       return mUniversity.getId();
   }

    public String getName(){
        return mUniversity.getName();
    }

    public String getImageUrl() {
        return mUniversity.getImageUrl();
    }

}
