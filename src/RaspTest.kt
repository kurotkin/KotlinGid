fun main() {
    val maxPrimesCount = 40000
    var currentPrimesCount = 1
    val execTime: Long
    val prevTime = System.currentTimeMillis()


    val primes = LongArray(maxPrimesCount)
    var currentNumber: Long = 3

    var isPrime = false

    primes[0] = 2

    while (currentPrimesCount < maxPrimesCount) {
        isPrime = true
        for (i in 0 until currentPrimesCount) {
            if (currentNumber % primes[i] == 0L) {
                isPrime = false
                break
            }
        }
        if (isPrime) {
            primes[currentPrimesCount] = currentNumber
            currentPrimesCount++
        }
        currentNumber++
    }

    execTime = System.currentTimeMillis() - prevTime
    println("Время выполнения ${execTime}")
    print(currentNumber - 1)


}