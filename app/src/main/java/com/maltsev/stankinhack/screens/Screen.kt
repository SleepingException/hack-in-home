package com.maltsev.stankinhack.screens

sealed class Screen(val route: String) {
    object Main: Screen(route = "main_screen")
    object Intro: Screen(route = "intro_screen")
}