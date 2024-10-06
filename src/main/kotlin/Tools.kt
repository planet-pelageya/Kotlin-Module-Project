            fun addArchive() {
            println("Введите текстовое название для имени")
            val name = CommonMethods.takeCommandFromUser()
            var makeArchive = Archive(name)
            println("Архив $name создан")
        }

        fun addNote():Note {
            println("Введите текстовое название для имени")
            val name = CommonMethods.takeCommandFromUser()
            println("Введите текст")
            val text = CommonMethods.takeCommandFromUser()
            val instance = Note(name, text)
            println("Заметка создана")
            return instance
        }

