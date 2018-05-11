package com.example.jorda.t_vocacional;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class test_completoFragment extends Fragment implements View.OnClickListener {

    Button t_completo;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate( R.layout.fragment_test_completo, container, false );
        t_completo = (Button)v.findViewById( R.id.c_test );
        t_completo.setOnClickListener( this );
        return v;
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.c_test:

                Intent intent = new Intent( getActivity(), test_comple_activity.class );
                getActivity().startActivity( intent );
                break;
        }
    }
}
