fun main() {
    WallService.add(Post(1, 12, 34, 18, text = "Статья о собаках"))
    WallService.update(Post(1, 56, 48, 12, 1640544454654, "Статья о собаках дополненная"))
    for(post in WallService.posts){
        println(post)}
}