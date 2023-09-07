package com.johndev.miaumonto.ui.screens.homeScreen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MainInformation() {
    val colors = listOf(Color(0xffFFF6E5), Color.White)
    val brush = Brush.linearGradient(
        colors,
        start = Offset(0f, 0f),
        end = Offset(100f, 100f)
    )
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                brush = brush,
                shape = RoundedCornerShape(bottomStart = 32.dp, bottomEnd = 32.dp)
            )
    ) {
        Column(modifier = Modifier.fillMaxWidth()) {
            HomeTopBar()
            CardAccountBalance()
            Spacer(modifier = Modifier.height(24.dp))
        }
    }
}