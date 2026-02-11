package com.example.cur

import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun RouteResultScreen(results: List<String>) {
    // Display the search results
    Text(text = "Search Results:")
    results.forEach { result ->
        Text(text = result)
    }
}