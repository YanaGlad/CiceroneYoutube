package com.example.cicerone.cicerone

/**
 * @author y.gladkikh
 */
sealed interface Command {

    class Forward(val screen: Screen) : Command

    class Back(val screen: Screen) : Command
}
