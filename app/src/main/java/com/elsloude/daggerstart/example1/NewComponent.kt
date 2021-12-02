package com.elsloude.daggerstart.example1

import dagger.Component
import dagger.Module
import javax.inject.Inject

@Component(modules = [ComputerModule::class])
interface NewComponent {

    fun inject(activity: Activity)
}