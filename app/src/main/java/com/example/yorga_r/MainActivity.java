package com.example.yorga_r;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    private long onHiddenTime;
    private Toast bakeToast;
    private Fragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        fragment = fm.findFragmentById(R.id.fragment_container);
        if (fragment == null) {
            fragment = new Fragment_Menu();
            fm.beginTransaction()
                    .add(R.id.fragment_container, fragment, null)
                    .commit();
        }
    }

    public void changeFragment(int item){
        FragmentManager fm = getSupportFragmentManager();
        fragment = fm.findFragmentById(R.id.fragment_container);
        switch (item){
            case 0:
                fragment = new Fragment_Menu();
                break;
            case 1:
                fragment = new Fragment_Registration();
                break;
            case 2:
                fragment = new Fragment_Information();
                break;
        }
        fm.beginTransaction()
                .setCustomAnimations(
                        R.anim.slide_in,  // enter
                        R.anim.fade_out,  // exit
                        R.anim.fade_in,   // popEnter
                        R.anim.slide_out) // popExit
                .replace(R.id.fragment_container, fragment, null)
                .commit();
    }
    @Override
    public void onBackPressed() {

        if (onHiddenTime + 1000 > System.currentTimeMillis()){
            bakeToast.cancel();
            super.onBackPressed();
            return;
        } else {
            bakeToast = Toast.makeText(getBaseContext(), "Кликните дважды", Toast.LENGTH_SHORT);
            bakeToast.show();
            changeFragment(0);
        }
        onHiddenTime = System.currentTimeMillis();
    }
}