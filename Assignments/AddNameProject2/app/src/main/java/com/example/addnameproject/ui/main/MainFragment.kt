package com.example.addnameproject.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer

import com.example.addnameproject.databinding.FragmentMainBinding

class MainFragment : Fragment() {



    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)


        val Observer = Observer<String> {
                result -> binding.Names.text = result.toString()
        }
        viewModel.getNames().observe(viewLifecycleOwner, Observer)

        binding.button.setOnClickListener {
            if (binding.editText.text.isNotEmpty()){
                viewModel.setNames(binding.editText.text.toString())

            } else {
                binding.Names.text = "No Names Found"
            }

        }


    }


}