package com.nagdeMishra.emitimely.presentation.activation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.nagdeMishra.emitimely.Presentation.Dashboard.FooterSection
import com.nagdeMishra.emitimely.Presentation.Dashboard.LogoSection
import com.nagdeMishra.emitimely.Presentation.Dashboard.PermissionTitle
import com.nagdeMishra.emitimely.Presentation.Dashboard.TitleSection

@Composable
fun ActivationScreen() {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F7F9))
            .padding(horizontal = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        item { Spacer(modifier = Modifier.height(40.dp)) }

        item { LogoSection() }

        item { Spacer(modifier = Modifier.height(24.dp)) }

        item { TitleSection() }

        item { Spacer(modifier = Modifier.height(16.dp)) }

        item { FeatureCard() }

        item { Spacer(modifier = Modifier.height(24.dp)) }

        item { PermissionTitle() }

        item { Spacer(modifier = Modifier.height(16.dp)) }

        item { PermissionGrid() }

        item { Spacer(modifier = Modifier.height(24.dp)) }

        item { ActivateButton() }

        item { Spacer(modifier = Modifier.height(16.dp)) }

        item { FooterSection() }

        item { Spacer(modifier = Modifier.height(40.dp)) }
    }
}