package edu.ucne.skyplanerent.presentation.navigation

import kotlinx.serialization.Serializable

sealed interface Screen {

    @Serializable
    object Home : Screen

    @Serializable
    data class Login(val loginId: Int) : Screen

}