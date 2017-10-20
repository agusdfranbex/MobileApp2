fun main(args: Array<String>) {
    print("masukkan jumlah baris yang diingnkan : ")
    var batas:Int= readLine()!!.toInt()

    for (a in 1..batas) {
            for (b in batas downTo a) { //spasi
                print(" ")
            }
            for (c in 1..a) { //bintang
                print("*")
            }
            for (d in 1..a - 1) {
                print("*")
            }
            println()
        }
    }
