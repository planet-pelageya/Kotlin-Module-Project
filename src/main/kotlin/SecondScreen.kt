        fun secondScreen(archive: Archive) {
            while (true) {
                try {
                println("Выберите команду\n1.Создать заметку\n2.Выбрать и прочитать заметку\n3.Выход")
                val command = CommonMethods.takeCommandFromUser().toInt()
                    when (command) {

                        1 -> archive.notes.add(addNote())

                        2 -> {
                            while (true) {
                                try {
                                    val choose = CommonMethods.chooseCommand(archive.notes)
                                    when (choose.toInt()) {
                                        in 1..archive.notes.size -> {
                                            println(archive.notes[choose.toInt() - 1].text)
                                            break
                                        }
                                        archive.notes.size +1 -> break
                                        in archive.notes.size + 2..Int.MAX_VALUE -> println("Такой цифры нет")
                                    }
                                }catch (e:NumberFormatException){println("Введите цифру")
                                    continue}
                            }
                        }

                        3 -> return

                        in 4..Int.MAX_VALUE -> println("Такой цифры нет")
                    }
                }catch (e:NumberFormatException){println("Введите цифру")
                    continue}
            }
        }