package com.example.rickandmortyapp.presenter

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rickandmortyapp.model.Api.CharacterList
import kotlinx.coroutines.launch
import retrofit2.Response

class SharedViewModel(private val repository: Repository):ViewModel() {

    var listcharacters = MutableLiveData<Response<CharacterList>>()

    fun getCharacters(page:Int){
        viewModelScope.launch {
            val characters = repository.getCharacters(page)
            listcharacters.value = characters
        }

    }
}