package com.shiftdev.deltaflyer.ui.Street;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StreetViewModel extends ViewModel {

     private MutableLiveData<String> mText;

     public StreetViewModel() {
          mText = new MutableLiveData<>();
          mText.setValue("Street fragment");
     }

     public LiveData<String> getText() {
          return mText;
     }
}