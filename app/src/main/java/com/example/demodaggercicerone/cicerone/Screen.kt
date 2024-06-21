package com.example.demodaggercicerone.cicerone

/**
 * @author y.gladkikh
 */
interface Screen {
    fun screenKey(): Class<out Screen> = this::class.java
}
