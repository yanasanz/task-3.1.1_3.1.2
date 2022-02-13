class WallService {
    private var posts = emptyArray<Post>()
    private var uniqueIds = emptyArray<Int>()

    fun add(post: Post): Post {
        if (uniqueIds.contains(post.id)) {
            println("Ошибка. Такой пост уже существует")
        } else {
            uniqueIds += post.id
            posts += post
        }
        return posts.last()
    }

    fun update(post: Post): Boolean {
        if (uniqueIds.contains(post.id)) {
            for ((index, item) in posts.withIndex()) {
                if (item.id == post.id) {
                    val newCopy = post.copy(ownerId = item.ownerId, date = item.date)
                    posts[index] = newCopy
                }
            }
            return true
        }
        return false
    }
}