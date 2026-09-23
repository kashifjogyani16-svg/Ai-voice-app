package com.example.aivoiceapp

import android.content.Context
import java.io.File

class AudioManager(
    private val context: Context
) {

    fun createAudioFile(): File {
        return File(
            context.filesDir,
            "ai_voice_${System.currentTimeMillis()}.mp3"
        )
    }

    fun getAudioFiles(): List<File> {
        return context.filesDir
            .listFiles()
            ?.filter {
                it.name.startsWith("ai_voice_")
            }
            ?: emptyList()
    }

    fun deleteAudioFile(file: File): Boolean {
        return file.delete()
    }
}
