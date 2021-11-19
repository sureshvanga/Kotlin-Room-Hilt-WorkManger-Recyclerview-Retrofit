package com.demo.suresh.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.demo.suresh.model.RepositoryData
import com.demo.suresh.network.RetroRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(private val repository: RetroRepository)
    : ViewModel(){

    fun getAllRepositoryList(): LiveData<List<RepositoryData>> {
        return repository.getAllRecords()
    }

    fun makeApiCall() {
        repository.makeApiCall("ny")
    }
}