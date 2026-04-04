package com.nagdeMishra.emitimely.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.nagdeMishra.emitimely.presentation.activation.ActivationScreen
import com.nagdeMishra.emitimely.presentation.registration.DeviceRegistrationScreen

object Routes {
    const val ACTIVATION = "activation"
    const val REGISTRATION = "registration"
}

@Composable
fun AppNavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Routes.ACTIVATION
    ) {

        composable(Routes.ACTIVATION) {
            ActivationScreen(navController)
        }
        composable(Routes.REGISTRATION) {
            DeviceRegistrationScreen()
        }

    }
}