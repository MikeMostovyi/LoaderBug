package com.example.loaderbug;

import android.content.Context;
import android.support.v4.content.Loader;
import android.util.Log;

public class TestLoader extends Loader<Void> {

    private final String mName;

    public TestLoader(Context context, String name) {
        super(context);
        mName = name;
    }

    @Override
    protected void onReset() {
        super.onReset();
        Log.d("TestLoader", "onReset from " + mName);
    }
}
