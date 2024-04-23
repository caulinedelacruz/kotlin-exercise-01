fun main() {
    println(factorial(5))

    println(isPrime(47))

    println(reverseString("Hello, I am Cauline Angelica"))

    println(findMaxElement(intArrayOf(17, 13, 42, 27, 3)))

    println(fibonacci(7))

    println(isPalindrome("Madam"))

    println(sumOfDigits(17))

    println(findGcd(42, 120))

    println(countVowels("supercalifragilisticexpialidocious"))

    println(celsiusToFahrenheit(13.17))
}

fun factorial(number: Int): Int {
    var result = 1
    for (i in 1..number) {
        result *= i
    }

    return result
}

fun isPrime(number: Int): Boolean {
    for (i in 2 until number) {
        if (number % i == 0) {
            return false
        }
    }

    return true
}

fun reverseString(string: String): String {
    return string.reversed()
}

fun findMaxElement(array: IntArray): Int? {
    return array.maxOrNull()
}

fun fibonacci(number: Int): Int {
    val fibonacciSequence = mutableListOf(0, 1)

    while (fibonacciSequence.size <= number) {
        fibonacciSequence.add(fibonacciSequence[fibonacciSequence.size - 1] + fibonacciSequence[fibonacciSequence.size - 2])
    }

    return fibonacciSequence.last()
}

fun isPalindrome(string: String): Boolean {
    val lowerCaseString = string.lowercase()
    return lowerCaseString == lowerCaseString.reversed()
}

fun sumOfDigits(number: Int): Int {
    var num = number
    var sum = 0
    while (num != 0) {
        sum += num % 10
        num /= 10
    }

    return sum
}

fun findGcd(a: Int, b: Int): Int {
    var x = a
    var y = b
    while (y != 0) {
        val temp = y
        y = x % y
        x = temp
    }

    return x
}

fun countVowels(string: String): Int {
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    return string.count { it in vowels }
}

fun celsiusToFahrenheit(temperature: Double): Double {
    return (temperature * 1.8) + 32
}


