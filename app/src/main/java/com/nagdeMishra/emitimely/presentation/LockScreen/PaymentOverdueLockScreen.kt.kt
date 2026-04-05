package com.nagdeMishra.emitimely.presentation.lockScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
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
fun PaymentOverdueLockScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F1E6))
            .verticalScroll(rememberScrollState())
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(20.dp))

        WarningIcon()

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Payment Overdue",
            fontSize = 26.sp,
            color = Color(0xFF111827)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Please complete EMI payment to avoid device restriction",
            color = Color(0xFF4B5563)
        )

        Spacer(modifier = Modifier.height(24.dp))

        OverdueCard()

        Spacer(modifier = Modifier.height(24.dp))

        CallOwnerButton()

        Spacer(modifier = Modifier.height(12.dp))

        RetryButton()

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "This device may be restricted if payment not completed",
            color = Color(0xFF6B7280)
        )
    }
}

@Composable
private fun WarningIcon() {

    Box(
        modifier = Modifier
            .size(90.dp)
            .background(Color(0xFFF59E0B), CircleShape),
        contentAlignment = Alignment.Center
    ) {

        Image(
            painter = painterResource(R.drawable.warning),
            contentDescription = null,
            modifier = Modifier.size(40.dp),
            colorFilter = ColorFilter.tint(Color.White)
        )
    }
}

@Composable
private fun OverdueCard() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = Color.White,
                shape = RoundedCornerShape(18.dp)
            )
            .padding(18.dp)
    ) {

        OverdueRow("Due Amount", "₹5,000")
        DividerSpacer()

        OverdueRow("Due Date", "March 28, 2026")
        DividerSpacer()

        OverdueRow("Days Overdue", "5", isDanger = true)
    }
}

@Composable
private fun OverdueRow(
    label: String,
    value: String,
    isDanger: Boolean = false
) {

    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

        Text(label, color = Color(0xFF6B7280))

        Text(
            value,
            color = if (isDanger) Color.Red else Color(0xFF111827),
            fontSize = 18.sp
        )
    }
}

@Composable
private fun DividerSpacer() {
    Spacer(modifier = Modifier.height(12.dp))
    androidx.compose.material3.Divider()
    Spacer(modifier = Modifier.height(12.dp))
}

@Composable
private fun CallOwnerButton() {

    Button(
        onClick = { },
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp),
        shape = RoundedCornerShape(16.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFFF59E0B)
        )
    ) {

        Image(
            imageVector = Icons.Default.Call,
            contentDescription = null,
            modifier = Modifier.size(18.dp),
            colorFilter = ColorFilter.tint(Color.White)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text("Call Shop Owner", color = Color.White)
    }
}

@Composable
private fun RetryButton() {

    OutlinedButton(
        onClick = { },
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp),
        shape = RoundedCornerShape(16.dp)
    ) {

        Image(
            painter = painterResource(R.drawable.sync),
            contentDescription = null,
            modifier = Modifier.size(18.dp)
        )

        Spacer(modifier = Modifier.width(8.dp))

        Text("Retry Sync")
    }
}