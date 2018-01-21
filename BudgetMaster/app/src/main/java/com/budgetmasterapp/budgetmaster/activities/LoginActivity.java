package com.budgetmasterapp.budgetmaster.activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.budgetmasterapp.budgetmaster.R;

public class LoginActivity extends AppCompatActivity {

    private ViewPager loginRegisterPager;
    private TabLayout loginRegisterTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginRegisterPager = (ViewPager) findViewById(R.id.login_register_pager);
        loginRegisterTabLayout = (TabLayout) findViewById(R.id.login_register_tab_layout);
    }
}
