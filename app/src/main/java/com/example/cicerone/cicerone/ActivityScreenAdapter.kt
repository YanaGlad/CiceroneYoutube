package com.example.cicerone.cicerone

import android.app.Activity

/**
 * @author y.gladkikh
 */
class ActivityScreenAdapter(val screen: () -> Activity) {

    fun create(): Activity = screen()
}
