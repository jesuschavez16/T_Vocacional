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


    ImageView comenzar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_inicio );
        comenzar = (ImageView) findViewById( R.id.img_espanol );
        comenzar.setOnClickListener( this );
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.img_espanol:

                Intent intent = new Intent( this, MenuActivity.class );
                startActivity( intent );
                break;
        }
    }
}
