package com.nandaadisaputra.stickyheader.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nandaadisaputra.stickyheader.data.model.ListItem
import com.nandaadisaputra.stickyheader.data.repository.KatalogRepository

class MainViewModel(private val repository: KatalogRepository) : ViewModel() {

    // MutableLiveData bersifat privat agar isinya tidak bisa diubah sembarangan dari luar (Activity)
    private val _katalogData = MutableLiveData<List<ListItem>>()

    // LiveData publik yang bersifat read-only untuk diamati oleh Activity/UI
    val katalogData: LiveData<List<ListItem>> = _katalogData

    init {
        loadKatalog() // Memuat data saat ViewModel pertama kali dibentuk
    }

    private fun loadKatalog() {
        // Mengambil data dari repository dan memasukkannya ke dalam LiveData
        _katalogData.value = repository.getKatalogPelatihan()
    }
}