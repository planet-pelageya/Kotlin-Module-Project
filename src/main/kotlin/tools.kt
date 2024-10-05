            fun addArchive() {
            println("Введите текстовое название для имени")
            var name = CommonMethods.takeCommandFromUser()
            var makeArchive = Archive(name)
            println("Архив ${name} создан")
        }

        fun addNote():Note {
            println("Введите текстовое название для имени")
            var name = CommonMethods.takeCommandFromUser()
            println("Введите текст")
            var text = CommonMethods.takeCommandFromUser()
            val instance = Note(name, text)
            println("Заметка создана")
            return instance
        }

