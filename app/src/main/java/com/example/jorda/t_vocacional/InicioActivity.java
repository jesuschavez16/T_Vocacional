package com.example.jorda.t_vocacional;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

public class InicioActivity extends AppCompatActivity implements View.OnClickListener {

    Spinner spinner1;
    ImageView comenzar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_inicio );
        comenzar = (ImageView) findViewById( R.id.comenzar );
        spinner1 = (Spinner) findViewById( R.id.spinner );
        comenzar.setOnClickListener( this );
        ArrayAdapter<String> myadapter = new ArrayAdapter<String>(InicioActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray( R.array.names ));
        myadapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );
        spinner1.setAdapter( myadapter );
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.comenzar:

                Intent intent = new Intent( this, MenuActivity.class );
                startActivity( intent );
                break;
        }
    }
}
