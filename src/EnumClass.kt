enum class State {
    IDLE, RUNNING, FINISHED                           // Defines a simple enum class with three enum instances. The number of instances is always finite and they are all distinct.
}

enum class Color(val rgb: Int) {                      // Defines an enum class with a property and a method.
    RED(0xFF0000),                               // Each instance must pass an argument for the constructor parameter.
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    fun containsRed() = (this.rgb and 0xFF0000 != 0)  // 3
}

fun main(args: Array<String>) {
    val state = State.RUNNING                         // Accesses an enum instance via the class name.
    val message = when (state) {                      // With enums, the compiler can infer if a when-expression is exhaustive so that you don't need the else-case.
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }
    println(message)

    val red = Color.RED
    println(red)                                      // The default toString returns the name of the instance, here "RED".
    println(red.containsRed())                        // Calls a method on a enum instance.
    println(Color.BLUE.containsRed())                 // Calls a method via enum class name.
}