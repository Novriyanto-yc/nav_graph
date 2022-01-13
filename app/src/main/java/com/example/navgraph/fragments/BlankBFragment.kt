package com.example.navgraph.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navgraph.R
import com.example.navgraph.databinding.FragmentBlankBBinding

class BlankBFragment : Fragment() {

    private var binding: FragmentBlankBBinding ?= null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankBBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.toNestedGraph?.setOnClickListener {
            val directions = BlankBFragmentDirections.actionBlankBFragmentToNestedNavigation()
            findNavController().navigate(directions)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}