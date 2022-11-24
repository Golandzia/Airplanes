package com.example.airplanes

import android.app.Activity
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ListViewAdapterWithThreImages(private val context: Activity, private val arrayList: ArrayList<Airplane>) : ArrayAdapter<Airplane>(
    context, R.layout.simple_list_view_with_3_images, arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater: LayoutInflater = LayoutInflater.from(context)
        val view: View = inflater.inflate(R.layout.simple_list_view_with_3_images, null)

        val textViewAirplaneName: TextView = view.findViewById(R.id.textViewModelName)
        val imageViewFirstAirplanePhoto: ImageView = view.findViewById(R.id.imageViewFirstAirplanePhoto)
        val imageViewSecondAirplanePhoto: ImageView = view.findViewById(R.id.imageViewSecondAirplanePhoto)
        val imageViewThirdAirplanePhoto: ImageView = view.findViewById(R.id.imageViewThirdAirplanePhoto)

        textViewAirplaneName.text = arrayList[position].name
        imageViewFirstAirplanePhoto.setImageResource(arrayList[position].firstImageId)
        imageViewSecondAirplanePhoto.setImageResource(arrayList[position].secondImageId)
        imageViewThirdAirplanePhoto.setImageResource(arrayList[position].thirdImageId)

        return view
    }
}