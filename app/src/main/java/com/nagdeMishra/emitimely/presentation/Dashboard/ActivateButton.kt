package com.nagdeMishra.emitimely.presentation.activation

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.nagdeMishra.emitimely.navigation.Routes

@Composable
fun ActivateButton(navController: NavController) {

    Button(
        onClick = {
            navController.navigate(Routes.REGISTRATION)
        },
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp),
        shape = RoundedCornerShape(16.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF0F8A7B)
        )
    ) {

        Text(
            "Activate Protection",
            color = Color.White,
            fontWeight = FontWeight.SemiBold
        )
    }
}