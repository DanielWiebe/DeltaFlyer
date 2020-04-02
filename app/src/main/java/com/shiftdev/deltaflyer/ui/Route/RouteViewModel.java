package com.shiftdev.deltaflyer.ui.Route;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class RouteViewModel extends ViewModel {

     private MutableLiveData<String> mText;

     public RouteViewModel() {
          mText = new MutableLiveData<>();
          mText.setValue("Route fragment");
     }

     public LiveData<String> getText() {
          return mText;
     }
}