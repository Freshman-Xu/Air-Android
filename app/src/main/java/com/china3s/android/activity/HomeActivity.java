package com.china3s.android.activity;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;

import com.china3s.android.R;
import com.china3s.android.fragment.NavigationDrawerFragment;

import butterknife.ButterKnife;

/**
 * Created by ZZQ。 on 2014/9/21.
 */
public class HomeActivity extends BaseActivity {

    NavigationDrawerFragment mNavigationDrawerFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.inject(this);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getFragmentManager().findFragmentById(R.id.navigation_drawer);

        mNavigationDrawerFragment.setUp(R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));
    }
}
