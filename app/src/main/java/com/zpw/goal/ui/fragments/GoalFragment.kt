package com.zpw.goal.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.zpw.goal.R
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
        fragmentAlarmsListBinding = FragmentGoalBinding.inflate(inflater, container, false)
        val view: View = fragmentAlarmsListBinding.root
        fragmentAlarmsListBinding.fragmentGoalAddAlarm.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_goalFragment_to_createAlarmFragment)
        }
        return view
    }
}