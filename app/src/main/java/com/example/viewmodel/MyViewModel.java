package com.example.viewmodel;

import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

    int count=0;
    public void increaseCount() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
