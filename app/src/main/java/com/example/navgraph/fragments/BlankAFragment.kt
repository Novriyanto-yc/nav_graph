package com.example.navgraph.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navgraph.databinding.FragmentBlankABinding

class BlankAFragment : Fragment() {

    private lateinit var binding: FragmentBlankABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankABinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.fragmentA.setOnClickListener {
            val direction = BlankAFragmentDirections.actionBlankAFragmentToBlankBFragment()
            findNavController().navigate(direction)
        }

        binding.fragmentC.setOnClickListener {
            val direction = BlankAFragmentDirections.actionBlankAFragmentToBlankCFragment()
            findNavController().navigate(direction)
        }

    }

}