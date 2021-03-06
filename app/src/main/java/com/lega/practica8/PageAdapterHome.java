package com.lega.practica8;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.lega.practica8.fragment.CarFragment;
import com.lega.practica8.fragment.HomeFragment;
import com.lega.practica8.fragment.MontainFragment;
import com.lega.practica8.fragment.UserFragment;
import com.lega.practica8.onboarding.OnBoardingPage1;
import com.lega.practica8.onboarding.OnBoardingPage2;
import com.lega.practica8.onboarding.OnBoardingPage3;

public class PageAdapterHome extends FragmentStateAdapter {

    public PageAdapterHome(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment;
        switch (position){
            case 0:
                fragment = HomeFragment.newInstance();
                break;
            case 1:
                fragment = CarFragment.newInstance();
                break;
            case 2:
                fragment = MontainFragment.newInstance();
                break;
            case 3:
                fragment = UserFragment.newInstance();
                break;
            default:
                throw  new IllegalStateException("Unexpected value " + position);
        }
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
