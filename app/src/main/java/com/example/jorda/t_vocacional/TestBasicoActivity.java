package com.example.jorda.t_vocacional;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class TestBasicoActivity extends AppCompatActivity implements View.OnClickListener {

    Button ingresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_test_basico );
        ingresar = (Button) findViewById( R.id.ing_basico );
        ingresar.setOnClickListener( this );

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.ing_basico:
                Intent intent = new Intent( this, MainActivity.class );
                startActivity( intent );
                break;
        }
    }
}
