package com.zpw.goal.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.zpw.goal.databinding.FragmentGoalBinding

class GoalFragment: Fragment() {
    lateinit var fragmentAlarmsListBinding: FragmentGoalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        fragmentAlarmsListBinding = FragmentGoalBinding.inflate(inflater, container, false)
        val view: View = fragmentAlarmsListBinding.root
        return view
    }
}