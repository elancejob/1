package com.testanimation.pageanimation.animation;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * RotationTransformer
 * Created by ammar on 2/6/14.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class RotationTransformer implements ViewPager.PageTransformer {


    public RotationTransformer() {
    }

    @Override
    public void transformPage(View page, float position) {
        page.setRotationY(position * -30);
    }
}