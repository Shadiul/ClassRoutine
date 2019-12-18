package com.example.classroutine.ui.week_view;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WeekViewViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public WeekViewViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Week View");
    }

    public LiveData<String> getText() {
        return mText;
    }
}