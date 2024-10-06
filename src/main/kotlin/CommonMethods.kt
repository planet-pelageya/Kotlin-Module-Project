class CommonMethods(
    override var index: Int,
    override var header: String
) : Showing {
    companion object {
        fun takeCommandFromUser(): String {
            while (true) {
                var command = readLine()!!
                if (command.isNotBlank()) {
                    return command
                } else {
                    println("Нельзя оставлять ввод пустым")
                }
            }
        }

        fun <T : Showing> chooseCommand(variants: MutableList<T>): String {
            while (true) {
                println("выберите команду")
                for (i in variants) {
                    println("${i.index}. ${i.header}")
                }
                println("${variants.size + 1}. Выход")
                val command = takeCommandFromUser()
                return command
            }
        }
    }
}