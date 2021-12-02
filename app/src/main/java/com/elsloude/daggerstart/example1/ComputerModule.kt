package com.elsloude.daggerstart.example1

import dagger.Module
import dagger.Provides
import java.security.Key

@Module
class ComputerModule {

    @Provides
    fun provideMonitor(): Monitor {
        return Monitor()
    }

    @Provides
    fun providesMouse(): Mouse {
        return Mouse()
    }

    @Provides
    fun providesKeyboard(): Keyboard {
        return Keyboard()
    }

    @Provides
    fun providesComputerTower(
        storage: Storage,
        processor: Processor,
        memory: Memory
    ): ComputerTower {
        return ComputerTower(storage, memory, processor)
    }

    @Provides
    fun providesStorage(): Storage {
        return Storage()
    }

    @Provides
    fun providesProcessor(): Processor {
        return Processor()
    }

    @Provides
    fun providesMemory(): Memory {
        return Memory()
    }

    @Provides
    fun provideComputer(
        monitor: Monitor,
        computerTower: ComputerTower,
        keyboard: Keyboard,
        mouse: Mouse
    ): Computer {
        return Computer(
            monitor, computerTower, keyboard, mouse
        )
    }


}