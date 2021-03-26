package com.minhnv.c9nvm.demosharedviewmodels.ex_2.first

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.minhnv.c9nvm.demosharedviewmodels.databinding.FirstFragmentBinding
import com.minhnv.c9nvm.demosharedviewmodels.ex_2.SharedFgFgActivity

class FirstFragment : Fragment() {

    private val viewModels: FirstViewModel by viewModels()

    private lateinit var binding : FirstFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FirstFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button4.setOnClickListener {
            (requireActivity() as SharedFgFgActivity).moveToSecond()
        }
        viewModels.change.observe(viewLifecycleOwner) {
            binding.tvFirst.text = "change to $it"
            binding.tvFirst.setBackgroundColor(Color.rgb(it, it * 10, it * 100))
        }
    }
}