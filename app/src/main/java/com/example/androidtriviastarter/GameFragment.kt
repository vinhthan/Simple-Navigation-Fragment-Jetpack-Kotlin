package com.example.androidtriviastarter


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavAction
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_game.*

/**
 * A simple [Fragment] subclass.
 */
class GameFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_game, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navCentral.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_gameFragment_to_gameWonFragment)
        }
        navConTroller.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_gameFragment_to_gameOverFragment)
        }
        navMaster.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_gameFragment_to_gameOverFragment)
        }
        navSwitcher.setOnClickListener { view ->
            view.findNavController().navigate(R.id.action_gameFragment_to_gameOverFragment)
        }

    }

}
