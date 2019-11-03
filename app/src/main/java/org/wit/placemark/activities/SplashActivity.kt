package org.wit.placemark.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_splash.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.startActivity
import org.wit.placemark.R

// 4 second splash screen
class SplashActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT: Long=4000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            startActivity(intentFor<PlacemarkListActivity>())
            finish()
        }, SPLASH_TIME_OUT)
    }
}