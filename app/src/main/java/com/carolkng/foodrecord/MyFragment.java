package com.carolkng.foodrecord;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Project: foodrecord
 * Created by Carol Ng (@carolkng) on 2017-01-25.
 */

public class MyFragment extends Fragment {
    public static MyFragment newInstance() {
        MyFragment fragment = new MyFragment();
        return fragment;
    }

    public MyFragment() {}

    Button ClickMe;
    TextView tv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Connects the fragment to the layout
        View rootView = inflater.inflate(R.layout.my_fragment, container, false);

        // Connect Button and TextView to those in the layout using findViewById
        ClickMe = (Button) rootView.findViewById(R.id.button);
        tv = (TextView) rootView.findViewById(R.id.textView2);

        // Button click handler
        ClickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tv.getText().toString().contains("Hello")){
                    tv.setText("Hi");
                } else
                    tv.setText("Hello");
            }
        });

        // Must return View after creating the view
        return rootView;
    }
}
