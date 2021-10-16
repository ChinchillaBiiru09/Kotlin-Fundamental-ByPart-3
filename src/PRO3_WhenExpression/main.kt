package PRO3_WhenExpression

fun main() {
    //WHEN EXPRESSION
//    dalam bahasa pemrograman lain, when expression lebih dikenal sebagai switch case
//    digunakan untyk melakukan pengecekan kondisi dalam 1 variable
//    when (kondisi){
//      option 1 -> statement satu baris
//      option 2 -> {
//              statement
//              multiline
//          }
//      else -> statement default
//    }
    val exam = 'A' // kalo variable nya char('..'), makan option nya juga char('..')

    when(exam){
        'A' -> println("Excelent!")
        'B' -> println("Good Job!")
        'C' -> println("Not Bad!")
        'D' -> println("Sorry!")
        'E' -> println("Try Again!")
        else -> {
            println("You don't have any exam.")
            println("Please, contact your teacher!")
        }
    }

    println("====================================================")

    //GROUPING OPTION/MULTIPLE OPTION
//    digunakan kalo ada option dengan statement yang sama
//    when (kondisi){
//      option 1, option 2, dst -> statement satu baris
//      else -> statement default
//    }
    when (exam){
        'A', 'B', 'C' -> println("Congratulation!")
        'D', 'E' -> println("Sorry, Maybe Later")
        else -> println("Unfortunely, there's problem in your system. Please try again!")
    }

    println("====================================================")

    //EXPRESSION IN & !IN
//    untuk mengecek data dari suatu variable didalam array, ada tidak data tersebut didalam arraynya
//    untuk default statement bisa menggunkan else atau !in
//    when (kondisi){
//      in array -> statement
//      else -> statement default  =atau=  !in array -> statement
//    }
    val finalExam = "B"
//    val passValues = arrayOf("A","B","C")
//    when (finalExam){
//        in passValues -> println("Congrats")
//        !in passValues -> println("Sorry")
//    }
    val passValues = arrayOf("D","E","F") // bisa dibalik, isi arraynya bisa untuk yg tidak lulus,tapi sebaiknya jangan
    when (finalExam){
        !in passValues -> println("Congrats")
        in passValues -> println("Sorry")
    }

    println("====================================================")

    //EXPRESSION IS & !IS
//    digunakan untuk mengecek tipe data dari suatu nilai
//    val age = 20 -> tidak bisa, karna secara otomatis dia terbaca sebagai integer dan bernilai true, jadi expression didalam when seakan ngga kepake
    val age: Int? = null // pake null biar bisa
    when (age){
        is Int -> println("THIS IS NUMBER")
        !is Int -> println("THIS IS NOT NUMBER")
    }

    println("====================================================")

    //PENGGANTI ELSE IF
//    untuk melakukan percabangan dengan sebuah kondisi sebagai option nya
//    tidak perlu menggunakan variable didalam when
//    when {
//          kondisi -> statement
//          kondisi -> statement
//          else -> statement
//    }
    val nilai = 90
    when{
        nilai > 90 -> println("Excelent")
        nilai > 75 -> println("Good")
        else -> println("Not Bad")
    }
}

// By Venonymous