package com.johndev.miaumonto.ui.screens.homeScreen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.johndev.miaumonto.common.utils.Utils.getNameOfMont
import java.util.Date

@Composable
fun HomeTopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(64.dp)
            .padding(horizontal = 12.dp, vertical = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Box(modifier = Modifier.size(32.dp).background(
            color = Color(0xff7F3DFF),
            shape = CircleShape)
            .clip(CircleShape)
            .padding(1.dp)
        ) {
            AsyncImage(
                model = "https://imgs.search.brave.com/c8-hFX17UBw6T_HbSMWxxc5IzjOxJMGyKYl3hqyAk8s/rs:fit:860:0:0/g:ce/aHR0cHM6Ly9tZWRp/YS5pc3RvY2twaG90/by5jb20vaWQvMTA2/MTYzNjU1MC9waG90/by93aGVyZS1kb2Vz/LXRoaXMtYmlsbC1j/b21lLWZyb20uanBn/P3M9NjEyeDYxMiZ3/PTAmaz0yMCZjPTJw/eDFQdTh1SnptbVVK/LXIwVVJaQV92WXV5/a1MzT0tjTFdCNEVn/eENZSms9",
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize().clip(CircleShape)
            )
        }
        Text(
            text = getNameOfMont(Date().month) ?: "Invalid",
            style = MaterialTheme.typography.bodySmall
        )
        IconButton(onClick = { }) {
            Icon(
                imageVector = Icons.Default.Notifications,
                contentDescription = null,
                tint = Color(0xff7F3DFF)
            )
        }
    }
}