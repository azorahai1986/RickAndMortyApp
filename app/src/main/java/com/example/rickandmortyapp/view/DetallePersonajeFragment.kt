package com.example.rickandmortyapp.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.rickandmortyapp.databinding.FragmentDetallePersonajeBinding
import com.example.rickandmortyapp.model.Character

private const val ARG_PARAM1 = "character"


class DetallePersonajeFragment(character: Character) : Fragment() {
    lateinit var binding:FragmentDetallePersonajeBinding
    private var character = character

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
         //   character = it.getString(ARG_PARAM1)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentDetallePersonajeBinding.inflate(inflater, container, false)

            Glide.with(requireActivity()).load(character.image).into(binding.imageCharacter)
            binding.name.text = character.name
            binding.especie.text = "Specie: "+character.species
            binding.status.text = "Status: "+character.status
            binding.gender.text = "Gender: "+character.gender
            binding.origen.text = "Origin: "+character.origin.name
            binding.location.text = "Location: "+ character.location.name
            binding.episodes.text = character.episode.toString()



        return binding.root
    }

    companion object {

       // @JvmStatic
       /* fun newInstance(characterRecived: Character) =
            DetallePersonajeFragment(character).apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, characterRecived)
                }
            }*/
    }
}