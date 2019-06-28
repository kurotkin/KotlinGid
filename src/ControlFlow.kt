class ControlFlow {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            cases("Hello")
            cases(1)
            cases(0L)
            cases(MyClass())
            cases("hello")

            // for
            val cakes = listOf("carrot", "cheese", "chocolate")
            for (cake in cakes) {
                println("Yummy, it's a $cake cake!")
            }

            //while do
            var cakesEaten = 0
            var cakesBaked = 0

            while (cakesEaten < 5) {
                println("Eat a Cake")
                cakesEaten ++
            }

            do {
                println("Bake a Cake")
                cakesBaked++
            } while (cakesBaked < cakesEaten)


            for(i in 2..8 step 2) {
                print(i)
            }
            println(" ")

        }

        fun cases(obj: Any) {
            when (obj) {
                1 -> println("One")
                "Hello" -> println("Greeting")
                is Long -> println("Long")
                !is String -> println("Not a string")
                else -> println("Unknown")
            }
        }

        class MyClass
    }
}