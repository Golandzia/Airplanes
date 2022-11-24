package com.example.airplanes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import com.example.airplanes.databinding.ActivityAirplanesBinding
import com.example.airplanes.databinding.ActivityMainBinding

private lateinit var binding: ActivityAirplanesBinding
private lateinit var airplanesArrayList: ArrayList<Airplane>

class AirplanesActivity : AppCompatActivity() {
    var numOfSelectedItem: Int = -1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityAirplanesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageViewCompanyLogo: ImageView = findViewById(R.id.imageViewSelectedCompany)
        val textViewTagline: TextView = findViewById(R.id.textViewTagline)
        val textViewCompanyInfo: TextView = findViewById(R.id.textViewCompanyInfo)

        val arguments: Bundle? = intent.extras
        if(arguments!=null){
            numOfSelectedItem = arguments.getInt("SELECTED_ITEM")
        }

        when(numOfSelectedItem){
            0->{
                imageViewCompanyLogo.setImageResource(R.drawable.boeing_logo)
                textViewTagline.text = getString(R.string.boeing_tagline)
                textViewCompanyInfo.text = getString(R.string.boeing_company_info)
                val airplanesNamesArray = arrayOf("777-200LR", "747-400")
                val firstImageIdArray = intArrayOf(R.drawable.first777, R.drawable.first_747)
                val secondImageIdArray = intArrayOf(R.drawable.second777, R.drawable.second_747)
                val thirdImageIdArray = intArrayOf(R.drawable.third777, R.drawable.third747)
                airplanesArrayList = ArrayList()
                for(i in airplanesNamesArray.indices){
                    var airplane = Airplane(airplanesNamesArray[i], firstImageIdArray[i], secondImageIdArray[i], thirdImageIdArray[i])
                    airplanesArrayList.add(airplane)
                }
                binding.ListViewAirplanes.adapter = ListViewAdapterWithThreImages(this, airplanesArrayList)
            }
            1->{
                imageViewCompanyLogo.setImageResource(R.drawable.airbus_logo)
                textViewTagline.text = getString(R.string.airbus_tagline)
                textViewCompanyInfo.text = getString(R.string.airbus_company_info)
                val airplanesNamesArray = arrayOf("A380", "A350-900")
                val firstImageIdArray = intArrayOf(R.drawable.first_a380, R.drawable.first_a350)
                val secondImageIdArray = intArrayOf(R.drawable.second_a380, R.drawable.second_a350)
                val thirdImageIdArray = intArrayOf(R.drawable.third_a380, R.drawable.third_a350)
                airplanesArrayList = ArrayList()
                for(i in airplanesNamesArray.indices){
                    val airplane = Airplane(airplanesNamesArray[i], firstImageIdArray[i], secondImageIdArray[i], thirdImageIdArray[i])
                    airplanesArrayList.add(airplane)
                }
                binding.ListViewAirplanes.adapter = ListViewAdapterWithThreImages(this, airplanesArrayList)
            }
            2->{
                imageViewCompanyLogo.setImageResource(R.drawable.concorde_logo)
                textViewTagline.text = getString(R.string.concorde_tagline)
                textViewCompanyInfo.text = getString(R.string.concorde_company_info)
                val airplanesNamesArray = arrayOf("Concorde")
                val firstImageIdArray = intArrayOf(R.drawable.concord_first)
                val secondImageIdArray = intArrayOf(R.drawable.concord_second)
                val thirdImageIdArray = intArrayOf(R.drawable.concord_third)
                airplanesArrayList = ArrayList()
                for(i in airplanesNamesArray.indices){
                    val airplane = Airplane(airplanesNamesArray[i], firstImageIdArray[i], secondImageIdArray[i], thirdImageIdArray[i])
                    airplanesArrayList.add(airplane)
                }
                binding.ListViewAirplanes.adapter = ListViewAdapterWithThreImages(this, airplanesArrayList)
            }
            3->{
                imageViewCompanyLogo.setImageResource(R.drawable.il_logo)
                textViewTagline.text = getString(R.string.il_tagline)
                textViewCompanyInfo.text = getString(R.string.il_company_info)
                val airplanesNamesArray = arrayOf("96-400M", "114-300")
                val firstImageIdArray = intArrayOf(R.drawable.il96_first, R.drawable.il114_first)
                val secondImageIdArray = intArrayOf(R.drawable.il96_second, R.drawable.il114_second)
                val thirdImageIdArray = intArrayOf(R.drawable.il96_third, R.drawable.il114_third)
                airplanesArrayList = ArrayList()
                for(i in airplanesNamesArray.indices){
                    val airplane = Airplane(airplanesNamesArray[i], firstImageIdArray[i], secondImageIdArray[i], thirdImageIdArray[i])
                    airplanesArrayList.add(airplane)
                }
                binding.ListViewAirplanes.adapter = ListViewAdapterWithThreImages(this, airplanesArrayList)
            }
            4->{
                imageViewCompanyLogo.setImageResource(R.drawable.tu_logo)
                textViewTagline.text = getString(R.string.tu_tagline)
                textViewCompanyInfo.text = getString(R.string.tu_company_info)
                val airplanesNamesArray = arrayOf("204-300", "144")
                val firstImageIdArray = intArrayOf(R.drawable.tu204_first, R.drawable.tu144_first)
                val secondImageIdArray = intArrayOf(R.drawable.tu204_second, R.drawable.tu144_second)
                val thirdImageIdArray = intArrayOf(R.drawable.tu204_third, R.drawable.tu144_third)
                airplanesArrayList = ArrayList()
                for(i in airplanesNamesArray.indices){
                    val airplane = Airplane(airplanesNamesArray[i], firstImageIdArray[i], secondImageIdArray[i], thirdImageIdArray[i])
                    airplanesArrayList.add(airplane)
                }
                binding.ListViewAirplanes.adapter = ListViewAdapterWithThreImages(this, airplanesArrayList)
            }

        }
    }
}