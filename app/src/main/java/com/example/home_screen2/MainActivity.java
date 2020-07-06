package com.example.home_screen2;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView all,to_me,from_me,watch;
    ViewPager viewPager;
    PageViewerAdapter pagerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        all=findViewById(R.id.all);
        to_me=findViewById(R.id.to_me);
        from_me=findViewById(R.id.from_me);
        watch=findViewById(R.id.watch);

        viewPager=findViewById(R.id.fragment_container);

        pagerViewAdapter = new PageViewerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(pagerViewAdapter);

        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewPager.setCurrentItem(0);
            }
        });
        to_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewPager.setCurrentItem(1);
            }
        });
        from_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewPager.setCurrentItem(2);
            }
        });
        watch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                viewPager.setCurrentItem(3);
            }
        });


        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onPageSelected(int position) {

                onChangeTab(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    private void onChangeTab(int position) {

        if(position==0)
        {
            all.setTextColor(getColor(R.color.black));
            to_me.setTextColor(getColor(R.color.gray));
            from_me.setTextColor(getColor(R.color.gray));
            watch.setTextColor(getColor(R.color.gray));
        }

        if(position==1)
        {
            all.setTextColor(getColor(R.color.gray));
            to_me.setTextColor(getColor(R.color.black));
            from_me.setTextColor(getColor(R.color.gray));
            watch.setTextColor(getColor(R.color.gray));
        }

        if(position==2)
        {
            all.setTextColor(getColor(R.color.gray));
            to_me.setTextColor(getColor(R.color.gray));
            from_me.setTextColor(getColor(R.color.black));
            watch.setTextColor(getColor(R.color.gray));
        }

        if(position==3)
        {
            all.setTextColor(getColor(R.color.gray));
            to_me.setTextColor(getColor(R.color.gray));
            from_me.setTextColor(getColor(R.color.gray));
            watch.setTextColor(getColor(R.color.black));
        }

    }
}
