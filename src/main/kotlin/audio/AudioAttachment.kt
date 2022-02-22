package audio

import Attachment

class AudioAttachment(
    override val type: String = "audio",
    val audio: Audio = Audio()
) : Attachment