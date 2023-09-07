package com.johndev.miaumonto.ui.screens.homeScreen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.johndev.miaumonto.R
import com.johndev.miaumonto.ui.theme.MiauMontoTheme

@Composable
fun CardAccountBalance() {
    Column(
        modifier = Modifier.fillMaxWidth().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "Account Balance", style = MaterialTheme.typography.bodySmall)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "$5000", style = MaterialTheme.typography.displaySmall)
        Spacer(modifier = Modifier.height(28.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            ItemTransactions(
                title = "Income",
                imgRes = R.drawable.ic_income,
                modifier = Modifier
                    .weight(1f)
                    .background(color = Color(0xff00A86B), shape = RoundedCornerShape(24.dp))
            )
            ItemTransactions(
                title = "Expense",
                imgRes = R.drawable.ic_expense,
                modifier = Modifier
                    .weight(1f)
                    .background(color = Color(0xffFD3C4A), shape = RoundedCornerShape(24.dp))
            )
        }
    }
}

@Composable
fun ItemTransactions(title: String, imgRes: Int, modifier: Modifier) {
    Box(
        modifier = modifier
            .height(80.dp)
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .background(Color.White, shape = RoundedCornerShape(8.dp))
            ) {
                Icon(
                    painter = painterResource(id = imgRes),
                    tint = if (imgRes == R.drawable.ic_income) Color(0xff00A86B) else Color(
                        0xffFD3C4A
                    ),
                    contentDescription = null,
                    modifier = Modifier
                        .size(32.dp)
                        .align(Alignment.Center)
                )
            }
            Column(modifier = Modifier.weight(1f)) {
                Text(text = title, style = MaterialTheme.typography.bodySmall)
                Text(
                    text = "$5000",
                    style = MaterialTheme.typography.titleMedium.copy(fontSize = 22.sp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MiauMontoTheme {
        CardAccountBalance()
    }
}