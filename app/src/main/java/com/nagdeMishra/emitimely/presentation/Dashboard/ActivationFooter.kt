package com.nagdeMishra.emitimely.presentation.activation

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ActivationFooter() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 24.dp)
    ) {

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "This is required for EMI-based purchase"
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "By activating, you agree to device monitoring for payment protection purposes only."
        )
    }
}