/*In Kotlin, variables are declared using two types –

    Immutable using val keyword
    Mutable using var keyword

*Immutable is also called read-only variables.
Hence, we can not change the value of the variable
declared using val keyword.
***Mutable Variables –In Mutable variable we can change the value of the variable.



*/
fun main(args: Array<String>) {
    var salary=24000
    println(salary)
    salary=30000
    println(salary)

    val language = "Kotlin"
    //language="java"  //compile time error
    println(language)

    var myBirthDate = "02/04/1998"
    val myNewBirthDate = myBirthDate
    println(myNewBirthDate)

}