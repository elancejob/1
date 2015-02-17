package com.testanimation.pageanimation.animation;

import android.support.v4.view.ViewPager;
import android.view.View;

public class RotateDownPageTransformer implements ViewPager.PageTransformer {

    @Override
    public void transformPage(View page, float position) {
        final float width = page.getWidth();
        final float height = page.getHeight();
        final float rotation = -15f * position * -1.25f;

        page.setPivotX(width * 0.5f);
        page.setPivotY(height);
        page.setRotation(rotation);
    }

}
