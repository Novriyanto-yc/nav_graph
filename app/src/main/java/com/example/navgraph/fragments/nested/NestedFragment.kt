package com.example.navgraph.fragments.nested

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navgraph.R
import kotlinx.android.synthetic.main.fragment_nested.*

class NestedFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_nested, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nestedA.setOnClickListener {
            val direction = NestedFragmentDirections.actionNestedFragmentToNestedAFragment2()
            findNavController().navigate(direction)
        }

        nestedB.setOnClickListener {
            val direction = NestedFragmentDirections.actionNestedFragmentToNestedBFragment()
            findNavController().navigate(direction)
        }
    }
}