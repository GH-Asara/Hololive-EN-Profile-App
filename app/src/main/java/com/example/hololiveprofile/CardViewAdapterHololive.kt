package com.example.hololiveprofile

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions


class CardViewAdapterHololive(private val listHero: ArrayList<Hololive>) :
    RecyclerView.Adapter<CardViewAdapterHololive.CardViewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_cardview_hololive, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val hero = listHero[position]
        Glide.with(holder.itemView.context)
            .load(hero.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.tvName.text = hero.name
        holder.tvDetail.text = hero.detail
        holder.btnShare.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            val shareBody = "Check out Hololive on their website! \n https://en.hololive.tv/"
            val shareSubject = "Hey! Check out this great Project!"
            intent.putExtra(Intent.EXTRA_TEXT, shareBody)
            intent.putExtra(Intent.EXTRA_SUBJECT, shareSubject)
            holder.itemView.context.startActivity(Intent.createChooser(intent, "Share With:"))
        }
        holder.itemView.setOnClickListener {
            val activity = holder.itemView.context as Activity
            val moveIntent = Intent(activity, DetailPage::class.java)
            moveIntent.putExtra(DetailPage.EXTRA_NAME, holder.tvName.text.toString())
            holder.itemView.context.startActivity(moveIntent)
        }
    }

    override fun getItemCount(): Int {
        return listHero.size
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var btnShare: Button = itemView.findViewById(R.id.btn_set_share)
    }
}
