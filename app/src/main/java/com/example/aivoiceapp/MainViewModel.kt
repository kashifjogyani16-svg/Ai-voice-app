package com.example.aivoiceapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val api: VoiceApi = LocalVoiceApi()

    private val _state = MutableStateFlow(AppState())
    val state: StateFlow<AppState> = _state

    fun generateVoice(request: VoiceRequest) {
        if (request.text.isBlank()) {
            _state.value = AppState(
                message = "Please enter some text."
            )
            return
        }

        viewModelScope.launch {
            _state.value = AppState(
                isGenerating = true,
                message = "Generating voice..."
            )

            val result = api.generateVoice(request)

            _state.value = AppState(
                isGenerating = false,
                message = result.message ?: "",
                lastAudioUrl = result.audioUrl
            )
        }
    }

    fun cloneVoice(
        samplePath: String,
        request: VoiceRequest
    ) {
        if (samplePath.isBlank()) {
            _state.value = AppState(
                message = "Please select a voice sample."
            )
            return
        }

        viewModelScope.launch {
            _state.value = AppState(
                isGenerating = true,
                message = "Processing voice clone..."
            )

            val result = api.cloneVoice(
                samplePath,
                request
            )

            _state.value = AppState(
                isGenerating = false,
                message = result.message ?: "",
                lastAudioUrl = result.audioUrl
            )
        }
    }
}
