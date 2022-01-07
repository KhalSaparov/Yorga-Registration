package com.example.yorga_r;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment_Menu extends Fragment {

    private Button mRegistration;
    private Button mInfo;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View menu = inflater.inflate(R.layout.fragment_menu, container, false);
        init(menu);
        mRegistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).changeFragment(1);
            }
        });
        mInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)getActivity()).changeFragment(2);
            }
        });
        return menu;
    }

    public void init(View v){
        mRegistration = v.findViewById(R.id.reg_button);
        mInfo = v.findViewById(R.id.inf_button);
    }
}