package com.nandaadisaputra.stickyheader.ui.main

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.nandaadisaputra.stickyheader.data.model.ListItem
import com.nandaadisaputra.stickyheader.data.repository.KatalogRepository
import com.nandaadisaputra.stickyheader.databinding.ActivityMainBinding
import com.nandaadisaputra.stickyheader.ui.adapter.PremiumAdapter
import com.nandaadisaputra.stickyheader.ui.adapter.StickyHeaderItemDecoration
import com.nandaadisaputra.stickyheader.viewmodel.MainViewModel
import com.nandaadisaputra.stickyheader.viewmodel.ViewModelFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: PremiumAdapter

    // Menghubungkan Activity dengan MainViewModel menggunakan bantuan ViewModelFactory
    private val viewModel: MainViewModel by viewModels {
        ViewModelFactory(KatalogRepository())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Menginisialisasi ViewBinding untuk activity_main.xml
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupObservers() // Mulai mengamati perubahan data dari ViewModel
    }

    private fun setupObservers() {
        // Activity bertindak sebagai observer; otomatis berjalan saat data di ViewModel siap/berubah
        viewModel.katalogData.observe(this) { dataList ->
            setupRecyclerView(dataList)
        }
    }

    private fun setupRecyclerView(dataList: List<ListItem>) {
        adapter = PremiumAdapter(dataList)

        binding.rvKatalog.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            this.adapter = this@MainActivity.adapter

            // Mencegah penambahan dekorasi ganda apabila terjadi perubahan konfigurasi (seperti rotasi layar)
            if (itemDecorationCount == 0) {
                addItemDecoration(StickyHeaderItemDecoration(this@MainActivity.adapter))
            }
        }
    }
}