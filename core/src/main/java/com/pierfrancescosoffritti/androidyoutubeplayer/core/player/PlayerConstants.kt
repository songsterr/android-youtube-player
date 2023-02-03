package com.pierfrancescosoffritti.androidyoutubeplayer.core.player

class PlayerConstants {

    enum class PlayerState {
        UNKNOWN, UNSTARTED, ENDED, PLAYING, PAUSED, BUFFERING, VIDEO_CUED
    }

    enum class PlaybackQuality {
        UNKNOWN, SMALL, MEDIUM, LARGE, HD720, HD1080, HIGH_RES, DEFAULT
    }

    enum class PlayerError {
        UNKNOWN, INVALID_PARAMETER_IN_REQUEST, HTML_5_PLAYER, VIDEO_NOT_FOUND, VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER
    }

    @JvmInline
    value class PlaybackRate(val rate: Float) {
        companion object {
            val UNKNOWN = PlaybackRate(0f)
            val RATE_0_25 = PlaybackRate(0.25f)
            val RATE_0_5 = PlaybackRate(0.5f)
            val RATE_1 = PlaybackRate(1f)
            val RATE_1_5 = PlaybackRate(1.5f)
            val RATE_2 = PlaybackRate(2f)
        }
    }


}