package com.example.rickandmortyapp.view

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.rickandmortyapp.adapter.AdapterViewPagerPrincipal
import com.example.rickandmortyapp.databinding.FragmentPrincipalBinding
import com.example.rickandmortyapp.model.Api.CharacterList
import com.example.rickandmortyapp.presenter.SharedViewModel
import com.example.rickandmortyapp.presenter.SharedViewmodelFactory
import com.example.rickandmortyapp.presenter.Repository


class principalFragment : Fragment() {

    private var mParam1: String? = null
    private var mParam2: String? = null
    lateinit var binding:FragmentPrincipalBinding
    var adapterPager:AdapterViewPagerPrincipal? = null

    private val sharedViewModel: SharedViewModel by activityViewModels{
        SharedViewmodelFactory(
        Repository()
    )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            mParam1 = requireArguments().getString(ARG_PARAM1)
            mParam2 = requireArguments().getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPrincipalBinding.inflate(inflater, container, false)

        adapterPager = AdapterViewPagerPrincipal(context as FragmentActivity)

        binding.recyclerViewPrincipal.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerViewPrincipal.adapter = adapterPager

        sharedViewModel.listcharacters.observe(viewLifecycleOwner, Observer { response ->
            if (response.isSuccessful){

                adapterPager!!.setCharacters(response.body()!!.results)
               // adapterPager?.items = response.body()!! as ArrayList<CharacterList> /* = java.util.ArrayList<com.example.rickandmortyapp.model.Api.CharacterList> */

                Log.e("Result", adapterPager.toString())

            }else{
                Log.e("ERROR", response.code().toString())
            }
        })



        return binding.root
    }

    companion object {

        private const val ARG_PARAM1 = "param1"
        private const val ARG_PARAM2 = "param2"

        fun newInstance(param1: String?, param2: String?): principalFragment {
            val fragment = principalFragment()
            val args = Bundle()
            args.putString(ARG_PARAM1, param1)
            args.putString(ARG_PARAM2, param2)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        sharedViewModel.getCharacters(1)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }
}