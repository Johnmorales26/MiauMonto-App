package com.johndev.miaumonto.ui.screens.homeScreen.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomChip(
    indexChip: Int,
    selectedChip: Int,
    labelRes: String,
    modifier: Modifier,
    onSelected: (Int) -> Unit
) {
    FilterChip(
        label = { Text(text = labelRes, textAlign = TextAlign.Center, modifier = modifier.fillMaxWidth()) },
        selected = indexChip == selectedChip,
        onClick = { onSelected(indexChip) },
        colors = FilterChipDefaults.filterChipColors(
            selectedContainerColor = Color(0xffFCEED4),
            selectedLabelColor = Color(0xffFCAC12),
            disabledLabelColor = Color(0xff91919F)
        ),
        border = FilterChipDefaults.filterChipBorder(
            selectedBorderColor = Color(0xffFCEED4),
            borderColor = Color.Transparent
        ),
        shape = RoundedCornerShape(16.dp),
        modifier = modifier.height(43.dp)
    )
}