package com.example.aivoiceapp

import android.content.Context
import android.media.MediaPlayer

class AudioPlayer(
    private val context: Context
) {

    private var mediaPlayer: MediaPlayer? = null

    fun play(url: String) {
        stop()

        mediaPlayer = MediaPlayer().apply {
            setDataSource(url)
            setOnPreparedListener {
                it.start()
            }
            setOnCompletionListener {
                release()
                mediaPlayer = null
            }
            prepareAsync()
        }
    }

    fun stop() {
        mediaPlayer?.stop()
        mediaPlayer?.release()
        mediaPlayer = null
    }

    fun release() {
        stop()
    }
}
