import java.util.*

fun main(args: Array<String>) {
    val input:Scanner = Scanner(System.`in`)

    println("===============================")
    print("Nama :")
    readLine()
    print("Kelas :")
    readLine()
    print("No Absen:")
    val Absen =input.nextInt()
    println("================================")
    println("Kamu ingin menghitung apa?")
    println("""
        1. Volume Kerucut
        2. Volume Tabung
    """.trimIndent())
    println("=================================")
    print("Pilihanmu:")
    val hitung = input.nextInt()
    val PI = 3.14
    val volume : Double
    if (hitung == 1) {

        print("Masukkan tinggi:")
        val tinggi =input.nextInt()
        print("Masukkan jari-jari:")
        val jari = input.nextInt()
        val kerucut = hitungkerucut(tinggi.toDouble(),PI,jari.toDouble())
        volume = kerucut.toDouble()
        println("Volume dari kerucut yang mempunyai tinggi $tinggi, jari-jari $jari,  adalah $volume")

        }else if (hitung == 2){
        print("Masukkan tinggi:")
        val tinggi = input.nextInt()
        print("Masukkan jari:")
        val jari = input.nextInt()
        val tabung = hitungTabung(tinggi.toDouble(),PI,jari.toDouble())
        volume = tabung.toDouble()
        println("Volume dari tabung yang mempunyai tinggi $tinggi, jari-jari $jari,  adalah $volume")
        }else{
        print("Menu tidak ada")
    }


}
fun hitungkerucut(t : Double,pi: Double,r :Double):Float {
    val kerucut = 1/3 * pi * r * r * t
    return kerucut.toFloat()
}
fun hitungTabung(t: Double,pi: Double,r: Double):Float{
    val tabung =  pi * r * r * t
    return tabung.toFloat()
}