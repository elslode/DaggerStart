package com.elsloude.daggerstart.example1

import dagger.Component
import javax.inject.Inject

@Component
interface NewComponent {

    fun getKeyboard(): Keyboard
    fun getMouse(): Mouse
    fun getMonitor(): Monitor

    fun inject(activity: Activity)


}