class DataClass {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val user = User("Alex", 1)
            println(user)                                          // Method toString is auto-generated, which makes println output look nice.

            val secondUser = User("Alex", 1)
            val thirdUser = User("Max", 2)

            println("user == secondUser: ${user == secondUser}")   // Auto-generated equals considers two instances equal if all their properties are equal.
            println("user == thirdUser: ${user == thirdUser}")

            println(user.hashCode())                               // Equal data class instances have equal hashCode().
            println(thirdUser.hashCode())

            // copy() function
            println(user.copy())                                   // Auto-generated copy function makes it easy to create a new instance.
            println(user.copy("Max"))                        // When copying, you can change values of certain properties. copy accepts arguments in the same order as the class constructor.
            println(user.copy(id = 2))                             // Use copy with named arguments to change the value despite of the properties order.

            println("name = ${user.component1()}")                 // Auto-generated componentN functions let you get the values of properties in the order of declaration.
            println("id = ${user.component2()}")
        }

        data class User(val name: String, val id: Int)              // Defines a data class with the data modifier.

    }
}