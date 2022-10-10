fun main() {
    println("Hello, World!")
    var programmer: Human = object: Human {
    override fun think() {
        println("I am an example of Anonymous Inner Class")
    }
    }
    programmer.think()
}
interface Human {
    fun think()
}