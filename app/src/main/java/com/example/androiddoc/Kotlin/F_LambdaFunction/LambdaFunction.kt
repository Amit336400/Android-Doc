package com.example.mychat.Test.lambdafunction

/***
 *  Basic Syntax : ==
 *  val lambdaName: (InputType) -> ReturnType = { inputParameter : InputType -> expression }
 *  val lambdaName = { inputParameter: InputType -> expression }
 */


/***
 * Lambda Without Parameters
 */
/**
  val print :() -> Unit ={ println("Amit")}
    val print1 = { println("Amit 2") }

    fun main() {
        print()
        print1()
    }

*/


/***
 * Lambda With Parameters.
 *  val lambdaName: (InputType) -> ReturnType = { inputParameter : InputType -> expression }
 */

/*
  val add : (Int , Int) -> Int = {num1,num2 ->
      num1+num2
  }
    val print1 : (String) -> Unit = {
        println("$it")
    }
    fun main() {
        val add = add(22,33)

        print1("$add")  // add.toString

    }
*/

/***
 * Passing Lambda to a Function
 */


/**

    fun cal(
         a: Int , b: Int ,
         operation : (Int , Int )-> Int
    ): Int{

             return operation(a,b)
    }

fun main() {
    val sum = cal(2,3){a,b->
        a+b
    }

    println(sum)

    val multi = cal(4,5){a,b->
        a*b
    }

    println(multi)

}

*/
/***
 * object.apply {
 *     // Access properties or methods using 'this'
 * }
 */


data class Student(
    var name: String,
    var roll: Int,
)

/**

fun main() {
    val student1 = Student("Amit " , 44)

    println(student1.name) //Student(name=Amit , roll=44)

    student1.apply {
        name = "Amit Kundu"
    }
    println(student1.name) // Student(name=Amit Kundu)

}
*/

/***
 * object?.let {
 *     // Use 'it' to access the object
 * }
 */

/**

fun main() {
    val name : String ? = "Name"

    name?.let {

        println(name)

    } ?: println("----")

}

*/


/***
 * object.run {
 *     // Access properties or methods using 'this'
 *     // The last expression is returned
 * }
 */

data class Num(
        val num1:Int,
        val num2 :Int
        )


fun main() {

    val num = Num(2,5)

   val sum =num.run {
        num1+num2
    }

    println(sum)


}




