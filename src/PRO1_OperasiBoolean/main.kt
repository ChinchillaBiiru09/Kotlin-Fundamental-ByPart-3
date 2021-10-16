package PRO1_OperasiBoolean

fun main() {
    // OPERASI BOOLEAN -> OPERATOR LOGIKA
//    operator ini digunakan untuk mengoperasikan 2 buah nilai boolean
//    simbol: && -> and, || -> or, ! -> not(negasi)
//    aturan: true && true = true, true || true = true, true || false = true, false || true = true, !false = true.
//    selain yang diatas, maka hasilnya false
    val benar = true
    val salah = false

    println("OPERATOR && (AND)")
    val dan1: Boolean = benar && benar
    println("TRUE && TRUE -> $dan1")
    val dan2: Boolean = benar && salah
    println("TRUE && FALSE -> $dan2")
    val dan3: Boolean = salah && benar
    println("FALSE && TRUE -> $dan3")
    val dan4: Boolean = salah && salah
    println("FALSE && FALSE -> $dan4")
    println("================================\n")

    println("OPERATOR || (OR)")
    val atau1: Boolean = benar || benar
    println("TRUE || TRUE -> $atau1")
    val atau2: Boolean = benar || salah
    println("TRUE || FALSE -> $atau2")
    val atau3: Boolean = salah || benar
    println("FALSE || TRUE -> $atau3")
    val atau4: Boolean = salah || salah
    println("FALSE || FALSE -> $atau4")
    println("================================\n")

    println("OPERATOR ! (NOT)")
    val negasi1: Boolean = !benar
    println("!TRUE -> $negasi1")
    val negasi2: Boolean = !salah
    println("!FALSE -> $negasi2")
    println("================================\n")

    //STUDI KASUS
    val nilaiUjian = 85
    val nilaiAbsen = 90
    val nilaiExtra = 70

    val lulusUjian = nilaiUjian > 80
    val lulusAbsen = nilaiAbsen > 75
    val lulusExtra = nilaiExtra > 75

    val lulus = lulusUjian && lulusAbsen
    val lulus2 = lulusUjian && lulusAbsen && lulusExtra
    // -> (lulusUjian && lulusAbsen) && lulusExtra
    // => true && lulusExtra -> false
    println(lulus) // -> true
    println(lulus2) // -> false
}

// By Venonymous