package com.barranquero.managecalls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HomeActivity extends AppCompatActivity {
    ListCallFragment listCallFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        listCallFragment = new ListCallFragment();
        getFragmentManager().beginTransaction().add(R.id.frameHome, listCallFragment).commit();
    }
}
