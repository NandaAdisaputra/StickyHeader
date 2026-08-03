package com.nandaadisaputra.stickyheader.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.nandaadisaputra.stickyheader.data.repository.KatalogRepository

// Diperlukan karena MainViewModel membutuhkan parameter (Repository) pada konstruktornya
class ViewModelFactory(private val repository: KatalogRepository) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        // Memeriksa apakah kelas yang diminta adalah MainViewModel
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}