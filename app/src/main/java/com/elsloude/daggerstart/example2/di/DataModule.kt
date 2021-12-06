package com.elsloude.daggerstart.example2.di

import android.content.Context
import com.elsloude.daggerstart.example2.data.datasource.ExampleLocalDataSource
import com.elsloude.daggerstart.example2.data.datasource.ExampleLocalDataSourceImpl
import com.elsloude.daggerstart.example2.data.datasource.ExampleRemoteDataSource
import com.elsloude.daggerstart.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}