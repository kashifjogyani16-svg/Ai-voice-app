package com.example.aivoiceapp

import android.Manifest
import android.app.Activity
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

object PermissionHelper {

    const val RECORD_AUDIO_REQUEST = 1001

    fun hasMicrophonePermission(
        activity: Activity
    ): Boolean {
        return ContextCompat.checkSelfPermission(
            activity,
            Manifest.permission.RECORD_AUDIO
        ) == PackageManager.PERMISSION_GRANTED
    }

    fun requestMicrophonePermission(
        activity: Activity
    ) {
        ActivityCompat.requestPermissions(
            activity,
            arrayOf(Manifest.permission.RECORD_AUDIO),
            RECORD_AUDIO_REQUEST
        )
    }
}
