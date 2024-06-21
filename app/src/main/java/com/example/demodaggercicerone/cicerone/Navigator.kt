package com.example.demodaggercicerone.cicerone

import androidx.appcompat.app.AppCompatActivity
import com.example.demodaggercicerone.R
import java.util.Stack

/**
 * @author y.gladkikh
 */
class Navigator(
    private val screenProvider: ScreenProvider,
    private val activity: AppCompatActivity
) {

    fun applyCommands(commands: Stack<Command>) {
        commands.forEach { command ->
            when (command) {
                is Command.Back -> {
                    val fragment = screenProvider.getScreen(command.screen)

                    activity.supportFragmentManager.beginTransaction()
                        .remove(fragment)
                        .commit()
                }

                is Command.Forward -> {
                    val fragment = screenProvider.getScreen(command.screen)

                    activity.supportFragmentManager.beginTransaction()
                        .add(R.id.container, fragment, fragment.tag)
                        .commit()
                }
            }
        }
    }
}
