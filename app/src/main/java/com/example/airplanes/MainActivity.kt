package com.example.airplanes

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.airplanes.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding
private lateinit var manufactureArrayList: ArrayList<ManufactureOfArPlane>

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageIdArray = intArrayOf(
            R.drawable.boeing_logo,
            R.drawable.airbus_logo,
            R.drawable.concorde_logo,
            R.drawable.il_logo,
            R.drawable.tu_logo
        )
        val manufacturesNamesArray = arrayOf(
            "Boeing", "Airbus", "Concorde", "Ил (Ильюшин)", "Ту (Туполев)"
        )

        manufactureArrayList = ArrayList()
        for(i in manufacturesNamesArray.indices){
            val manufacture = ManufactureOfArPlane(manufacturesNamesArray[i], imageIdArray[i])
            manufactureArrayList.add(manufacture)
        }
        binding.ListViewManufactures.adapter = ListViewAdapterWithImage(this, manufactureArrayList)

        val listView: ListView = findViewById(R.id.ListViewManufactures)
        listView.setOnItemClickListener{parent, view, position, id ->
            val intent = Intent(this@MainActivity, AirplanesActivity::class.java)
            intent.putExtra("SELECTED_ITEM", id.toInt())
            startActivity(intent)
        }

    }
    fun aboutActivityButton(item: MenuItem){
        val intent = Intent(this@MainActivity, AboutProgramActivity::class.java)
        startActivity(intent)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_manu, menu)
        return true
    }
}