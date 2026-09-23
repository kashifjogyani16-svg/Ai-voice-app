package com.example.aivoiceapp

class VoiceManager {

    private val profiles = mutableListOf<VoiceProfile>()

    fun createProfile(
        name: String,
        samplePath: String
    ): VoiceProfile {

        val profile = VoiceProfile(
            id = System.currentTimeMillis().toString(),
            name = name,
            samplePath = samplePath
        )

        profiles.add(profile)
        return profile
    }

    fun getProfiles(): List<VoiceProfile> {
        return profiles.toList()
    }

    fun deleteProfile(id: String) {
        profiles.removeAll {
            it.id == id
        }
    }
}
