val a = 12
val b = 5
val operator = readLine()

val result = when (operator) {
    "+" -> a + b
    "-" -> a - b
    "*" -> a * b
    "/" -> a / b
    else -> "$operator operator is invalid operator."
}