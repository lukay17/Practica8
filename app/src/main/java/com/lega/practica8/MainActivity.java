package com.lega.practica8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.lega.practica8.databinding.ActivityMainBinding;
import com.lega.practica8.fragment.LoginFragment;
import com.lega.practica8.fragment.RegisterFragment;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        initLoginFragment();
    }

    private void initLoginFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(binding.P6Container.getId(), new LoginFragment(), "LoginFragment")
                .commitAllowingStateLoss();
    }
}