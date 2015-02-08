package com.testanimation.pageanimation.animation;

import android.annotation.TargetApi;
import android.os.Build;
import android.support.v4.view.ViewPager;
import android.view.View;

/**
 * CardPageTransformer
 * Created by ammar on 2/6/14.
 */
@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class CardPageTransformer implements ViewPager.PageTransformer {

    public void transformPage(View view, float position) {
        int pageWidth = view.getWidth();

        if (position <= 0) { // [-1,0]
            view.setTranslationX(0);
        } else if (position <= 1) { // (0,1]
            view.setTranslationX(pageWidth * -position);

        }
    }
}