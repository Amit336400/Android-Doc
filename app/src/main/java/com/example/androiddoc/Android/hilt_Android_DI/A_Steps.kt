package com.example.androiddoc.Android.hilt_Android_DI

/**
 * 1->   add hilt libraries
 *
 * Module : App
 *
 * plugins {
 *
 *  id("kotlin-kapt")
 *     id("com.google.dagger.hilt.android")
 *
 *  }
 *
 * dependencies {
 *
 *     implementation("com.google.dagger:hilt-android:2.51.1")
 *     kapt("com.google.dagger:hilt-android-compiler:2.51.1")
 *
 *     this is for ViewModel
 *     implementation("androidx.hilt:hilt-navigation-compose:1.2.0")
 *
 *  }
 *
 *      Project : Level
 * plugins {
 *        id("com.google.dagger.hilt.android") version "2.51.1" apply false
 *        }
 *
 * 2->
 *      create a BaseApplication in the Root file
 *
 *      @HiltAndroidApp
 *          class BaseApplication : Application() {}
 *
 *
 *  3->
 *  add @AndroidEntryPoint in MainActivity
 *
 *      @AndroidEntryPoint
 *          class MainActivity: ComponentActivity() {
 *                          //Code
 *              }
 *
 *  4 ->
 *      <application
 *            android:name=".BaseApplication"
 *
 *           < --CODE />
 *
 *
 *      </application>
 *
 *   5 ->
 *   create a Module for provide object
 *
 *      @Module
 *      @InstallIn(SingletonComponent::class)
 *          object AppModule {
 *

 *          }
 *
 *
 *
 *  6->
 *  use hilt in vewModel
 *
 *      @HiltViewModel
 *           class LoginViewModel @Inject constructor(
 *                   private val repo: ChatRepo,
 *              ) : ViewModel() {
 *
 *              //        CODE
 *              }
 */