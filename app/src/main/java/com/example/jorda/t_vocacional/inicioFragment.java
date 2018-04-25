package com.example.jorda.t_vocacional;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


public class inicioFragment extends Fragment  implements View.OnClickListener {

    //ImageView basico, completo ;
    ImageView tb, tc ;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate( R.layout.fragment_inicio, container, false );
        tb = (ImageView)v.findViewById( R.id.btn_basico );
        tc = (ImageView)v.findViewById( R.id.btncompleto );
        tb.setOnClickListener( this );
        tc.setOnClickListener( this );
        return v;


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_basico:

                Intent intent = new Intent( getActivity(), MainActivity.class );
                getActivity().startActivity( intent );
                break;
            case R.id.btncompleto:

                Intent i = new Intent( getActivity(), test_completoFragment.class );
                getActivity().startActivity( i );
                break;
        }
    }
}
