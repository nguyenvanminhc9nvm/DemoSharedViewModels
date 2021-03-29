package com.minhnv.c9nvm.demosharedviewmodels.ex_3.fragment_child

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.minhnv.c9nvm.demosharedviewmodels.ex_3.fragment_child.child_1.FirstChildFragment
import com.minhnv.c9nvm.demosharedviewmodels.ex_3.fragment_child.child_2.SecondChildFragment
import com.minhnv.c9nvm.demosharedviewmodels.ex_3.fragment_child.child_3.ThirdChildFragment

class PagerParentsFragment(fragment: Fragment) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FirstChildFragment()
            1 -> SecondChildFragment()
            else -> ThirdChildFragment()
        }
    }
}