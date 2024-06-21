package com.example.demodaggercicerone.cicerone

import android.util.Log
import androidx.fragment.app.Fragment
import com.example.demodaggercicerone.SCREEN_PROVIDERS

/**
 * @author y.gladkikh
 */
class ScreenProvider(screenAdapters: Map<Class<out Screen>, FragmentScreenAdapter>) {

    private val screens: MutableMap<Class<out Screen>, FragmentScreenAdapter> = mutableMapOf()

    init {
        screenAdapters.forEach { (screen, adapter) ->
            screens[screen] = adapter
        }
    }

    fun addAdapter(screen: Screen, adapter: FragmentScreenAdapter) {
        screens[screen.screenKey()] = adapter
    }

    fun getScreen(matcher: Screen): Fragment {
        return requireNotNull(screens[matcher.screenKey()]?.create()) { "screen not found" }
    }
}
