import posts.Post

class WallService {
    private var posts = emptyArray<Post>()
    private var uniqueIds = emptyArray<Int>()
    var attachments = emptyArray<Attachment>()



    fun addAttachment(attachment: Attachment): Attachment {
        attachments += attachment
        return attachments.last()
    }

    fun add(post: Post): Post {
        val newId = if (uniqueIds.isEmpty()) 1 else uniqueIds.last() + 1
        uniqueIds += newId
        posts += post.copy(id = newId)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        if (!uniqueIds.contains(post.id)) {
            return false
        } else {
            for ((index, item) in posts.withIndex()) {
                if (item.id == post.id) {
                    val newCopy = post.copy(ownerId = item.ownerId, date = item.date)
                    posts[index] = newCopy
                }
            }
            return true
        }
    }
}