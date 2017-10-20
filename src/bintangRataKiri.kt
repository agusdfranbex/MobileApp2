fun main(okedroid: Array<String>) {
    print("masukkan jumlah baris : ")
    var batas:Int=readLine()!!.toInt()

    for (a in 1..batas) {

        for (b in 1..a) {

            print("*")
        }

        println()

    }
}