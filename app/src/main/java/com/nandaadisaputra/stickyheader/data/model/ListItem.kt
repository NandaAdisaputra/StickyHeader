package com.nandaadisaputra.stickyheader.data.model

// Menggunakan sealed class agar hierarki turunan data terbatas secara ketat (type-safe)
sealed class ListItem {
    abstract val id: String

    // Sub-tipe data untuk Header (Kategori Katalog)
    data class Header(
        override val id: String,
        val title: String
    ) : ListItem()

    // Sub-tipe data untuk Konten (Materi Pembelajaran)
    data class Content(
        override val id: String,
        val title: String,
        val description: String
    ) : ListItem()
}