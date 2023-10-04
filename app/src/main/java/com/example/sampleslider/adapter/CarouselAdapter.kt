package com.example.sampleslider.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.sampleslider.databinding.AdapterCarouselBinding
import com.example.sampleslider.model.ItemCarousel

class CarouselAdapter(private val listCarousel: List<ItemCarousel>) : BaseAdapter() {
    override fun getCount() = listCarousel.size

    override fun getItem(position: Int) = listCarousel[position]

    override fun getItemId(position: Int) = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = convertView ?: AdapterCarouselBinding.inflate(
            LayoutInflater.from(parent?.context),
            parent,
            false,
        ).root
        bindView(view, position)
        return view
    }

    private fun bindView(view: View, position: Int) {
        with(AdapterCarouselBinding.bind(view)) {
            carouselTitle.text = root.context.getString(getItem(position).title)
            carouselImage.setImageResource(getItem(position).image)
        }
    }
}
