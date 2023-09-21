package com.example.ayushstartuphub

import Models.DataModel
import adapters.Topic_list_adapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ayushstartuphub.databinding.FragmentHomeBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    private lateinit var mainBinding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mainBinding=FragmentHomeBinding.inflate(layoutInflater)
        getListners(mainBinding);
        return mainBinding.root
    }



    private fun getListners(mainBinding: FragmentHomeBinding) {
        setList(mainBinding)
    }

    protected fun setList(mainBinding: FragmentHomeBinding) {
        val list: MutableList<DataModel> = ArrayList()
        list.clear()
        val d1 = DataModel("HOMIOPATHY", "Homeopathy claims to stimulate healing responses to diseases by administering substances that mimic the symptoms of those diseases in healthy people", R.drawable.homeopathy)
        val d2 = DataModel("AYURVEDA", "What is Ayurveda? The term Ayurveda is derived from the Sanskrit words ayur (life) and veda (science or knowledge). Thus, Ayurveda translates to knowledge of life.", R.drawable.ayurveda)
        val d3 = DataModel("SIDDHA", "Siddha medicine is a form of traditional medicine originating in southern India. It is one of the oldest systems of medicine in India", R.drawable.buddha)
        val d4 = DataModel("HOMIOPATHY", "Unani medicine (also called as Greco-Arab medicine) is an ancient system of medicine originated from Greece. It is more commonly practiced in Indian Subcontinent and has an age-old concept and principles of drug management.", R.drawable.unani)
        list.add(d1)
        list.add(d2)
        list.add(d3)
        list.add(d4)
        val linearLayoutManager = LinearLayoutManager(requireContext())
        mainBinding.recyclerView.setLayoutManager(linearLayoutManager)
        val adapter = Topic_list_adapter(list, requireContext())
        mainBinding.recyclerView.setAdapter(adapter)
    }
}