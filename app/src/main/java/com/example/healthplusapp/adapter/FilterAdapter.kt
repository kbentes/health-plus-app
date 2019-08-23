package com.example.healthplusapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.healthplusapp.R
import com.example.healthplusapp.`object`.Clinic
import kotlinx.android.synthetic.main.filter_item.view.*
import java.util.*

class FilterAdapter(private val placeArrayList: ArrayList<Clinic>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private lateinit var itemClickListener: OnItemClickListener

    interface OnItemClickListener {
        fun onItemClick(view: View, obj: Clinic, position: Int)
    }

    fun setOnItemClickListener(mItemClickListener: OnItemClickListener) {
        this.itemClickListener = mItemClickListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.filter_item, parent, false)

        return ClinicViewHolder(itemView)
    }

    override fun onBindViewHolder(reholder: RecyclerView.ViewHolder, position: Int) {

        if (reholder is ClinicViewHolder) {
            val place = placeArrayList[position]

            reholder.placeNameTextView.text = place.name

            val context = reholder.placeHolderCardView.context

            val id = Utils.getDrawableInt(context, place.imageName)
            Utils.setImageToImageView(context, reholder.placeImageView, id)
            reholder.percentTextView.text = place.discount
            reholder.ratingTextView.text = place.totalRating


            if (Integer.parseInt(place.discount) > 0) {
                reholder.discountCardView.visibility = View.VISIBLE
                val discount = place.discount + "%"
                reholder.percentTextView.text = discount
            } else {
                reholder.discountCardView.visibility = View.GONE
            }

            reholder.placeHolderCardView.setOnClickListener { view ->
                itemClickListener.onItemClick(view, placeArrayList[position], position)

            }

        }

    }

    override fun getItemCount(): Int {
        return placeArrayList.size
    }

    inner class ClinicViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var placeImageView: ImageView = view.placeImageView
        var placeNameTextView: TextView = view.placeNameTextView
        var percentTextView: TextView = view.percentTextView
        var ratingTextView: TextView = view.ratingTextView
        var discountCardView: CardView = view.discountCardView
        var placeHolderCardView: CardView = view.placeHolderCardView

    }

}