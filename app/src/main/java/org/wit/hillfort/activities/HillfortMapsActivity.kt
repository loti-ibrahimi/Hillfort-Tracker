package org.wit.hillfort.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import org.wit.hillfort.R

import kotlinx.android.synthetic.main.activity_hillfort_maps.*

class HillfortMapsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hillfort_maps)
        toolbar.title = title
        setSupportActionBar(toolbar)
    }
}
