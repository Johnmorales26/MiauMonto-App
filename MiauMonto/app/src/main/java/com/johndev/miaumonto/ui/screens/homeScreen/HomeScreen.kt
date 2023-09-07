package com.johndev.miaumonto.ui.screens.homeScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.johndev.miaumonto.ui.screens.homeScreen.components.MainInformation
import com.johndev.miaumonto.ui.screens.homeScreen.components.Transactions

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(/*viewModel: HomeViewModel*/) {
    Scaffold(
        content = { paddingValues ->
            Body(paddingValues)
        }
    )
}

@Composable
private fun Body(paddingValues: PaddingValues) {
    Surface(modifier = Modifier
        .fillMaxSize()
        .padding(paddingValues)) {
        Column(modifier = Modifier
            .fillMaxSize()) {
            MainInformation()
            Transactions()
        }
    }
}
