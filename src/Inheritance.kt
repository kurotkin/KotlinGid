class Inheritance {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val dog: Dog = Yorkshire()
            dog.sayHello()
        }

        open class Dog {
            open fun sayHello() {
                println("wow wow!")
            }
        }

        class Yorkshire : Dog() {
            override fun sayHello() {
                println("wif wif!")
            }
        }
    }
}