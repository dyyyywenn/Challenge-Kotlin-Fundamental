import java.awt.SystemColor.menu
import java.util.*
public var input = Scanner(System.`in`);
fun main() {


    println("===============================")
    print("Nama :")
    val nama: String? = input.nextLine()

    if (nama.isNullOrEmpty()) {
        println("Mohon diisi")
        main()
    }
    print("Kelas :")
    val kelas: String = input.nextLine()
    print("No Absen:")
    val Absen = input.nextInt()
    print("GitHub:")
    val git: String? = null
    val gitLength = git?.length ?: "dyyyywenn"
    println(gitLength)
    println("================================")
    menu()
}
fun menu(){
    println("1. Kerucut\n2. Tabung\n ")
    print ("Pilih Menu Diatas : ")
    val pill:Int? = input.nextInt()
    when (pill) {
        1 -> kerucut()
        2 -> tabung()
        else -> {
            println("Pilihan tidak ada")
            menu()
        }
    }
}
fun kerucut(){
    print("Masukan Tinggi Kerucut : ")
    val tinggi:Double = input.nextDouble()
    print("Masukan Jari-jari Kerucut : ")
    val jari:Double = input.nextDouble()
    val v = hitungKerucut(tinggi.toDouble(),jari.toDouble())
    val volume : Double
    volume = v.toDouble()
    println("Volume dari balok yang mempunyai panjang $tinggi, lebar $jari, dam tinggi $tinggi ini adalah $volume")
}
fun hitungKerucut(t: Double,r: Double):Double{
    val v = (0.33333) * Math.PI * (r * r) * t
    return v.toDouble()

}
fun tabung(){
    println("===========================");
    print("Masukan Tinggi tabung : ");
    var tinggi:Double? = null
    tinggi = input.nextDouble();
    print("Masukan jari-jari tabung: ");
    var jari:Double? = null
    jari = input.nextDouble();
    val v = hitungTabung(tinggi.toDouble(),jari.toDouble())
    val volume : Double
    volume = v.toDouble()
    println("Volume dari balok yang mempunyai panjang $tinggi, lebar $jari, dam tinggi $tinggi ini adalah $volume")


}
fun hitungTabung(t: Double, r: Double):Double{
    val v = Math.PI * r * r * t
    return v.toDouble()

}