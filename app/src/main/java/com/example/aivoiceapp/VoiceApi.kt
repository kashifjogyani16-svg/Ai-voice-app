package com.example.aivoiceapp

data class VoiceRequest(
    val text: String,
    val voiceId: String? = null,
    val language: String = "English",
    val speed: Float = 1.0f,
    val emotion: String = "Natural"
)

data class VoiceResponse(
    val success: Boolean,
    val audioUrl: String? = null,
    val message: String? = null
)

interface VoiceApi {

    suspend fun generateVoice(
        request: VoiceRequest
    ): VoiceResponse

    suspend fun cloneVoice(
        samplePath: String,
        request: VoiceRequest
    ): VoiceResponse
}
