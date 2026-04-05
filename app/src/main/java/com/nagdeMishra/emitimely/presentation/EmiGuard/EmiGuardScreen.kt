package com.nagdeMishra.emitimely.presentation.emiguard
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nagdeMishra.emitimely.R

@Composable
fun EmiGuardScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F7F9))
            .verticalScroll(rememberScrollState())
            .padding(20.dp)
    ) {

        Header()

        Spacer(modifier = Modifier.height(16.dp))

        EmiStatusCard()

        Spacer(modifier = Modifier.height(16.dp))

        ShopOwnerCard()

        Spacer(modifier = Modifier.height(16.dp))

        ProtectionInfoCard()

        Spacer(modifier = Modifier.height(16.dp))

        SyncCard()

        Spacer(modifier = Modifier.height(20.dp))
    }
}

@Composable
private fun Header() {

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(
            text = "EMI Guard",
            fontSize = 24.sp,
            color = Color(0xFF111827)
        )

        Row(
            modifier = Modifier
                .background(
                    color = Color(0xFFD1FAE5),
                    shape = RoundedCornerShape(50)
                )
                .padding(horizontal = 12.dp, vertical = 6.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(R.drawable.shield),
                contentDescription = null,
                modifier = Modifier.size(16.dp),
                colorFilter = ColorFilter.tint(Color(0xFF059669))
            )

            Spacer(modifier = Modifier.width(6.dp))

            Text(
                text = "Protected",
                color = Color(0xFF059669)
            )
        }
    }
}

@Composable
private fun EmiStatusCard() {

    Card(
        shape = RoundedCornerShape(18.dp),
        colors = CardDefaults.cardColors(Color.White)
    ) {

        Column(modifier = Modifier.padding(18.dp)) {

            Row(verticalAlignment = Alignment.CenterVertically) {

                Box(
                    modifier = Modifier
                        .size(60.dp)
                        .background(Color(0xFF22C55E), CircleShape),
                    contentAlignment = Alignment.Center
                ) {

                    Image(
                        painter = painterResource(R.drawable.checkmark),
                        contentDescription = null,
                        modifier = Modifier.size(26.dp),
                        colorFilter = ColorFilter.tint(Color.White)
                    )
                }

                Spacer(modifier = Modifier.width(12.dp))

                Column {
                    Text("EMI Status", color = Color.Gray)
                    Text("Active", fontSize = 20.sp)
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            Divider()

            Spacer(modifier = Modifier.height(12.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Column {
                    Text("Next Due Date", color = Color.Gray)
                    Text("April 15, 2026")
                }

                Column {
                    Text("Amount", color = Color.Gray)
                    Text("₹5,500")
                }
            }
        }
    }
}

@Composable
private fun ShopOwnerCard() {

    Card(
        shape = RoundedCornerShape(18.dp),
        colors = CardDefaults.cardColors(Color.White)
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(18.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Column {
                Text("Shop Owner Contact", color = Color.Gray)
                Text("Rajesh Electronics")
                Text("+91 98765 43210", color = Color.Gray)
            }

            Button(
                onClick = { },
                shape = RoundedCornerShape(12.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF2563EB)
                )
            ) {

                Image(
                    imageVector = Icons.Default.Call,
                    contentDescription = null,
                    modifier = Modifier.size(18.dp),
                    colorFilter = ColorFilter.tint(Color.White)
                )

                Spacer(modifier = Modifier.width(6.dp))

                Text("Call", color = Color.White)
            }
        }
    }
}

@Composable
private fun ProtectionInfoCard() {

    Card(
        shape = RoundedCornerShape(18.dp),
        colors = CardDefaults.cardColors(Color.White)
    ) {

        Column(modifier = Modifier.padding(18.dp)) {

            Text("Device Protection Info", color = Color.Gray)

            Spacer(modifier = Modifier.height(12.dp))

            InfoRow("Protection Enabled", "Active")
            InfoRow("Auto Sync Active", "Enabled")
        }
    }
}

@Composable
private fun InfoRow(label: String, value: String) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 6.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Text(label)

        Row(verticalAlignment = Alignment.CenterVertically) {

            Image(
                painter = painterResource(R.drawable.checkmark),
                contentDescription = null,
                modifier = Modifier.size(16.dp),
                colorFilter = ColorFilter.tint(Color(0xFF16A34A))
            )

            Spacer(modifier = Modifier.width(4.dp))

            Text(
                text = value,
                color = Color(0xFF16A34A)
            )
        }
    }
}

@Composable
private fun SyncCard() {

    Card(
        shape = RoundedCornerShape(18.dp),
        colors = CardDefaults.cardColors(Color.White)
    ) {

        Column(modifier = Modifier.padding(18.dp)) {

            Text("Last Synced", color = Color.Gray)

            Text("Today, 2:30 PM")

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = { },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF020617)
                )
            ) {

                Image(
                    painter = painterResource(R.drawable.sync),
                    contentDescription = null,
                    modifier = Modifier.size(18.dp),
                    colorFilter = ColorFilter.tint(Color.White)
                )

                Spacer(modifier = Modifier.width(8.dp))

                Text("Manual Sync", color = Color.White)
            }
        }
    }
}