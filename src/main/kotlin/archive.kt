class archive(override var header:String,  var notes :MutableList<Note> = mutableListOf(), override var index: Int = 1) : showing {

    companion object{
        var allInstances =mutableListOf<archive>()
        var count: Int = 1

    }

    init {
        this.index = count
        allInstances.add(this)
        count += 1

    }

}