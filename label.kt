fun main(){
    outer@ for (i in 1..10) {
        inner@ for (j in 1..10) {
            if (i == 3 && j == 4) {
                break@outer // jump out of the outer loop
            }
            println("i = $i, j = $j")
        }
    }
}