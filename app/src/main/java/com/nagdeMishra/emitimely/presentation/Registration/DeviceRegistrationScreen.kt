package com.nagdeMishra.emitimely.presentation.registration

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DeviceRegistrationScreen() {

    var deviceModel by remember { mutableStateOf("") }
    var androidVersion by remember { mutableStateOf("") }
    var deviceId by remember { mutableStateOf("") }
    var appVersion by remember { mutableStateOf("") }
    var customerName by remember { mutableStateOf("") }
    var contactNumber by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F7F9))
            .verticalScroll(rememberScrollState())
            .imePadding()
            .padding(20.dp)
    ) {

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Device Registration",
            fontSize = 22.sp,
            color = Color(0xFF1C2430)
        )

        Spacer(modifier = Modifier.height(6.dp))

        Text(
            text = "Link this device with shop owner",
            color = Color(0xFF6B7280)
        )

        Spacer(modifier = Modifier.height(20.dp))

        EditableField("Device Model", deviceModel) { deviceModel = it }
        EditableField("Android Version", androidVersion) { androidVersion = it }
        EditableField("Device ID", deviceId) { deviceId = it }
        EditableField("App Version", appVersion) { appVersion = it }

        Spacer(modifier = Modifier.height(12.dp))

        EditableField("Customer Name", customerName) { customerName = it }

        EditableField(
            title = "Contact Number",
            value = contactNumber,
            keyboardType = KeyboardType.Phone
        ) { contactNumber = it }

        Spacer(modifier = Modifier.height(14.dp))

        StatusCard()
        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            shape = RoundedCornerShape(14.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF020617)
            )
        ) {
            Text(
                "Register Device",
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = "Registration is required for EMI tracking",
            color = Color(0xFF6B7280),
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}

@Composable
private fun EditableField(
    title: String,
    value: String,
    keyboardType: KeyboardType = KeyboardType.Text,
    onValueChange: (String) -> Unit
) {

    Column(modifier = Modifier.padding(bottom = 12.dp)) {

        Text(
            text = title,
            color = Color(0xFF6B7280)
        )

        Spacer(modifier = Modifier.height(6.dp))

        OutlinedTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(14.dp),
            keyboardOptions = KeyboardOptions(keyboardType = keyboardType),
            textStyle = LocalTextStyle.current.copy(
                color = Color(0xFF1C2430)
            ),
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color(0xFF1C2430),
                unfocusedTextColor = Color(0xFF1C2430),

                unfocusedContainerColor = Color(0xFFE5E7EB),
                focusedContainerColor = Color(0xFFE5E7EB),

                unfocusedBorderColor = Color.Transparent,
                focusedBorderColor = Color.Transparent,

                cursorColor = Color(0xFF0F8A7B)
            )
        )
    }
}

@Composable
private fun StatusCard() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = Color(0xFFE5E7EB),
                shape = RoundedCornerShape(14.dp)
            )
            .padding(14.dp)
    ) {

        Text(
            text = "Protection Status: ",
            color = Color(0xFF1C2430)
        )
    }
}