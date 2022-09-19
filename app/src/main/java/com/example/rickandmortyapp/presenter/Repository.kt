package com.example.rickandmortyapp.presenter

import com.example.rickandmortyapp.model.Api.CharacterList
import com.example.rickandmortyapp.model.Api.RetrofitInstance
import retrofit2.Response
import retrofit2.Retrofit

class Repository {
    suspend fun getCharacters(page:Int): Response<CharacterList>{
        return RetrofitInstance.api.getCharacters(page)
    }
}