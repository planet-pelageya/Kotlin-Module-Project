
        fun addArchive() {
            println("Введите текстовое название для имени")
            var name = CommonMethods.takecommand()
            var instance = Archive(name)
            println("Архив ${name} создан")
        }

        fun addnote():Note {
            println("Введите текстовое название для имени")
            var name = CommonMethods.takecommand()
            println("Введите текст")
            var text = CommonMethods.takecommand()
            val instance = Note(name, text)
            println("Заметка создана")
            return instance
        }



