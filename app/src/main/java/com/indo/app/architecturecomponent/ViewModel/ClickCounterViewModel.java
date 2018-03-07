package com.indo.app.architecturecomponent.ViewModel;

import android.arch.lifecycle.ViewModel;

/**
 * Created by indo on 3/7/18.
 */

public class ClickCounterViewModel extends ViewModel {
    private  int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
