package com.minhnv.c9nvm.demosharedviewmodels.ex_3.fragment_child.child_1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.minhnv.c9nvm.demosharedviewmodels.databinding.FirstChildFragmentBinding
import com.minhnv.c9nvm.demosharedviewmodels.ex_3.ParentsViewModel
import com.minhnv.c9nvm.demosharedviewmodels.ex_3.fragment_child.child_2.SecondChildViewModel
import kotlin.random.Random

class FirstChildFragment : Fragment() {

    private lateinit var binding: FirstChildFragmentBinding
    private val parentsViewModel: ParentsViewModel by viewModels(ownerProducer = { requireParentFragment() })
    private val firstViewModel: FirstChildViewModel by viewModels(ownerProducer = { requireParentFragment() })
    private val secondChildViewModel: SecondChildViewModel by viewModels(ownerProducer = { requireParentFragment() })

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FirstChildFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnChangeParent.setOnClickListener {
            parentsViewModel.setRotate(Random.nextInt(0, 100))
        }

        firstViewModel.changeOfFirst.observe(viewLifecycleOwner) {

            binding.tvChange1.text = "text of first $it"
        }

        binding.btnChange2.setOnClickListener {
            secondChildViewModel.setRotate(Random.nextInt(0, 100))
        }
    }

}