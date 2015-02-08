package com.testanimation.pageanimation;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ammar on 2/8/15.
 */
public class PageFragment extends Fragment {

    private static final String EXTRA_ID = "id";
    private String mId;


    public void setId(String id) {
        this.mId = id;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            mId = savedInstanceState.getString(EXTRA_ID);
        }

        final View view = inflater.inflate(R.layout.fragment_main, container, false);
        ((TextView) view.findViewById(R.id.id_textView)).setText(mId);
        return view;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(EXTRA_ID, mId);
    }
}
