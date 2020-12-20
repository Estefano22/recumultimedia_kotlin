import java.util.*
object Nparimpar {
    @JvmStatic

    fun main(args: Array<String>) {
    val Numero: Int
    val Nintroducido = Scanner(System.`in`)

    System.out.printf("Escribe un número:")
    Numero = Nintroducido.nextInt()

    if (Numero % 2 == 0) {
    } else {
        var numeroA1 = Random()
        var numA = numeroA1.nextInt(30)+1
        var numB = numeroA1.nextInt(30)
        println(" :${numB + 1}")

        var numeroA2 = Random()
        var numC = numeroA2.nextInt(40)+1
        var numD = numeroA2.nextInt(40)
        println("${numD + 1}")

         var numeroA3 = Random()
        var numE = numeroA3.nextInt(60)+1
        var numF = numeroA3.nextInt(60)
        println("${numF + 1}")

        var numeroA4 = Random()
        var numG = numeroA4.nextInt(34)+1
         var numH = numeroA4.nextInt(34)
        println("${numH + 1}")

         var numeroA5 = Random()
         var numI = numeroA5.nextInt(44)+1
         var numJ = numeroA5.nextInt(44)
         println("${numJ + 1}")
 }
 }
}