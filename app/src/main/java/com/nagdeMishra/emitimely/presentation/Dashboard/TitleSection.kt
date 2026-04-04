package com.nagdeMishra.emitimely.presentation.Dashboard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TitleSection() {

    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        Text(
            text = "Activate Device Protection",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1C2430)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "This device is protected for EMI payment assurance",
            textAlign = TextAlign.Center,
            color = Color(0xFF6B7280)
        )
    }
}