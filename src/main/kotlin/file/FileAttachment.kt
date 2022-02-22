package file

import Attachment

class FileAttachment(
    override val type: String = "file",
    val file: File = File(),
) : Attachment