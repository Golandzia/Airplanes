package com.example.airplanes

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ListViewAdapterWithImage(private val context: Activity, private val arrayList: ArrayList<ManufactureOfArPlane>) : ArrayAdapter<ManufactureOfArPlane>(
            context, R.layout.simple_list_view_with_image, arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater: LayoutInflater = LayoutInflater.from(context)
        val view: View = inflater.inflate(R.layout.simple_list_view_with_image, null)

        val imageViewManufactureLogo: ImageView = view.findViewById(R.id.manufactureLogo)
        val textViewManufactureName: TextView = view.findViewById(R.id.manufactureName)

        imageViewManufactureLogo.setImageResource(arrayList[position].logoId)
        textViewManufactureName.text = arrayList[position].name

        return view
    }

}