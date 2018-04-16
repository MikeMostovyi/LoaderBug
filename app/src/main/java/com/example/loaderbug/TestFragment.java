package com.example.loaderbug;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class TestFragment extends Fragment implements LoaderManager.LoaderCallbacks<Void> {


    public TestFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLoaderManager().initLoader(0, null, this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_test, container, false);
    }

    @Override
    public Loader<Void> onCreateLoader(int id, Bundle args) {
        return new TestLoader(requireContext(), "Fragment loader");
    }

    @Override
    public void onLoadFinished(Loader<Void> loader, Void data) {
    }

    @Override
    public void onLoaderReset(Loader<Void> loader) {
    }

}
