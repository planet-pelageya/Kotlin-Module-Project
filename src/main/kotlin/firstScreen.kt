import archive.Companion.allInstances
import archive.Companion.count

class firstScreen {
    companion object {
        fun firstScreen(){
            while (true) {
                println("Выберите команду\n1.Создать архив\n2.Выбрать архив\n3.Выход")
                var enter = commonMethods.takecommand()
                when (enter.toInt()) {
                    1 -> tools.addArchive()
                    2 -> {
                        while (true) {
                            try {


                                var enter = commonMethods.choose(allInstances)
                                when (enter.toInt()) {
                                    in 1..allInstances.size -> SecondScreen.SecondScreen(allInstances[enter.toInt() - 1])
                                    allInstances.size + 1 -> break
                                    in allInstances.size + 2..Int.MAX_VALUE -> println("Такой цифры нет")
                                }
                            }catch (e:NumberFormatException){println("Введите цифру")
                                continue}
                        }
                    }

                    3 -> break
                    in 4..Int.MAX_VALUE -> println("Такой цифры нет")
                }

            }
        }
    }
}
