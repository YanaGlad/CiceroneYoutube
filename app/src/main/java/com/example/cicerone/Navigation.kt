package com.example.cicerone

import com.example.cicerone.cicerone.Screen
import com.example.cicerone.cicerone.FragmentScreenAdapter
import com.example.cicerone.screen.BlankFragmentScreen

/**
 * @author y.gladkikh
 */
internal val SCREEN_PROVIDERS: Map<Class<out Screen>, FragmentScreenAdapter> = mapOf(
    BlankFragmentScreen::class.java to FragmentScreenAdapter { BlankFragment() },
)
