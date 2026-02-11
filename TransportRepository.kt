package com.example.repository

interface TransportRepository {
    fun getAllTransport(): List<Transport>
    fun getTransportById(id: String): Transport?
    fun addTransport(transport: Transport): Boolean
    fun updateTransport(transport: Transport): Boolean
    fun deleteTransport(id: String): Boolean
}