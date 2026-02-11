// This is a use case to find nearby transport stops

package com.yerevan.transport.domain.usecase

import com.yerevan.transport.domain.model.Stop
import com.yerevan.transport.domain.repository.TransportRepository

class FindNearbyStopsUseCase(private val repository: TransportRepository) {
    fun execute(latitude: Double, longitude: Double): List<Stop> {
        // Implementation of finding nearby stops
        return repository.findNearbyStops(latitude, longitude)
    }
}