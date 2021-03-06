package com.minhnv.c9nvm.demosharedviewmodels.ex_1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.minhnv.c9nvm.demosharedviewmodels.databinding.SharedAcFgFragmentBinding
import kotlin.random.Random

class SharedAcFgFragment : Fragment() {
    private val sharedAcFgViewModel: SharedAcFgViewModel by activityViewModels()
    private lateinit var binding: SharedAcFgFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = SharedAcFgFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.swRotate.setOnClickListener {
            sharedAcFgViewModel.setRotate(Random.nextInt(0, 100))
        }
    }

}