package tw.tawei.guess

import java.util.*
import kotlin.random.Random


class SecretNumber {
    val secret:Int = Random.nextInt(10)+1
    var count = 0
    fun validate(number:Int):Int{
        count++
        return number-secret
    }
}

fun main() {
    val secretNumber=SecretNumber()
    var guessno = 3
    println(secretNumber.secret)
    println(secretNumber.validate(guessno))
    println("${secretNumber.validate(guessno)},count:${secretNumber.count}")
    println(guessno)
}