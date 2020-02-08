package com.example.classroutine.ui.classwork;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ClassWorkViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ClassWorkViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Class Work fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}