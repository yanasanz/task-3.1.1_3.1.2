import file.File
import video.Video

fun main() {
    val video = VideoAttachment(Video())
    printMsg(video)
    val file = FileAttachment(File())
    printMsg(file)
}

fun printMsg(attachment: Attachment) =
    when (attachment) {
        is VideoAttachment -> println("Attachment type is ${attachment.type}")
        is AudioAttachment -> println("Attachment type is ${attachment.type}")
        is PhotoAttachment -> println("Attachment type is ${attachment.type}")
        is FileAttachment -> println("Attachment type is ${attachment.type}")
        is LinkAttachment -> println("Attachment type is ${attachment.type}")
    }