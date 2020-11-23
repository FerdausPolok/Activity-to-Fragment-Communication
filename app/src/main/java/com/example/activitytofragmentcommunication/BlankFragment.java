package com.example.activitytofragmentcommunication;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {
    String output;
    TextView tv;


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_blank, container, false);
        output=getArguments().getString("MSG");
        tv = v.findViewById(R.id.tv1);
        tv.setText(output);
        Toast.makeText(getActivity(),output,Toast.LENGTH_LONG).show();
        return v;

    }

}
