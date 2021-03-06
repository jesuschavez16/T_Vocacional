package com.example.jorda.t_vocacional;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MenuActivity extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener{
    FragmentManager fm = getSupportFragmentManager();
    //ImageView basico, completo ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_menu );
        fm.beginTransaction().replace( R.id.escenario, new inicioFragment() ).commit();
        ;

        //basico = (ImageView) findViewById( R.id.btn_basico );
        //completo = (ImageView) findViewById( R.id.btncompleto );

        //basico.setOnClickListener( this );
        //completo.setOnClickListener( this );


        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );

       // FloatingActionButton fab = (FloatingActionButton) findViewById( R.id.fab );
        //fab.setOnClickListener( new View.OnClickListener() {
            //@Override
           // public void onClick(View view) {
          //      Snackbar.make( view, "Replace with your own action", Snackbar.LENGTH_LONG )
            //            .setAction( "Action", null ).show();
          //  }
        //} );

        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close );
        drawer.addDrawerListener( toggle );
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById( R.id.nav_view );
        navigationView.setNavigationItemSelectedListener( this );
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );
        if (drawer.isDrawerOpen( GravityCompat.START )) {
            drawer.closeDrawer( GravityCompat.START );
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate( R.menu.menu, menu );
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected( item );
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Fragment fragment = null;
        Boolean fragmentoSeleccionado = false;
        FragmentManager fm = getSupportFragmentManager();

        if (id == R.id.nav_inicio) {
            fm.beginTransaction().replace( R.id.escenario, new inicioFragment() ).commit();

        }else if (id == R.id.nav_basico) {
            fm.beginTransaction().replace( R.id.escenario, new test_basicoFragment() ).commit();
        }
        else if (id == R.id.nav_completo) {
            fm.beginTransaction().replace( R.id.escenario, new test_completoFragment() ).commit();
        }  else if (id == R.id.nav_configuracion) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_help) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );
        drawer.closeDrawer( GravityCompat.START );
        return true;
    }

    @Override
    public void onClick(View view) {
        //switch (view.getId()){
            //case R.id.btn_basico:
                //Intent intent = new Intent( this, TestBasicoActivity.class );
                //startActivity( intent );
                //break;
            //case R.id.btncompleto:
                //Intent i = new Intent( this, TestBasicoActivity.class );
               // startActivity( i );
                //break;

        //}
    }
}
