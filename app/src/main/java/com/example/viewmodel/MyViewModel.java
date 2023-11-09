package com.example.viewmodel;

import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

    private MutableLiveData<Integer> count = new MutableLiveData<>();

    public void increaseCount(View view) {
        int currentValue = count.getValue() !=null ? count.getValue() : 0;

        //Increase Value by 1
        count.setValue(currentValue+1);
    }

    public LiveData<Integer> getCount() {
        return count;
    }
}
