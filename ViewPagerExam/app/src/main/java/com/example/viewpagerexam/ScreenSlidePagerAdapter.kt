package com.example.viewpagerexam

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ScreenSlidePagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    private val data : ArrayList<Fragment> = ArrayList()
    init {
        for (i in 0..NUM_FRAGMENTS) {
            data.add(ScreenSlidePageFragment.newInstance("Fragment #${i+1}", "content"))
        }
    }

    override fun getCount(): Int = NUM_FRAGMENTS

    override fun getItem(position: Int): Fragment = data[position]

    companion object {
        const val NUM_FRAGMENTS = 5
    }

    override fun getPageTitle(position: Int): CharSequence = "#${position+1}"
}
