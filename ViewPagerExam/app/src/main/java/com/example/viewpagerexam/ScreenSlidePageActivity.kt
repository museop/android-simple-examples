package com.example.viewpagerexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class ScreenSlidePageActivity : AppCompatActivity() {
    private lateinit var mPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_slide_page)

        mPager = findViewById(R.id.pager)

        val pagerAdapter = ScreenSlidePagerAdapter(supportFragmentManager)
        mPager.adapter = pagerAdapter

        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)
        tabLayout.setupWithViewPager(mPager)
    }

    override fun onBackPressed() {
        if (mPager.currentItem == 0) {
            super.onBackPressed()
        } else {
            mPager.currentItem = mPager.currentItem - 1
        }
    }
}