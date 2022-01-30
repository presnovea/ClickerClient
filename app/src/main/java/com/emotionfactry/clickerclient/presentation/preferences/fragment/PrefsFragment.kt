package com.emotionfactry.clickerclient.presentation.preferences.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.emotionfactry.clickerclient.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PrefsFragment : Fragment(R.layout.fragment_prefs) {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_prefs, container, false)
    }

    companion object {

    }
}