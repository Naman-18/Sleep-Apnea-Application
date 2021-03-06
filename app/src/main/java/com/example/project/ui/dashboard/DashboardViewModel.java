package com.example.project.ui.dashboard;

import android.widget.EditText;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DashboardViewModel extends ViewModel {

    private MutableLiveData<String> mText1;

    public DashboardViewModel() {
        mText1 = new MutableLiveData<>();
        mText1.setValue("Check Your Risk!");
    }


    public LiveData<String> getText1(){
        return mText1;

    }
}