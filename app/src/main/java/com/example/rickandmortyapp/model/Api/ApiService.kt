package com.example.rickandmortyapp.model.Api

import com.example.rickandmortyapp.model.Character
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService {
    @GET
   suspend fun getDataApi(@Url url:String):Response<Character>
}