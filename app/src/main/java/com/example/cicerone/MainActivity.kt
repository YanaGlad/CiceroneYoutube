package com.example.cicerone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cicerone.cicerone.Router
import com.example.cicerone.cicerone.ScreenProvider
import com.example.cicerone.screen.BlankFragmentScreen

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val router = Router(ScreenProvider(SCREEN_PROVIDERS), this)
        router.navigateTo(BlankFragmentScreen)
    }
}
