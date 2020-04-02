package com.shiftdev.deltaflyer;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.shiftdev.deltaflyer.ui.House.HouseFragment;
import com.shiftdev.deltaflyer.ui.Route.RouteFragment;
import com.shiftdev.deltaflyer.ui.Street.StreetFragment;

public class MainActivity extends AppCompatActivity {

     private BottomNavigationView.OnNavigationItemSelectedListener navListener =
             new BottomNavigationView.OnNavigationItemSelectedListener() {
                  @Override
                  public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                       Fragment selectedFragment = null;

                       switch (menuItem.getItemId()) {
                            case R.id.navigation_route:
                                 selectedFragment = new RouteFragment();
                                 break;
                            case R.id.navigation_street:
                                 selectedFragment = new StreetFragment();
                                 break;
                            case R.id.navigation_house:
                                 selectedFragment = new HouseFragment();
                       }
                       getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, selectedFragment).commit();

                       return true;
                  }
             };

     @Override
     protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_main);
          BottomNavigationView navView = findViewById(R.id.nav_view);
          // Passing each menu ID as a set of Ids because each
          // menu should be considered as top level destinations.
          AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                  R.id.navigation_route, R.id.navigation_street, R.id.navigation_house)
                  .build();
          NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
          NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
          NavigationUI.setupWithNavController(navView, navController);
          navView.setOnNavigationItemSelectedListener(navListener);

          getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new RouteFragment()).commit();

     }

}
