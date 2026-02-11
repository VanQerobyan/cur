// FindRoutesUseCase.kt

class FindRoutesUseCase {
    fun findRoutes(startStop: String, endStop: String): List<Route> {
        // Logic to find routes between startStop and endStop
        // This is a placeholder for the actual implementation
        return listOf() // Returns an empty list for now
    }
}

data class Route(val path: List<String>, val duration: Int)