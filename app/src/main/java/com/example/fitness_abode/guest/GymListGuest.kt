package com.example.fitness_abode.guest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.fitness_abode.R
import com.example.fitness_abode.databinding.FragmentGymListGuestBinding

class GymListGuest : Fragment() {
    private lateinit var binding : FragmentGymListGuestBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_gym_list_guest, container, false)
        val view : View = binding.root

        binding.bicepsGymGuest.setOnClickListener {

        }

        binding.tricepsGymGuest.setOnClickListener {

        }
        binding.chestGymGuest.setOnClickListener {

        }
        binding.backGymGuest.setOnClickListener {

        }
        binding.legsGymGuest.setOnClickListener {

        }
        binding.absGymGuest.setOnClickListener {

        }
        binding.shouldersGymGuest.setOnClickListener {

        }
        binding.cardioGymGuest.setOnClickListener {

        }

        return view
    }
}