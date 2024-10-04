import archive.Companion.allInstances
class tools() {
    companion object {
        fun addArchive() {
            println("Введите текстовое название для имени")
            var name = commonMethods.takecommand()
            var instance = archive(name)
            println("Архив ${name} создан")
        }

        fun addnote():Note {
            println("Введите текстовое название для имени")
            var name = commonMethods.takecommand()
            println("Введите текст")
            var text = commonMethods.takecommand()
            val instance = Note(name, text)
            println("Заметка создана")
            return instance
        }


    }
}