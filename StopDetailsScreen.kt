package com.example.yourapp.ui.screens

import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun StopDetailsScreen(stopId: String) {
    // In a real application, you would fetch the details and routes based on the stopId

    // For demonstration purposes, here are some static details
    val stopDetails = "Details for Stop ID: $stopId"
    val routes = listOf("Route 1", "Route 2", "Route 3")

    Text(text = stopDetails)
    routes.forEach { route ->
        Text(text = route)
    }
}