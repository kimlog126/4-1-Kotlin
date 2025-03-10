fun main(){
    val child =5
    val adult = 28
    val senior = 87

    println("$child 살 가격: \$${ticketPrice(child)}")
    println("$adult 살 가격: \$${ticketPrice(adult)}")
    println("$adult 살 월요일 할인 가격: \$${ticketPrice(adult, true)}")
    println("$senior 살 가격: \$${ticketPrice(senior)}")
    println("1000 살 가격: \$${ticketPrice(1000)}")
}

fun ticketPrice(age: Int, isMonday: Boolean = false): Int {
    return when (age) {
        in 0..5 -> 15
        in 5..60 -> if (isMonday) 25 else 30
        in 61..100 -> 20
        else -> -1
    }
}

