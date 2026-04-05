package com.nagdeMishra.emitimely.presentation.Dashboard

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PermissionTitle() {
    Text(
        text = "Required Permissions",
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        color = Color(0xFF1C2430)
    )
}