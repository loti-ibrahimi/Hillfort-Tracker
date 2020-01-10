package org.wit.hillfort.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import org.jetbrains.anko.intentFor
import org.wit.hillfort.R
import org.wit.hillfort.views.hillfortlist.HillfortListView
import org.wit.hillfort.views.login.LoginView

// 4 second splash screen
class SplashActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT: Long=4000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            startActivity(intentFor<LoginView>())
            finish()
        }, SPLASH_TIME_OUT)
    }
}