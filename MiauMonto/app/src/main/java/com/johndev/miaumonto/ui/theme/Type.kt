package com.johndev.miaumonto.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.johndev.miaumonto.R

val Typography = Typography(
    //  Title X
    displaySmall = TextStyle(
        fontFamily = FontFamily(Font(R.font.inter_bold)),
        fontWeight = FontWeight.Bold,
        fontSize = 40.sp,
        lineHeight = 60.sp,
        letterSpacing = 0.sp
    ),
    //  Title 1
    titleLarge = TextStyle(
        fontFamily = FontFamily(Font(R.font.inter_bold)),
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,
        lineHeight = 39.sp,
        letterSpacing = 0.sp
    ),
    //  Title 2
    titleMedium = TextStyle(
        fontFamily = FontFamily(Font(R.font.inter_semi_bold)),
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp,
        //lineHeight = 39.sp,
        letterSpacing = 0.sp
    ),
    //  Title 3
    titleSmall = TextStyle(
        fontFamily = FontFamily(Font(R.font.inter_semi_bold)),
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp,
        //lineHeight = 39.sp,
        letterSpacing = 0.sp
    ),
    //  Body 1
    bodyLarge = TextStyle(
        fontFamily = FontFamily(Font(R.font.inter_medium)),
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp,
        //lineHeight = 39.sp,
        letterSpacing = 0.sp
    ),
    //  Body 2
    bodyMedium = TextStyle(
        fontFamily = FontFamily(Font(R.font.inter_semi_bold)),
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        //lineHeight = 39.sp,
        letterSpacing = 0.sp
    ),
    //  Body 3
    bodySmall = TextStyle(
        fontFamily = FontFamily(Font(R.font.inter_medium)),
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.sp
    ),
    //  Small
    labelLarge = TextStyle(
        fontFamily = FontFamily(Font(R.font.inter_medium)),
        fontWeight = FontWeight.Medium,
        fontSize = 13.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.sp
    ),
    //  Tiny
    labelMedium = TextStyle(
        fontFamily = FontFamily(Font(R.font.inter_medium)),
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 12.sp,
        letterSpacing = 0.sp
    ),
)

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MiauMontoTheme {
        Column {
            Text(text = "Title X", style = MaterialTheme.typography.displaySmall)
            Text(text = "Title 1", style = MaterialTheme.typography.titleLarge)
            Text(text = "Title 2", style = MaterialTheme.typography.titleMedium)
            Text(text = "Title 3", style = MaterialTheme.typography.titleSmall)
            Text(text = "Body 1", style = MaterialTheme.typography.bodyLarge)
            Text(text = "Body 2", style = MaterialTheme.typography.bodyMedium)
            Text(text = "Body 3", style = MaterialTheme.typography.bodySmall)
            Text(text = "Small", style = MaterialTheme.typography.labelLarge)
            Text(text = "Tiny", style = MaterialTheme.typography.labelMedium)
        }
    }
}