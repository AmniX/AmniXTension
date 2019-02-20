package com.amnix.utils.extensions

import androidx.viewpager.widget.ViewPager

/**
 * Use setOnPageSelectedListener instead of Using the Full OnPageChangeListener
 */
fun androidx.viewpager.widget.ViewPager.setOnPageSelectedListener(listener: (Int) -> (Unit)) {
    addOnPageChangeListener(object : androidx.viewpager.widget.ViewPager.OnPageChangeListener {
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
fun androidx.viewpager.widget.ViewPager.setOnPageScrollStateChangedListener(listener: (Int) -> (Unit)) {
    addOnPageChangeListener(object : androidx.viewpager.widget.ViewPager.OnPageChangeListener {
        override fun onPageScrollStateChanged(p0: Int) {
            listener(p0)
        }

        override fun onPageScrolled(p0: Int, p1: Float, p2: Int) {
        }

        override fun onPageSelected(page: Int) {

        }
    })
}