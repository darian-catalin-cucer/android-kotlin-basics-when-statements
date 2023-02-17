// Examples of when statements in Kotlin
fun main() {
    val x = 2
    val y = 3

    // Simple when statement
    when (x) {
        1 -> println("x is 1")
        2 -> println("x is 2")
        else -> println("x is neither 1 nor 2")
    }

    // when statement with multiple conditions
    when {
        x < y -> println("x is less than y")
        x > y -> println("x is greater than y")
        else -> println("x and y are equal")
    }

    // when statement with ranges and types
    val value: Any = "Hello"
    when (value) {
        is String -> println("The value is a String")
        in 1..10 -> println("The value is between 1 and 10")
        !is Float -> println("The value is not a Float")
        else -> println("Unknown value")
    }
}
