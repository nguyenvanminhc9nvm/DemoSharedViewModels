package com.minhnv.c9nvm.demosharedviewmodels.ex_3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.minhnv.c9nvm.demosharedviewmodels.databinding.ParentsFragmentBinding
import com.minhnv.c9nvm.demosharedviewmodels.ex_3.fragment_child.PagerParentsFragment

class ParentsFragment : Fragment() {

    private lateinit var binding: ParentsFragmentBinding
    private val viewModel: ParentsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ParentsFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.change.observe(viewLifecycleOwner) {
            binding.textView.text = "change to $it"
        }
        binding.viewPager.adapter = PagerParentsFragment(this)
        binding.viewPager.offscreenPageLimit = 3
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, pos ->
            when (pos) {
                0 -> tab.text = "Tab 1"
                1 -> tab.text = "Tab 2"
                2 -> tab.text = "Tab 3"
            }
        }.attach()
    }
}