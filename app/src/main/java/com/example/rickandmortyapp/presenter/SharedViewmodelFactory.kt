package com.example.rickandmortyapp.presenter

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class SharedViewmodelFactory(private val repository: Repository): ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return SharedViewModel(repository) as T
    }

}