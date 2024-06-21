package com.example.cicerone.cicerone

/**
 * @author y.gladkikh
 */
interface Screen {
    fun screenKey(): Class<out Screen> = this::class.java
}
