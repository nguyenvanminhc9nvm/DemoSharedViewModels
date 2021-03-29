package com.minhnv.c9nvm.demosharedviewmodels.ex_3.fragment_child.child_2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.minhnv.c9nvm.demosharedviewmodels.databinding.SecondChildFragmentBinding
import com.minhnv.c9nvm.demosharedviewmodels.ex_3.ParentsViewModel
import com.minhnv.c9nvm.demosharedviewmodels.ex_3.fragment_child.child_3.ThirdChildViewModel
import kotlin.random.Random

class SecondChildFragment : Fragment() {

    private lateinit var binding: SecondChildFragmentBinding
    private val parentsViewModel: ParentsViewModel by viewModels(ownerProducer = { requireParentFragment() })
    private val secondChildViewModel: SecondChildViewModel by viewModels(ownerProducer = { requireParentFragment() })
    private val thirdChildViewModel: ThirdChildViewModel by viewModels(ownerProducer = { requireParentFragment() })

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = SecondChildFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnChangeParent.setOnClickListener {
            parentsViewModel.setRotate(Random.nextInt(0, 100))
        }

        secondChildViewModel.changeOfSecond.observe(viewLifecycleOwner) {
            binding.tvChange2.text = "text of second $it"
        }

        binding.btnChange2.setOnClickListener {
            thirdChildViewModel.setRotate(Random.nextInt(0, 100))
        }
    }
}