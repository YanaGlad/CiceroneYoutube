package com.example.cicerone.cicerone

import androidx.appcompat.app.AppCompatActivity
import java.util.Stack

/**
 * @author y.gladkikh
 */
class CommandBuffer(screenProvider: ScreenProvider, activity: AppCompatActivity) {

    private val navigator = Navigator(screenProvider, activity)

    private val commands: Stack<Command> = Stack()

    fun execute(command: Command) {
        commands.add(command)
        navigator.applyCommands(commands)
    }
}
