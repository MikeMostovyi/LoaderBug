package com.example.loaderbug;

import android.os.Bundle;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<Void> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportLoaderManager().initLoader(0, null, this);
    }

    @Override
    public Loader<Void> onCreateLoader(int id, Bundle args) {
        return new TestLoader(this, "Activity loader");
    }

    @Override
    public void onLoadFinished(Loader<Void> loader, Void data) {
    }

    @Override
    public void onLoaderReset(Loader<Void> loader) {
    }
}
