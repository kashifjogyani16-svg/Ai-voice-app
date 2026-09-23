package com.example.aivoiceapp

import android.app.Activity

class VoiceAppController(
    private val activity: Activity
) {

    fun prepareVoiceRecording(): Boolean {
        if (!PermissionHelper.hasMicrophonePermission(activity)) {
            PermissionHelper.requestMicrophonePermission(activity)
            return false
        }

        return true
    }
}
