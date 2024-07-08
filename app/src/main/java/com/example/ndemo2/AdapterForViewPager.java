package com.example.ndemo2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class AdapterForViewPager extends FragmentStateAdapter {
    public AdapterForViewPager(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {


        switch (position)
        {
            case 0: return new PersonalTabFragment();
            case 1: return new ServicesTabFragment();
            case 2: return new BusinessesTabFragment();
            default: return new PersonalTabFragment();
        }


    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
