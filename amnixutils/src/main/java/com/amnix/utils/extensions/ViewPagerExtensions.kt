package com.amnix.utils.extensions

import android.support.v4.view.ViewPager

fun ViewPager.setOnPageSelectedListener(listener: (Int) -> (Unit)) {
    addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
        override fun onPageScrollStateChanged(p0: Int) {
        }

        override fun onPageScrolled(p0: Int, p1: Float, p2: Int) {
        }

        override fun onPageSelected(page: Int) {
            listener(page)
        }
    })
}

fun ViewPager.setOnPageScrollStateChangedListener(listener: (Int) -> (Unit)) {
    addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
        override fun onPageScrollStateChanged(p0: Int) {
            listener(p0)
        }

        override fun onPageScrolled(p0: Int, p1: Float, p2: Int) {
        }

        override fun onPageSelected(page: Int) {

        }
    })
}