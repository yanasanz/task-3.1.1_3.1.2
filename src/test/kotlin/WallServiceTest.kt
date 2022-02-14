import org.junit.Test
import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun id_notNull_after_adding() {
        val aboutDogs = Post(40,12,34,18, text = "Статья про собак")
        val service = WallService()
        service.add(aboutDogs)
        val result = aboutDogs.id
        assertNotEquals(0,result)
    }

    @Test
    fun update_if_id_exists() {
        val aboutCats = Post(1,12,34,18, text = "Статья про кошек")
        val notesFromIndia = Post(8,48,458,7987, text = "Записки из Индии")
        val news = Post(1, 76,24,45, text = "Новости")
        val service = WallService()
        service.add(aboutCats)
        service.add(notesFromIndia)
        service.add(news)
        val update = Post(2,733,52,4785, text = "Обновленные записки")
        val result = service.update(update)
        assertTrue(result)
    }

    @Test
    fun update_if_id_does_not_exist() {
        val aboutCats = Post(1,12,34,18, text = "Статья про кошек")
        val notesFromIndia = Post(8,48,458,7987, text = "Записки из Индии")
        val news = Post(1, 76,24,45, text = "Новости")
        val service = WallService()
        service.add(aboutCats)
        service.add(notesFromIndia)
        service.add(news)
        val update = Post(9,733,52,4785, text = "Обновленные записки")
        val result = service.update(update)
        assertFalse(result)
    }
}