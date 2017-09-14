package com.example.longyuan.my_realm_university_mvvm.university;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.longyuan.my_realm_university_mvvm.R;
import com.example.longyuan.my_realm_university_mvvm.databinding.UniversityItemBinding;
import com.example.longyuan.my_realm_university_mvvm.model.University;

import java.util.List;

/**
 * Created by LONGYUAN on 2017/9/14.
 */

public class UniversityAdapter extends RecyclerView.Adapter<UniversityAdapter.UniversityAdapterHolder> {


    private List<University> mUniversities;

    private Context mContext;

    public UniversityAdapter(List<University> universities, Context context) {
        this.mUniversities = universities;
        this.mContext = context;
    }

    @Override
    public UniversityAdapterHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        UniversityItemBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.university_item,
                parent,
                false
                );


        return new UniversityAdapterHolder(binding);
    }

    @Override
    public void onBindViewHolder(UniversityAdapterHolder holder, int position) {

        University university = mUniversities.get(position);

        holder.binding.setAvm(new UniversityViewModel(university,mContext));
    }

    @Override
    public int getItemCount() {
        return mUniversities.size();
    }

    public static class UniversityAdapterHolder extends RecyclerView.ViewHolder{

        private UniversityItemBinding binding;

        public UniversityAdapterHolder(UniversityItemBinding binding) {
            super(binding.contactCard);
            this.binding = binding;
        }
    }
}
