package PRO2_IfExpression

fun main() {
    //IF EXPRESSION
//    kata kunci untuk percabangan
//    if(kondisi_boolean){
//      "dieksekusi jika kondisi_boolean true"
//    }
    val nilai = 85

    if (nilai > 70){
        println("Good Job!")
    }

    //ELSE EXPRESSION
//    if(boolean){
//      "dieksekusi jika nilai boolean true"
//    } else {
//      "dieksekusi jika nilai boolean false"
//    }

    if (nilai > 90){
        println("Good Job!")
    } else {
        println("Try Again!")
    }

    //ELSE IF EXPRESSION
    //    if(boolean1){
//      "dieksekusi jika nilai boolean1 true"
//    } else if(boolean2) {
//      "dieksekusi jika nilai boolean1 false, dan boolean2 true"
//    } else {
//      "dieksekusi jika boolean1 dan boolean2 false"
//    }

    if (nilai > 90){
        println("Good Job!")
    } else if (nilai > 70){
        println("Not Bad!")
    } else {
        println("Try Again!")
    }
}

// By Venonymous