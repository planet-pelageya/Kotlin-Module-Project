class commonMethods(override var index: Int,
                    override var header: String):showing {
    companion object{
        fun takecommand(): String {
            while (true){
                var command = readLine()!!
                if (!command.isBlank()){
                    return command
                    break
                }else{
                    println("Нельзя оставлять ввод пустым")

                }
            }

        }
        fun<T: showing> choose(variants:MutableList<T>): String {

            while (true) {
                println("выберите команду")
                for(i in variants) {
                    println("${i.index}. ${i.header}")
                }
                println("${variants.size + 1 }. Выход")
                val command = commonMethods.takecommand()
                return command
            }

        }
}

    }