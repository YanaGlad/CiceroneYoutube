package com.example.demodaggercicerone.cicerone

import androidx.appcompat.app.AppCompatActivity

/**
 * @author y.gladkikh
 */
class Router(screenProvider: ScreenProvider, activity: AppCompatActivity) {

    val commandBuffer = CommandBuffer(screenProvider, activity)

    fun navigateTo(screen: Screen) {
        commandBuffer.execute(Command.Forward(screen))
    }

    fun back(screen: Screen) {
        commandBuffer.execute(Command.Back(screen))
    }
}
