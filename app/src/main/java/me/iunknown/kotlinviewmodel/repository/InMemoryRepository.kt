package me.iunknown.kotlinviewmodel.repository

class InMemoryRepository : Repository {
    override fun getText(): String {
        return "From In Memory Repository"
    }
}