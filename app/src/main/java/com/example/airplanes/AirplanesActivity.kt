package com.example.airplanes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
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

        //Этот код нужен для того чтобы AirplaneInfoActivity понял про какой именно самолёт он должен показать информацию
        var selectedByUserAirplane: MutableList<Int> = mutableListOf()

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
                selectedByUserAirplane.add(0,0)
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
                selectedByUserAirplane.add(0,1)
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
                selectedByUserAirplane.add(0,2)
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
                selectedByUserAirplane.add(0,3)
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
                selectedByUserAirplane.add(0,4)
            }
        }
        val listView: ListView = findViewById(R.id.ListViewAirplanes)
        listView.setOnItemClickListener{parent, view, position, id ->
            val intent = Intent(this@AirplanesActivity, AirplaneInfoActivity::class.java)
            selectedByUserAirplane.add(1, id.toInt())
            when(selectedByUserAirplane){
                mutableListOf(0, 0)->{
                    intent.putExtra("AIRPLANE_NAME", "777-200LR")
                }
                mutableListOf(0, 1)->{
                    intent.putExtra("AIRPLANE_NAME", "747-400")
                }
                mutableListOf(1, 0)->{
                    intent.putExtra("AIRPLANE_NAME", "A380")
                }
                mutableListOf(1, 1)->{
                    intent.putExtra("AIRPLANE_NAME", "A350-900")
                }
                mutableListOf(2, 0)->{
                    intent.putExtra("AIRPLANE_NAME", "Concorde")
                }
                mutableListOf(3, 0)->{
                        intent.putExtra("AIRPLANE_NAME", "96-400M")
                }
                mutableListOf(3, 1)->{
                    intent.putExtra("AIRPLANE_NAME", "114-300")
                }
                mutableListOf(4, 0)->{
                    intent.putExtra("AIRPLANE_NAME", "204-300")
                }
                mutableListOf(4, 1)->{
                    intent.putExtra("AIRPLANE_NAME", "144")
                }
            }
            startActivity(intent)
        }
    }
}