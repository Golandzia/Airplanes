package com.example.airplanes

import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class AirplaneInfoActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_airplane_info)
        var selectedAirplane: String = ""

        val imageViewMainAirplanePhoto: ImageView = findViewById(R.id.imageViewMainAirplanePhoto)
        val textViewCharacteristics: TextView = findViewById(R.id.textViewCharacteristics)
        val textViewFirstFlight: TextView = findViewById(R.id.textViewFirstFlight)
        val imageViewPlaneInFlight: ImageView = findViewById(R.id.imageViewPlaneInFlight)
        val textViewDesignPeculiarity: TextView = findViewById(R.id.textViewDesignPeculiarity)
        val imageViewConstruction: ImageView = findViewById(R.id.imageViewConstruction)
        val textViewTechnicalInnovations: TextView = findViewById(R.id.textViewTechnicalInnovations)
        val imageViewCrewCabin: ImageView = findViewById(R.id.imageViewCrewCabin)
        val textViewComfort: TextView = findViewById(R.id.textViewComfort)
        val imageViewComfort: ImageView = findViewById(R.id.imageViewComfort)

        val arguments: Bundle? = intent.extras
        if(arguments!=null){
            selectedAirplane = arguments.getString("AIRPLANE_NAME").toString()
        }
        when(selectedAirplane){
            "777-200LR"->{
                imageViewMainAirplanePhoto.setImageResource(R.drawable.main_photo_777)
                textViewCharacteristics.setText(R.string.boeing_777_200LR_characteristics)
                textViewFirstFlight.setText(R.string.boeing_777_200LR_first_flight)
                textViewDesignPeculiarity.setText(R.string.boeing_777_200LR_design_peculiarity)
                textViewTechnicalInnovations.setText(R.string.boeing_777_200LR_technical_innovations)
                textViewComfort.setText(R.string.boeing_777_200LR_comfort)
                imageViewComfort.setImageResource(R.drawable.comfort_777)
                imageViewPlaneInFlight.setImageResource(R.drawable.in_flight_777)
                imageViewCrewCabin.setImageResource(R.drawable.crew_cabine_777)
                imageViewConstruction.setImageResource(R.drawable.construction_777)
            }
            "747-400"->{
                imageViewMainAirplanePhoto.setImageResource(R.drawable.main_photo_747)
                textViewCharacteristics.setText(R.string.boeing_747_400_characteristics)
                textViewFirstFlight.setText(R.string.boeing_747_400_first_flight)
                textViewDesignPeculiarity.setText(R.string.boeing_747_400_design_peculiarity)
                textViewTechnicalInnovations.setText(R.string.boeing_747_400_technical_innovations)
                textViewComfort.setText(R.string.boeing_747_400_comfort)
                imageViewComfort.setImageResource(R.drawable.comfort_747)
                imageViewPlaneInFlight.setImageResource(R.drawable.in_flight_747)
                imageViewCrewCabin.setImageResource(R.drawable.crew_cabine_747)
                imageViewConstruction.setImageResource(R.drawable.construction_747)
            }
            "A380"->{
                imageViewMainAirplanePhoto.setImageResource(R.drawable.main_photo_a380)
                textViewCharacteristics.setText(R.string.airbus_a380_characteristics)
                textViewFirstFlight.setText(R.string.airbus_a380_first_flight)
                textViewDesignPeculiarity.setText(R.string.airbus_a380_design_peculiarity)
                textViewTechnicalInnovations.setText(R.string.airbus_a380_technical_innovations)
                textViewComfort.setText(R.string.airbus_a380_comfort)
                imageViewComfort.setImageResource(R.drawable.comfort_a380)
                imageViewPlaneInFlight.setImageResource(R.drawable.in_flight_a380)
                imageViewCrewCabin.setImageResource(R.drawable.crew_cabine_a380)
                imageViewConstruction.setImageResource(R.drawable.construction_a380)
            }
            "A350-900"->{
                imageViewMainAirplanePhoto.setImageResource(R.drawable.main_photo_a350)
                textViewCharacteristics.setText(R.string.airbus_a350_900_characteristics)
                textViewFirstFlight.setText(R.string.airbus_a350_900_first_flight)
                textViewDesignPeculiarity.setText(R.string.airbus_a350_900_design_peculiarity)
                textViewTechnicalInnovations.setText(R.string.airbus_a350_900_technical_innovations)
                textViewComfort.setText(R.string.airbus_a350_900_comfort)
                imageViewComfort.setImageResource(R.drawable.comfort_350)
                imageViewPlaneInFlight.setImageResource(R.drawable.in_flight_a350)
                imageViewCrewCabin.setImageResource(R.drawable.crew_cabine_a350)
                imageViewConstruction.setImageResource(R.drawable.construction_a350)
            }
            "Concorde"->{
                imageViewMainAirplanePhoto.setImageResource(R.drawable.main_photo_concorde)
                textViewCharacteristics.setText(R.string.concorde_characteristics)
                textViewFirstFlight.setText(R.string.concorde_first_flight)
                textViewDesignPeculiarity.setText(R.string.concorde_design_peculiarity)
                textViewTechnicalInnovations.setText(R.string.concorde_technical_innovations)
                textViewComfort.setText(R.string.concorde_comfort)
                imageViewComfort.setImageResource(R.drawable.comfort_concorde)
                imageViewPlaneInFlight.setImageResource(R.drawable.in_flight_concorde)
                imageViewCrewCabin.setImageResource(R.drawable.crew_cabine_concorde)
                imageViewConstruction.setImageResource(R.drawable.construction_concorde)
            }
            "96-400M"->{
                imageViewMainAirplanePhoto.setImageResource(R.drawable.main_photo_il96)
                textViewCharacteristics.setText(R.string.il_96_400M_characteristics)
                textViewFirstFlight.setText(R.string.il_96_400M_first_flight)
                textViewDesignPeculiarity.setText(R.string.il_96_400M_design_peculiarity)
                textViewTechnicalInnovations.setText(R.string.il_96_400M_technical_innovations)
                textViewComfort.setText(R.string.il_96_400M_comfort)
                imageViewComfort.setImageResource(R.drawable.comfort_il96)
                imageViewPlaneInFlight.setImageResource(R.drawable.in_flight_il96)
                imageViewCrewCabin.setImageResource(R.drawable.crew_cabine_il96)
                imageViewConstruction.setImageResource(R.drawable.construction_il96)
            }
            "114-300"->{
                imageViewMainAirplanePhoto.setImageResource(R.drawable.main_photo_il114)
                textViewCharacteristics.setText(R.string.il_114_300_characteristics)
                textViewFirstFlight.setText(R.string.il_114_300_first_flight)
                textViewDesignPeculiarity.setText(R.string.il_114_300_design_peculiarity)
                textViewTechnicalInnovations.setText(R.string.il_114_300_technical_innovations)
                textViewComfort.setText(R.string.il_114_300_comfort)
                imageViewComfort.setImageResource(R.drawable.comfort_il114)
                imageViewPlaneInFlight.setImageResource(R.drawable.in_flight_il114)
                imageViewCrewCabin.setImageResource(R.drawable.crew_cabine_il114)
                imageViewConstruction.setImageResource(R.drawable.construction_il114)
            }
            "204-300"->{
                imageViewMainAirplanePhoto.setImageResource(R.drawable.main_photo_tu204)
                textViewCharacteristics.setText(R.string.tu_204_300_characteristics)
                textViewFirstFlight.setText(R.string.tu_204_300_first_flight)
                textViewDesignPeculiarity.setText(R.string.tu_204_300_design_peculiarity)
                textViewTechnicalInnovations.setText(R.string.tu_204_300_technical_innovations)
                textViewComfort.setText(R.string.tu_204_300_comfort)
                imageViewComfort.setImageResource(R.drawable.comfort_tu204)
                imageViewPlaneInFlight.setImageResource(R.drawable.in_flight_tu204)
                imageViewCrewCabin.setImageResource(R.drawable.crew_cabine_tu204)
                imageViewConstruction.setImageResource(R.drawable.construction_tu204)
            }
            "144"->{
                imageViewMainAirplanePhoto.setImageResource(R.drawable.main_photo_tu144)
                textViewCharacteristics.setText(R.string.tu_144_characteristics)
                textViewFirstFlight.setText(R.string.tu_144_first_flight)
                textViewDesignPeculiarity.setText(R.string.tu_144_design_peculiarity)
                textViewTechnicalInnovations.setText(R.string.tu_144_technical_innovations)
                textViewComfort.setText(R.string.tu_144_comfort)
                imageViewComfort.setImageResource(R.drawable.comfort_tu144)
                imageViewPlaneInFlight.setImageResource(R.drawable.in_flight_tu144)
                imageViewCrewCabin.setImageResource(R.drawable.crew_cabine_tu144)
                imageViewConstruction.setImageResource(R.drawable.construction_tu144)
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        val intent = Intent(this@AirplaneInfoActivity, MainActivity::class.java)
        startActivity(intent)
    }
}