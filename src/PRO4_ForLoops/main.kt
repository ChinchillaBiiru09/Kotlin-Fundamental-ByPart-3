package PRO4_ForLoops

fun main() {
    //FOR LOOPS
//    untuk melakukan perulangan iterasi pada data iterator(array,range, dll)
//    strukturnya mirip dengan foreach

    //FOR ARRAY
//    for(var.penampung in var.array){
//      ~variable penampung bersifat immutable
//      statement
//    }

    val names = arrayOf("Valleza", "Erlhando", "De", "Razha")
    var panjang = 0
    for (name in names){
        println(name)
        panjang++
    }
    println("Total perulangan = $panjang")

    //FOR RANGE
//    biasanya range ditulis didalam for-nya, namun bisa juga diinisialisasi(dimasukkan kedalam variable) terlebih dahulu
//    bisa menggunakan range ascending, maupyb descending. Bisa juga menyertakan step nilai nya
//    for(variable in range step nilai){
//      statement
//    }
//    variable penampung biasanya disimbolkan i
    for (i in 0..10){
        println(i)
    }

    for (i in 10 downTo 0 step 2){
        println(i)
    }


    //GABUNGAN
    val pjg = names.size - 1
    for (i in 0..pjg){
        println("Nama di index $i = ${names.get(i)}")
    }

}

//By Venonymous