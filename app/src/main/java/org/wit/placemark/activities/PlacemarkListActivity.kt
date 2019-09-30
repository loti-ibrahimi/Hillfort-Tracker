package org.wit.placemark.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.wit.placemark.R
import org.wit.placemark.main.MainApp

class PlacemarkListActivity : AppCompatActivity() {

    lateinit var app: MainApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placemark_list)
        app = application as MainApp
    }
}