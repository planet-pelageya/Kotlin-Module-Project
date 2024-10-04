class SecondScreen {
    companion object {
        fun SecondScreen(archive: archive) {
            while (true) {
                println("Выберите команду\n1.Создать заметку\n2.Выбрать и прочитать заметку\n3.Выход")
                var command = commonMethods.takecommand().toInt()
                try {
                    when (command) {
                        1 -> {
                            archive.notes.add(tools.addnote())
                        }

                        2 -> {
                            while (true) {
                                try {
                                    val choose = commonMethods.choose(archive.notes)
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
                }catch (e:NumberFormatException){println("Введите цифру")}
            }
        }
    }
}