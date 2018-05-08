package com.example.jorda.t_vocacional;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class test_basicoFragment extends Fragment implements View.OnClickListener {

    Button b_basico;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate( R.layout.fragment_test_basico, container, false );
        b_basico = (Button)v.findViewById( R.id.b_test );
        b_basico.setOnClickListener( this );

        return v;

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.b_test:

                Intent intent = new Intent( getActivity(), test_basico_activity.class );
                getActivity().startActivity( intent );
                break;
        }
    }
}
