package com.example.androiddaythreetwo;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView nav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nav = (BottomNavigationView) findViewById(R.id.bottomNavigationView);
        nav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch(menuItem.getItemId()) {
                    case R.id.navigation_home:
                        loadFragment(new Home());
                        return true;
                    case R.id.navigation_dashboard:
                        loadFragment(new Dashboard());
                        return true;
                    case R.id.navigation_notification:
                        loadFragment(new Notification());
                        return true;

                }
                return false;
            }
        });
        loadFragment(new Home());
    }

    private void loadFragment(Fragment f) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frameLayout,f);
        ft.commit();
    }
}
