package com.example.home_screen2;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageViewerAdapter extends FragmentPagerAdapter {
    public PageViewerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;

        switch (position){
            case 0:
                fragment = new fragment_all();
                break;
            case 1:
                fragment = new fragment_to_me();
                break;
            case 2:
                fragment = new fragment_from_me();
                break;
            case 3:
                fragment = new fragment_watch();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
