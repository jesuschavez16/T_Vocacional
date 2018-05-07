package com.example.jorda.t_vocacional;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

import java.util.Locale;

public class InicioActivity extends AppCompatActivity implements View.OnClickListener {

    private Locale locale;
    private Configuration config = new Configuration();

    ImageView comenzar;
    ImageView comenzar1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_inicio );
        comenzar = (ImageView) findViewById( R.id.img_espanol );
        comenzar1 = (ImageView) findViewById( R.id.img_quechua );
        comenzar.setOnClickListener( this );
        comenzar1.setOnClickListener( this );
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.img_espanol:
                locale = new Locale("default");
                config.locale =locale;
                getResources().updateConfiguration(config, null);
                Intent intent = new Intent( this, MenuActivity.class );
                startActivity( intent );
                break;

            case R.id.img_quechua:
                locale = new Locale("qu");
                config.locale =locale;
                getResources().updateConfiguration(config, null);
                Intent intent1 = new Intent( this, MenuActivity.class );
                startActivity( intent1 );
                break;
        }
    }
}
