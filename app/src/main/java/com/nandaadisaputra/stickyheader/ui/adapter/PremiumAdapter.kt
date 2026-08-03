package com.nandaadisaputra.stickyheader.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nandaadisaputra.stickyheader.R
import com.nandaadisaputra.stickyheader.data.model.ListItem
import com.nandaadisaputra.stickyheader.databinding.ItemContentBinding
import com.nandaadisaputra.stickyheader.databinding.ItemHeaderBinding

class PremiumAdapter(private val items: List<ListItem>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>(), StickyHeaderListener {

    companion object {
        const val VIEW_TYPE_HEADER = 0
        const val VIEW_TYPE_CONTENT = 1
    }

    // Menentukan jenis layout yang akan dipakai berdasarkan tipe objek di Sealed Class
    override fun getItemViewType(position: Int): Int {
        return when (items[position]) {
            is ListItem.Header -> VIEW_TYPE_HEADER
            is ListItem.Content -> VIEW_TYPE_CONTENT
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return if (viewType == VIEW_TYPE_HEADER) {
            // Memasang ViewBinding untuk layout Header
            HeaderViewHolder(ItemHeaderBinding.inflate(inflater, parent, false))
        } else {
            // Memasang ViewBinding untuk layout Konten
            ContentViewHolder(ItemContentBinding.inflate(inflater, parent, false))
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (val item = items[position]) {
            is ListItem.Header -> (holder as HeaderViewHolder).bind(item)
            is ListItem.Content -> (holder as ContentViewHolder).bind(item)
        }
    }

    override fun getItemCount(): Int = items.size

    // --- Implementasi Kontrak StickyHeaderListener ---
    override fun isHeader(itemPosition: Int): Boolean = items[itemPosition] is ListItem.Header

    override fun getHeaderLayout(headerPosition: Int): Int = R.layout.item_header

    override fun getHeaderPositionForItem(itemPosition: Int): Int {
        for (i in itemPosition downTo 0) {
            if (isHeader(i)) return i
        }
        return 0
    }

    override fun bindHeaderData(header: View, headerPosition: Int) {
        val binding = ItemHeaderBinding.bind(header)
        val title = (items[headerPosition] as ListItem.Header).title
        binding.tvHeaderTitle.text = title
    }

    // ViewHolder khusus untuk Header
    class HeaderViewHolder(private val binding: ItemHeaderBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ListItem.Header) {
            binding.tvHeaderTitle.text = item.title
        }
    }

    // ViewHolder khusus untuk Konten Materi
    class ContentViewHolder(private val binding: ItemContentBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item: ListItem.Content) {
            binding.tvContentTitle.text = item.title
            binding.tvContentDesc.text = item.description
        }
    }
}