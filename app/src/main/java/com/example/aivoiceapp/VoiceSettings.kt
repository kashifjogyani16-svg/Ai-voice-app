package com.example.aivoiceapp

data class VoiceSettings(
    val language: String = "English",
    val speed: Float = 1.0f,
    val pitch: Float = 1.0f,
    val emotion: String = "Natural"
)
