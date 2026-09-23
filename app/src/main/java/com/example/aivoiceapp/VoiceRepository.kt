package com.example.aivoiceapp

class VoiceRepository {

    private val voices = mutableListOf<VoiceProfile>()
    private val audioFiles = mutableListOf<AudioFile>()

    fun addVoice(voice: VoiceProfile) {
        voices.add(voice)
    }

    fun getVoices(): List<VoiceProfile> {
        return voices.toList()
    }

    fun addAudio(audio: AudioFile) {
        audioFiles.add(audio)
    }

    fun getAudioFiles(): List<AudioFile> {
        return audioFiles.toList()
    }
}
