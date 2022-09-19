package com.example.rickandmortyapp.model

import com.example.rickandmortyapp.model.Api.LocationData
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName

data class Character(
    var id:Int,
    var name:String,
    var status:String,
    var species:String,
    var gender:String,
    var image:String,
    var episode:List<String>,
    var origin: LocationData,
    var location: LocationData,
)

