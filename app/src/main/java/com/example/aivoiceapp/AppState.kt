package com.example.aivoiceapp

data class AppState(
    val isGenerating: Boolean = false,
    val message: String = "",
    val lastAudioUrl: String? = null
)
