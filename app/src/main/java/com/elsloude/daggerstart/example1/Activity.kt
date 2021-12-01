package com.elsloude.daggerstart.example1

import javax.inject.Inject

class Activity {

//    val keyboard: Keyboard = DaggerNewComponent.create().getKeyboard()
//    val mouse: Mouse = DaggerNewComponent.create().getMouse()
//    val monitor: Monitor = DaggerNewComponent.create().getMonitor()

    @Inject
    lateinit var monitor: Monitor
    @Inject
    lateinit var mouse: Mouse
    @Inject
    lateinit var keyboard: Keyboard

    init {
        DaggerNewComponent.create().inject(this)
    }
}