package com.minhnv.c9nvm.demosharedviewmodels.ex_2.second

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.minhnv.c9nvm.demosharedviewmodels.R
import com.minhnv.c9nvm.demosharedviewmodels.databinding.FragmentSecondBinding
import com.minhnv.c9nvm.demosharedviewmodels.ex_2.first.FirstViewModel
import kotlin.random.Random

/**
 * A simple [Fragment] subclass.
 * Use the [SecondFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SecondFragment : Fragment() {

    private val viewModel: FirstViewModel by viewModels()
    private lateinit var binding: FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =  FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnChange.setOnClickListener {
            viewModel.setRotate(Random.nextInt(0, 100))
        }
    }
}