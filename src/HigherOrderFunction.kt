fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {  // Declares a higher-order function. It takes two integer parameters, x and y.
                                                                    // Additionally, it takes another function operation as a parameter.
                                                                    // The operation parameters and return type are also defined in the declaration.
    return operation(x, y)                                          // The higher order function returns the result of operation invocation with the supplied agruments.
}

fun sum(x: Int, y: Int) = x + y                                     // Declares a function that matches the operationsignature.


fun operation(): (Int) -> Int {                                     // Declares a higher-order function that returns a function.
    return ::square
}

fun square(x: Int) = x * x

fun main(args: Array<String>) {
    val sumResult = calculate(4, 5, ::sum)                    // Invokes the higher-order function passing in two integer values and the function argument ::sum. :: is the notation that references a function by name in Kotlin.
    val mulResult = calculate(4, 5) { a, b -> a * b }         // Invokes the higher-order function passing in a lambda as a function argument. Looks clearer, doesn't it?
    println("sumResult $sumResult, mulResult $mulResult")

    val func = operation()                                          // Invokes operation to get the result assigned to a variable. Here func becomes square which is returned by operation.
    println(func(2))
}