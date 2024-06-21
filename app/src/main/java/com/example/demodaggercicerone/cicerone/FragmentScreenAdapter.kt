package com.example.demodaggercicerone.cicerone

import androidx.fragment.app.Fragment

/**
 * @author y.gladkikh
 */
class FragmentScreenAdapter(val screen: () -> Fragment) {

    fun create(): Fragment = screen()
}
