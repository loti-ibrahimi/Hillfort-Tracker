package org.wit.placemark.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_placemark.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.toast
import org.wit.placemark.R
import org.wit.placemark.main.MainApp
import org.wit.placemark.models.PlacemarkModel

class PlacemarkActivity : AppCompatActivity(), AnkoLogger {

    var placemark = PlacemarkModel()
    // Reference to MainApp object:
    // lateint qualifier:
    lateinit var app: MainApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placemark)
        // Initialisation of MainApp object.
        app = application as MainApp

        btnAdd.setOnClickListener() {
            placemark.title = placemarkTitle.text.toString()
            placemark.description = placemarkDescription.text.toString()
            if(placemark.title.isNotEmpty() && placemark.description.isNotEmpty()) {
                // MainApp object being used.
                app.placemarks.add(placemark.copy())
                info("[Add] Button Pressed: ${placemark}")
                for (i in app.placemarks.indices) {
                    info("Placemark[$i]:${app.placemarks[i]}")
                }
            }
            else {
                toast ("Please Enter a title & description")
            }
        }
    }
}
