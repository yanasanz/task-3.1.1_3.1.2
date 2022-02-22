package photo

import Attachment

class PhotoAttachment(
    override val type: String = "photo",
    val photo: Photo = Photo()
) : Attachment