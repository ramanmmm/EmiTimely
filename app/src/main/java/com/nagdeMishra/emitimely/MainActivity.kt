package com.nagdeMishra.emitimely

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.nagdeMishra.emitimely.navigation.AppNavGraph
import com.nagdeMishra.emitimely.ui.theme.EmiTimelyTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            EmiTimelyTheme {
                val navController = rememberNavController()
                AppNavGraph(navController = navController)
            }
        }
    }
}