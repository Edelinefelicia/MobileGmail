package com.example.gmail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gmail.databinding.ItemPesanBinding
typealias OnClickGmail = (PesanGmailModel) -> Unit
class GmailAdapter(private val listpesangmail : List<PesanGmailModel>,private val onClickGmail: OnClickGmail) : RecyclerView.Adapter<GmailAdapter.ItemPesanViewHolder>() {
    inner class ItemPesanViewHolder(private val binding: ItemPesanBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: PesanGmailModel) {
            with(binding) {
                val previewText = data.titlePesan.split(" ").take(4).joinToString(" ") + "…"
                txtNamaPengirim.text = data.pengirimPesan
                txtTanggal.text = data.tanggalPesan
                txtTitle.text = previewText
                itemView.setOnClickListener {
                    onClickGmail(data)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemPesanViewHolder {
        val binding =
            ItemPesanBinding.inflate(
                LayoutInflater.from(parent.context), parent,
                false)
        return ItemPesanViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listpesangmail.size
    }

    override fun onBindViewHolder(holder: ItemPesanViewHolder, position: Int) {
        holder.bind(listpesangmail[position])
    }
}