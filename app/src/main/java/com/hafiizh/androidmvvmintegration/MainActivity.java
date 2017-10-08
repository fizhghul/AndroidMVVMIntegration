package com.hafiizh.androidmvvmintegration;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hafiizh.androidmvvmintegration.databinding.ActivityMainBinding;
import com.hafiizh.androidmvvmintegration.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        /*ActivityMainBinding class yg dibuat sesuai dr nama layout nya
        * udh otomatis mengenerate mnjdi class
        * dan meng extend ke ViewDataBinding -> android.databinding*/
        User user = new User("Havea", "Crenata");
        binding.setUser(user);
    }
}