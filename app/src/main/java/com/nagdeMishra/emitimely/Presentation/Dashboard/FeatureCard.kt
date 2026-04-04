package com.nagdeMishra.emitimely.presentation.activation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.nagdeMishra.emitimely.R

@Composable
fun FeatureCard() {

    Card(
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        elevation = CardDefaults.cardElevation(4.dp),
        modifier = Modifier.fillMaxWidth()
    ) {

        Column(
            modifier = Modifier.padding(20.dp),
            verticalArrangement = Arrangement.spacedBy(18.dp)
        ) {

            FeatureRow(R.drawable.lock, "Prevent uninstall")
            FeatureRow(R.drawable.analystics, "EMI monitoring")
            FeatureRow(R.drawable.shield, "Device protection")
            FeatureRow(R.drawable.checkmark, "Data privacy assured")

        }
    }
}

@Composable
private fun FeatureRow(icon: Int, text: String) {

    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {

        Image(
            painter = painterResource(id = icon),
            contentDescription = null,
            modifier = Modifier.size(22.dp),
            colorFilter = ColorFilter.tint(Color(0xFF0F8A7B))
        )

        Spacer(modifier = Modifier.width(14.dp))

        Text(
            text = text,
            color = Color(0xFF1C2430)
        )
    }
}