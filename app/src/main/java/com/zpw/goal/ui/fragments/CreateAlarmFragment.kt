package com.zpw.goal.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.zpw.goal.R
import com.zpw.goal.databinding.FragmentCreateAlarmBinding

class CreateAlarmFragment: Fragment() {
    lateinit var fragmentAlarmsListBinding: FragmentCreateAlarmBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentAlarmsListBinding = FragmentCreateAlarmBinding.inflate(inflater, container, false)
        val view: View = fragmentAlarmsListBinding.root
        return view
    }
}