package com.example.kamal.attendanceapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kamal.attendanceapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddEditEventFragment extends Fragment {


    public AddEditEventFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_edit_event, container, false);
    }

}
