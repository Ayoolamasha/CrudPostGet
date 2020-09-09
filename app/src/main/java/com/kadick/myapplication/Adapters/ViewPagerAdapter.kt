package com.kadick.myapplication.Adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.kadick.myapplication.Fragments.FragmentLeaders
import com.kadick.myapplication.Fragments.FragmentSkills

class ViewPagerAdapter(private val context:Context, fm:FragmentManager, internal var totalTabs: Int): FragmentPagerAdapter(fm, totalTabs){
    override fun getCount(): Int {
        TODO("Not yet implemented")
        return totalTabs
    }

    override fun getItem(position: Int): Fragment? {
        TODO("Not yet implemented")
        when(position){
            0 ->{
                return FragmentLeaders()
            }
            1 ->{
                return FragmentSkills()
            }
            else -> return null
        }
    }

}