package com.testanimation.pageanimation.animation;

import android.support.v4.view.ViewPager;
import android.view.View;

public class SideFlipPageTransformer implements ViewPager.PageTransformer {

    @Override
    public void transformPage(View page, float position) {
        float percentage = 1 - Math.abs(position);
        page.setCameraDistance(12000);
        setTranslation(page);
        setRotation(page, position, percentage);
    }

    private void setTranslation(View page) {
        ViewPager viewPager = (ViewPager) page.getParent();
        int scroll = viewPager.getScrollX() - page.getLeft();
        page.setTranslationX(scroll);
    }

    private void setRotation(View page, float position, float percentage) {
        page.setPivotX(0);
        if (position > 0) {
            page.setRotationY(0);
        } else {
            page.setRotationY(180f + 90 * (percentage + 1));
        }
    }

}
