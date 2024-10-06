class Note(override var     header:String, var text:String, override var index: Int = 1):Showing {
    companion object{
        var count = 1
    }

    init {
        this.index = count
        count += 1

    }

}