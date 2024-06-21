package com.example.demodaggercicerone

import com.example.demodaggercicerone.cicerone.Screen
import com.example.demodaggercicerone.cicerone.FragmentScreenAdapter
import com.example.demodaggercicerone.screens.BlankFragmentScreen

/**
 * @author y.gladkikh
 */
internal val SCREEN_PROVIDERS: Map<Class<out Screen>, FragmentScreenAdapter> = mapOf(
    BlankFragmentScreen::class.java to FragmentScreenAdapter { BlankFragment() },
)
