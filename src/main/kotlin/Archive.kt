class Archive(override var header:String, var notes :MutableList<Note> = mutableListOf(), override var index: Int = 1) : Showing {

    companion object{
        var allInstances =mutableListOf<Archive>()
        var count: Int = 1

    }

    init {
        this.index = count
        allInstances.add(this)
        count += 1

    }

}