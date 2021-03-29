package com.minhnv.c9nvm.demosharedviewmodels.ex_3.fragment_child.child_3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.minhnv.c9nvm.demosharedviewmodels.databinding.ThirdChidFragmentBinding
import com.minhnv.c9nvm.demosharedviewmodels.ex_3.ParentsViewModel
import com.minhnv.c9nvm.demosharedviewmodels.ex_3.fragment_child.child_1.FirstChildViewModel
import kotlin.random.Random

class ThirdChildFragment : Fragment() {

    private lateinit var binding: ThirdChidFragmentBinding
    private val parentsViewModel: ParentsViewModel by viewModels(ownerProducer = { requireParentFragment() })
    private val thirdViewModel: ThirdChildViewModel by viewModels(ownerProducer = { requireParentFragment() })
    private val firstChildViewModel: FirstChildViewModel by viewModels(ownerProducer = { requireParentFragment() })

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ThirdChidFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnChangeParent.setOnClickListener {
            parentsViewModel.setRotate(Random.nextInt(0, 100))
        }

        thirdViewModel.changeOfThird.observe(viewLifecycleOwner) {
            binding.tvChange3.text = "text of third $it"
        }

        binding.btnChange3.setOnClickListener {
            firstChildViewModel.setRotate(Random.nextInt(0, 100))
        }
    }
}