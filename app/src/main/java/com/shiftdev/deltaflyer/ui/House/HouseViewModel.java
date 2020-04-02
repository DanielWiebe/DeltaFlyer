package com.shiftdev.deltaflyer.ui.House;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HouseViewModel extends ViewModel {

     private MutableLiveData<String> mText;

     public HouseViewModel() {
          mText = new MutableLiveData<>();
          mText.setValue("House fragment");
     }

     public LiveData<String> getText() {
          return mText;
     }
}