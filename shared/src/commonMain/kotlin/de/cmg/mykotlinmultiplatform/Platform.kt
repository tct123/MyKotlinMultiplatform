package de.cmg.mykotlinmultiplatform

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform