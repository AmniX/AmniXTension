package com.amnix.utils.extensions

import android.support.v4.view.ViewPager

/**
 * Use setOnPageSelectedListener instead of Using the Full OnPageChangeListener
 */
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
/**
 * Use setOnPageScrollStateChangedListener instead of Using the Full OnPageChangeListener
 */
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