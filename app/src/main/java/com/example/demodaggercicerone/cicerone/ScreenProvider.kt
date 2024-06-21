package com.example.demodaggercicerone.cicerone

import androidx.fragment.app.Fragment
import com.example.demodaggercicerone.SCREEN_PROVIDERS

/**
 * @author y.gladkikh
 */
class ScreenProvider(screenAdapters: Map<Class<out Screen>, FragmentScreenAdapter>) {

    private val screens: MutableList<Pair<Class<out Screen>, FragmentScreenAdapter>> = mutableListOf()

    init {
        screenAdapters.forEach { (screen, adapter) ->
            screens.add(Pair(screen, adapter))
        }
    }

    fun addAdapter(screen: Screen, adapter: FragmentScreenAdapter) {
        screens.add(Pair(screen::class.java, adapter))
    }

    fun getScreen(screen: Screen): Fragment {
        return requireNotNull(SCREEN_PROVIDERS[screen.screenKey()]?.create()) { "screen not found" }
    }
}
