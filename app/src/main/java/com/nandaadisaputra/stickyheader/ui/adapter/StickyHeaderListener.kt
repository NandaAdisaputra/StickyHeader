package com.nandaadisaputra.stickyheader.ui.adapter

import android.view.View

// Kontrak komunikasi antara ItemDecoration (Dekorasi Canvas) dengan Adapter RecyclerView
interface StickyHeaderListener {
    fun isHeader(itemPosition: Int): Boolean
    fun getHeaderLayout(headerPosition: Int): Int
    fun getHeaderPositionForItem(itemPosition: Int): Int
    fun bindHeaderData(header: View, headerPosition: Int)
}