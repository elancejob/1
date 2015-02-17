package com.testanimation.pageanimation.animation;

import android.support.v4.view.ViewPager;
import android.view.View;

public class RotateUpPageTransformer implements ViewPager.PageTransformer {

    @Override
    public void transformPage(View view, float position) {
        final float width = view.getWidth();
        final float rotation = -15f * position;

        view.setPivotX(width * 0.5f);
        view.setPivotY(0f);
        view.setTranslationX(0f);
        view.setRotation(rotation);
    }

}
