package com.elsloude.daggerstart.example1

import javax.inject.Inject

class ComputerTower (
    val storage: Storage,
    val memory: Memory,
    val processor: Processor
) {
}