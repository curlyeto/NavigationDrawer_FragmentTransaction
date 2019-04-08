package com.example.ertugrul.navigationdrawer_fragmenttransaction.Activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.ertugrul.navigationdrawer_fragmenttransaction.Fragment.Fragment_Anasayfa;
import com.example.ertugrul.navigationdrawer_fragmenttransaction.Fragment.Fragment_Hakkimizda;
import com.example.ertugrul.navigationdrawer_fragmenttransaction.Fragment.Fragment_Harita;
import com.example.ertugrul.navigationdrawer_fragmenttransaction.Fragment.Fragment_Iletisim;
import com.example.ertugrul.navigationdrawer_fragmenttransaction.R;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public void fragmentGoster(Fragment fragment){
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.replace( R.id.frameLayout,fragment );
        ft.commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        Toolbar toolbar = (Toolbar) findViewById( R.id.toolbar );
        setSupportActionBar( toolbar );



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
        //geri butonunua basılma olayı.
        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );
        if (drawer.isDrawerOpen( GravityCompat.START )) {//drawerlayout acıksa kapat
            drawer.closeDrawer( GravityCompat.START );
        } else {
            super.onBackPressed();//kapalı ise geri gel
        }
    }



    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_anasayfa) {
            fragmentGoster( new Fragment_Anasayfa() );
            // Handle the camera action
        } else if (id == R.id.nav_hakkımızda) {
            fragmentGoster( new Fragment_Hakkimizda() );

        } else if (id == R.id.nav_harita) {
            fragmentGoster( new Fragment_Harita() );

        } else if (id == R.id.nav_iletisim) {
            fragmentGoster( new Fragment_Iletisim() );
        }

        DrawerLayout drawer = (DrawerLayout) findViewById( R.id.drawer_layout );
        drawer.closeDrawer( GravityCompat.START );//drawer layout da item a tıklayınca drawer layoutu kapat
        return true;
    }
}
//tollbar da eklemek istedigimiz degerleri activity_main_drawe içine eklememiz lazım
