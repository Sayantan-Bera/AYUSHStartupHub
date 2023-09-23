package com.example.ayushstartuphub

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.compose.ui.graphics.Color
import androidx.core.content.ContextCompat
import com.example.ayushstartuphub.R.drawable.bg_login
import com.example.ayushstartuphub.R.drawable.bg_login_white
import com.example.ayushstartuphub.R.drawable.rectangle_login
import com.example.ayushstartuphub.R.drawable.rectangle_login_white
import com.example.ayushstartuphub.databinding.FragmentProfileBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ProfileFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProfileFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding;
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private var status:Boolean =true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentProfileBinding.inflate(layoutInflater)
     getListeners(binding)
        return binding.root
    }

    private fun getListeners(binding: FragmentProfileBinding) {


       getPageStatus(binding)
        setPageStatus(binding)
        binding.enterBtn.setOnClickListener(View.OnClickListener { view -> checkdata(binding) })

    }

    private fun checkdata(binding: FragmentProfileBinding) {

        if(status){
            if(TextUtils.isEmpty(binding.emailText.text.toString())){
                binding.emailText.setError("Fill Email")
                return
            }
            else if(TextUtils.isEmpty(binding.passText.text.toString())){
                binding.passText.setError("Fill Password")
                return
            }
            else{
                Toast.makeText(requireContext(),"Successfully given",Toast.LENGTH_SHORT).show()
                return
            }
        }else{
            if(TextUtils.isEmpty(binding.nameTextInput.text.toString())){
                binding.nameTextInput.setError("Fill Name")
                return
            }
            else if(TextUtils.isEmpty(binding.roleText.text.toString())){
                binding.roleText.setError("Fill Role")
                return
            } else if(TextUtils.isEmpty(binding.emailText.text.toString())){
                binding.emailText.setError("Fill Email")
                return
            }
            else if(TextUtils.isEmpty(binding.passText.text.toString())){
                binding.passText.setError("Fill Password")
                return
            }
            else{
                Toast.makeText(requireContext(),"Successfully given",Toast.LENGTH_SHORT).show()
                return
            }
        }
    }

    private fun setPageStatus(binding: FragmentProfileBinding) {

        binding.pageStatus.setOnClickListener(View.OnClickListener {
            view ->
            if(status==true) {
                status = false;
                getPageStatus(binding)
            }else {status = true
                getPageStatus(binding)}
        })
    }

    private fun getPageStatus(binding: FragmentProfileBinding) {

        if(status==true){
            binding.nameText.visibility=View.GONE
            binding.pageStatus.setText("Don't have account")
            binding.role.visibility=View.GONE
            binding.toptext.setText("LOGIN")

            val colorValue1 = ContextCompat.getColor(requireContext(), R.color.white)

            binding.outLinearLayout.setBackgroundColor(colorValue1)

            binding.innerLayout.background=ContextCompat.getDrawable(requireContext(), bg_login)

            binding.view3.background= ContextCompat.getDrawable(requireContext(), rectangle_login)
        }else{
            binding.nameText.visibility=View.VISIBLE
            binding.pageStatus.setText("Already have account")
            binding.role.visibility=View.VISIBLE
            binding.toptext.setText("SIGNUP")
            val colorValue = ContextCompat.getColor(requireContext(), R.color.statustheme)

            binding.outLinearLayout.setBackgroundColor(colorValue)

            binding.innerLayout.background=ContextCompat.getDrawable(requireContext(), bg_login_white)

            binding.view3.background= ContextCompat.getDrawable(requireContext(),rectangle_login_white)
        }
    }


}


