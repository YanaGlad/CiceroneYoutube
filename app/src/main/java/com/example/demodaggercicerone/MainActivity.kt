package com.example.demodaggercicerone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demodaggercicerone.cicerone.Router
import com.example.demodaggercicerone.cicerone.ScreenProvider
import com.example.demodaggercicerone.screen.BlankFragmentScreen

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val router = Router(ScreenProvider(SCREEN_PROVIDERS), this)
        router.navigateTo(BlankFragmentScreen)
    }
}
