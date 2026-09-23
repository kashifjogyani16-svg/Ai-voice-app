package com.example.aivoiceapp

class LocalVoiceApi : VoiceApi {

    override suspend fun generateVoice(
        request: VoiceRequest
    ): VoiceResponse {
        return VoiceResponse(
            success = false,
            message = "AI voice engine is not connected yet."
        )
    }

    override suspend fun cloneVoice(
        samplePath: String,
        request: VoiceRequest
    ): VoiceResponse {
        return VoiceResponse(
            success = false,
            message = "Voice cloning engine is not connected yet."
        )
    }
}
