class EnumClass {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val state = State.RUNNING                         // Accesses an enum instance via the class name.
            val message = when (state) {                      // With enums, the compiler can infer if a when-expression is exhaustive so that you don't need the else-case.
                State.IDLE -> "It's idle"
                State.RUNNING -> "It's running"
                State.FINISHED -> "It's finished"
            }
            println(message)
        }

        enum class State {
            IDLE, RUNNING, FINISHED                           // Defines a simple enum class with three enum instances. The number of instances is always finite and they are all distinct.
        }
    }
}