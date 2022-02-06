package com.emotionfactry.clickerclient.presentation.main.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavController
import com.emotionfactry.clickerclient.R
import com.emotionfactry.clickerclient.databinding.FragmentMainBinding
import com.emotionfactry.clickerclient.presentation.main.viewmodel.MainViewModel
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : Fragment(R.layout.fragment_main) {

    private lateinit var navController: NavController
    private lateinit var binding: FragmentMainBinding

    private val viewModel:MainViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)


        setFragmentDetails()
    }


    private fun setFragmentDetails(){

        binding

        binding.menuToolbar.setNavigationOnClickListener {
            Toast.makeText(context, "Menu clicked", Toast.LENGTH_LONG).show()

        }

        binding.menuToolbar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.preferences -> {true}
                R.id.about -> {
                    showDialog()
                    true
                }
                else -> false
            }
        }
    }

    private fun showDialog() {
        MaterialAlertDialogBuilder(requireContext())
            .setTitle(R.string.about_title)
            .setMessage(R.string.about_message)
            .setPositiveButton(R.string.button_ok) {dialog,which -> dialog.dismiss()}
            .show()
    }

    private fun setAppEnvironment(){
        binding.menuToolbar.navigationIcon?.setTint(resources.getColor(R.color.black))
    }

    companion object {
        const val TAG: String = "MainFragment"
    }
}