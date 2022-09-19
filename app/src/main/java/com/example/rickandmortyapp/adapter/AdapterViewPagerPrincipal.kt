package com.example.rickandmortyapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.RecyclerView
import com.example.rickandmortyapp.R
import com.example.rickandmortyapp.databinding.ItemPagerPrincipalBinding
import com.example.rickandmortyapp.model.Character
import com.example.rickandmortyapp.view.DetallePersonajeFragment

class AdapterViewPagerPrincipal(fragment:FragmentActivity):RecyclerView.Adapter<AdapterViewPagerPrincipal.ViewHolder>() {

    val fragment = fragment
    private var listCharacter = emptyList<Character>()
    inner class ViewHolder(val binding:ItemPagerPrincipalBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(character:Character){

            binding.textName.text = character.name


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(ItemPagerPrincipalBinding.inflate(LayoutInflater.from(parent.context), parent, false))


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listCharacter[position])

        holder.itemView.setOnClickListener {
            gotoNextFragment(listCharacter[position])
        }

    }

    override fun getItemCount(): Int = listCharacter.size

    fun setCharacters(characters:List<Character>){

        listCharacter = characters
        notifyDataSetChanged()

    }

    fun gotoNextFragment(character: Character) {
        fragment.supportFragmentManager.beginTransaction().replace(R.id.container, DetallePersonajeFragment(character))
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN).addToBackStack(null).commit()
    }
}