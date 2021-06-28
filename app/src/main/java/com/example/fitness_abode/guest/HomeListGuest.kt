package com.example.fitness_abode.guest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.fitness_abode.R
import com.example.fitness_abode.databinding.FragmentGuestFrontBinding
import com.example.fitness_abode.databinding.FragmentHomeListGuestBinding

class HomeListGuest : Fragment() {
    private lateinit var binding : FragmentHomeListGuestBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_home_list_guest, container, false)
        val view : View = binding.root

        binding.bicepsHomeGuest.setOnClickListener {
        
        }

        binding.tricepsHomeGuest.setOnClickListener {

        }
        binding.chestHomeGuest.setOnClickListener {

        }
        binding.backHomeGuest.setOnClickListener {

        }
        binding.legsHomeGuest.setOnClickListener {

        }
        binding.absHomeGuest.setOnClickListener {

        }
        binding.shouldersHomeGuest.setOnClickListener {

        }
        binding.cardioHomeGuest.setOnClickListener {

        }

        return view
    }
}