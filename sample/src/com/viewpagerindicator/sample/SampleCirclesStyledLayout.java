
package com.viewpagerindicator.sample;

import android.os.Bundle;
import android.support.v4.view.ViewPager;

import com.viewpagerindicator.CirclePageIndicator;

public class SampleCirclesStyledLayout extends BaseSampleActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.themed_circles);

        mAdapter = new TestFragmentAdapter(getSupportFragmentManager());

        mPager = (ViewPager) findViewById(R.id.pager);
        mPager.setAdapter(mAdapter);

        CirclePageIndicator mIndicator = (CirclePageIndicator) findViewById(R.id.indicator);
        String[] texts = {
        "简", "日", "英", "阿"
        };
        mIndicator.setTexts(texts);
        mIndicator.setViewPager(mPager);
    }
}
