package com.nagdeMishra.emitimely.presentation.activation

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.nagdeMishra.emitimely.R

@Composable
fun PermissionGrid() {

    Column(
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {

        Row(
            horizontalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            PermissionItem(
                icon = R.drawable.shield,
                title = "Device Admin",
                modifier = Modifier.weight(1f)
            )

            PermissionItem(
                icon = R.drawable.analystics,
                title = "Usage Access",
                modifier = Modifier.weight(1f)
            )
        }

        Row(
            horizontalArrangement = Arrangement.spacedBy(14.dp)
        ) {
            PermissionItem(
                icon = R.drawable.location,
                title = "Location Access",
                modifier = Modifier.weight(1f)
            )

            PermissionItem(
                icon = R.drawable.wifi,
                title = "Network Access",
                modifier = Modifier.weight(1f)
            )
        }
    }
}