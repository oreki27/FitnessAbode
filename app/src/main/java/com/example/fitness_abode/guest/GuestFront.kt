package com.example.fitness_abode.guest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavHostController
import androidx.navigation.Navigation
import com.example.fitness_abode.R
import com.example.fitness_abode.databinding.FragmentGuestFrontBinding

class GuestFront : Fragment() {
    private lateinit var binding : FragmentGuestFrontBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_guest_front, container, false)
        val view : View = binding.root


        binding.gymGuesButton.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_guestFront3_to_gymListGuest)
        }

        binding.homeGuest.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_guestFront3_to_homeListGuest)
        }

        return view
    }

}