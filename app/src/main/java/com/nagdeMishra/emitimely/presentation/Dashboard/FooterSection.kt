package com.nagdeMishra.emitimely.presentation.Dashboard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FooterSection() {

    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        Text(
            text = "This is required for EMI-based purchase",
            color = Color(0xFF6B7280)
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "By activating, you agree to device monitoring for payment protection purposes only. Your personal data remains private and secure.",
            textAlign = TextAlign.Center,
            color = Color(0xFF9CA3AF),
            fontSize = 12.sp
        )
    }
}