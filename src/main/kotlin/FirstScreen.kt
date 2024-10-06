import Archive.Companion.allInstances

        fun showFirstScreen() {
            while (true) {
                try {
                    println("Выберите команду\n1.Создать архив\n2.Выбрать архив\n3.Выход")
                    val enter = CommonMethods.takeCommandFromUser()
                    when (enter.toInt()) {
                        1 -> addArchive()

                        2 -> {
                            while (true) {
                                try {
                                    val chooseNumber = CommonMethods.chooseCommand(allInstances)
                                    when (chooseNumber.toInt()) {
                                        in 1..allInstances.size -> secondScreen(allInstances[chooseNumber.toInt() - 1])
                                        allInstances.size + 1 -> break
                                        in allInstances.size + 2..Int.MAX_VALUE -> println("Такой цифры нет")
                                    }
                                } catch (e: NumberFormatException) {
                                    println("Введите цифру")
                                    continue
                                }
                            }
                        }

                        3 -> break

                        in 4..Int.MAX_VALUE -> println("Такой цифры нет")
                    }
                } catch (e: NumberFormatException) {
                    println("Введите цифру")
                    continue
                }
            }
        }

