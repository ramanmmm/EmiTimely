package com.nagdeMishra.emitimely.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.nagdeMishra.emitimely.presentation.activation.ActivationScreen

object Routes {
    const val ACTIVATION = "activation"
}

@Composable
fun AppNavGraph(navController: NavHostController) {

    NavHost(
        navController = navController,
        startDestination = Routes.ACTIVATION
    ) {

        composable(Routes.ACTIVATION) {
            ActivationScreen()
        }

    }
}