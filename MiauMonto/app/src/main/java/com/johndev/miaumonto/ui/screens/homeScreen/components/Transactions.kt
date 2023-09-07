package com.johndev.miaumonto.ui.screens.homeScreen.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Transactions() {
    var selectedChip by remember { mutableIntStateOf(0) }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        CustomChip(
            indexChip = 0,
            selectedChip = selectedChip,
            labelRes = "Today",
            modifier = Modifier.weight(1f),
            onSelected = { selectedChip = it })
        CustomChip(
            indexChip = 1,
            selectedChip = selectedChip,
            labelRes = "Week",
            modifier = Modifier.weight(1f),
            onSelected = { selectedChip = it })
        CustomChip(
            indexChip = 2,
            selectedChip = selectedChip,
            labelRes = "Month",
            modifier = Modifier.weight(1f),
            onSelected = { selectedChip = it })
        CustomChip(
            indexChip = 3,
            selectedChip = selectedChip,
            labelRes = "Year",
            modifier = Modifier.weight(1f),
            onSelected = { selectedChip = it })
    }
}