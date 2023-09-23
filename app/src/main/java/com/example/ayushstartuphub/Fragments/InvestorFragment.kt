package com.example.ayushstartuphub.Fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ayushstartuphub.R

class InvestorFragment : Fragment() {

    companion object {
        fun newInstance() = InvestorFragment()
    }

    private lateinit var viewModel: InvestorViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_investor, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(InvestorViewModel::class.java)
        // TODO: Use the ViewModel
    }

}