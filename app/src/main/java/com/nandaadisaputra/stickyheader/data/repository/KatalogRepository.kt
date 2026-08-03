package com.nandaadisaputra.stickyheader.data.repository

import com.nandaadisaputra.stickyheader.data.model.ListItem

// Repository berfungsi sebagai Single Source of Truth (pusat penyedia data)
class KatalogRepository {
    fun getKatalogPelatihan(): List<ListItem> {
        return listOf(
            // Header 1
            ListItem.Header("H01", "Persiapan Kompetisi IT LKS"),
            ListItem.Content("C01", "Studi Kasus PPDB", "Merancang alur pendaftaran siswa baru"),
            ListItem.Content("C02", "Sistem Presensi Guru", "Logika absensi dan rekapitulasi data"),
            ListItem.Content("C03", "Kunjungan Industri TVRI", "Aplikasi pelaporan dan metodologi aktif"),

            // Header 2
            ListItem.Header("H02", "Modul Backend Web API"),
            ListItem.Content("C04", "Arsitektur ASP.NET Core", "Pembuatan native API tanpa library pihak ketiga"),
            ListItem.Content("C05", "Framework Laravel PHP", "Routing, Controller, dan API Resource"),
            ListItem.Content("C06", "Autentikasi JWT", "Keamanan endpoint berbasis token pada layanan web"),

            // Header 3
            ListItem.Header("H03", "Manajemen Database"),
            ListItem.Content("C07", "SQL Server", "Relasi tabel, Stored Procedure, dan Trigger"),
            ListItem.Content("C08", "Optimasi Query", "Analisis resource untuk aplikasi skala menengah"),
            ListItem.Content("C09", "Backup & Recovery Strategy", "Keamanan data dan pencegahan kegagalan sistem"),

            // Header 4
            ListItem.Header("H04", "Modul Android Native"),
            ListItem.Content("C10", "XML Layouting", "Desain antarmuka responsif untuk katalog"),
            ListItem.Content("C11", "Jetpack Compose", "Migrasi ke UI deklaratif modern"),
            ListItem.Content("C12", "ViewModel & LiveData", "Pola arsitektur MVVM untuk reaktifitas data"),

            // Header 5
            ListItem.Header("H05", "Keamanan Jaringan & Server"),
            ListItem.Content("C13", "Konfigurasi Firewall UFW", "Pengaturan aturan akses port pada Linux server"),
            ListItem.Content("C14", "Manajemen SSL/TLS Certificate", "Penerapan HTTPS menggunakan Let's Encrypt"),

            // Header 6
            ListItem.Header("H06", "DevOps & Deployment"),
            ListItem.Content("C15", "Docker Containerization", "Membungkus aplikasi backend ke dalam container"),
            ListItem.Content("C16", "CI/CD Pipeline GitHub Actions", "Otomatisasi build dan testing kode program"),

            // Header 7
            ListItem.Header("H07", "UI/UX & Frontend Dasar"),
            ListItem.Content("C17", "Figma Prototyping", "Membuat wireframe dan desain antarmuka aplikasi"),
            ListItem.Content("C18", "HTML5 & Semantic Markup", "Penyusunan struktur dokumen web yang standar"),

            // Header 8
            ListItem.Header("H08", "Manajemen Proyek & Kolaborasi"),
            ListItem.Content("C19", "Git Version Control", "Penggunaan Branching, Merge, dan Resolusi Konflik"),
            ListItem.Content("C20", "Metodologi Agile/Scrum", "Penerapan sprint dan manajemen tugas tim pengembang"),

            // Header 9
            ListItem.Header("H09", "Cloud Computing Dasar"),
            ListItem.Content("C21", "Amazon Web Services (AWS)", "Pengenalan EC2, S3, dan IAM dasar"),
            ListItem.Content("C22", "Google Cloud Platform", "Manajemen instance virtual dan deployment awal"),

            // Header 10
            ListItem.Header("H10", "Internet of Things (IoT)"),
            ListItem.Content("C23", "ESP32 & Arduino IDE", "Pemrograman mikrokontroler terhubung Wi-Fi"),
            ListItem.Content("C24", "MQTT Protocol", "Komunikasi data ringan untuk perangkat sensor"),

            // Header 11
            ListItem.Header("H11", "Kecerdasan Buatan (AI) Dasar"),
            ListItem.Content("C25", "Pengenalan Machine Learning", "Konsep dasar regresi dan klasifikasi data"),
            ListItem.Content("C26", "Python untuk Analisis Data", "Penggunaan library Pandas dan NumPy"),

            // Header 12
            ListItem.Header("H12", "Pengembangan Game Edukasi"),
            ListItem.Content("C27", "Godot Engine Dasar", "Pembuatan logika 2D dan pergerakan objek"),
            ListItem.Content("C28", "Construct 3", "Pengembangan game berbasis event tanpa kode rumit"),

            // Header 13
            ListItem.Header("H13", "Kewirausahaan & Digital Marketing"),
            ListItem.Content("C29", "SEO On-Page & Off-Page", "Optimalisasi mesin pencari untuk situs web sekolah"),
            ListItem.Content("C30", "Social Media Analytics", "Membaca metrik keterjangkauan audiens digital"),

            // Header 14
            ListItem.Header("H14", "Pengujian Perangkat Lunak (QA)"),
            ListItem.Content("C31", "Black Box Testing", "Pengujian fungsionalitas antarmuka aplikasi"),
            ListItem.Content("C32", "Postman API Testing", "Validasi endpoint backend secara manual"),

            // Header 15
            ListItem.Header("H15", "Etika Profesi & Portofolio"),
            ListItem.Content("C33", "Penyusunan Portofolio GitHub", "Menampilkan riwayat kode program secara profesional"),
            ListItem.Content("C34", "Etika Kerja Industri IT", "Standar operasional prosedur di dunia kerja profesional")
        )
    }
}