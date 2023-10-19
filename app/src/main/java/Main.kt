fun problem1(){
    val array1 = arrayOf(3,4,9,11,0)
    val list1 = listOf(2,3,4,11,26)
    for (number in array1) {
        println(number)
    }
    for (number in list1) {
        println(number)
    }


}


fun problem2(){
    val myString = "Hi, I am Tatevik."
    val string1 = myString.substring(3, 8)
    val string2 = myString + "I am studying at AUA."
    val string3 = myString.toUpperCase()
    val string4 = myString.toLowerCase()
    println(myString)
    println(string1)
    println(string2)
    println(string3)
    println(string4)

}

fun problem3(){
    val subjectGrade = mapOf(
        "Calculus" to 4,
        "Deep Learning" to 4,
        "Linear Algebra" to 3.7,

        )

    // Iterate through the map and print keys and values
    for ((subject, grade) in subjectGrade) {
        println("Subject: $subject, Grade: $grade")
    }
}

fun problem4(number: Int): String = when {
    number > 0 -> "positive"
    number < 0 -> "negative"
    else -> "zero"
}

fun problem5(){
    print("Please enter your name ")
    val yourName = readLine()

    print("Please enter your age ")
    val yourAge = readLine()


    println("Hello, $yourName! Nice to know that you are  $yourAge years old.")

}

fun problem6(number1:Double?, number2:Double?):Double{
    try{if ( number2 ==0.0) {
        throw ArithmeticException("Invalid dividend")
    }
        if (number1 == null || number2 == null ) {
            throw NullPointerException("The arguments are null")
        }

    }
    catch(e: ArithmeticException) {
        println("Error: ${e.message}")
        null
    } catch (e: NullPointerException) {
        println("Error: ${e.message}")
        null
    }
    return number1/number2
}




}



fun main(){
    problem1()
    problem2()
    problem3()
    println(problem4(1))
    println(problem4(-100))
    println(problem4(0))
    println(problem4(108))
    problem5()

}
