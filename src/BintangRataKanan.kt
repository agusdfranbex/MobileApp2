fun main(args: Array<String>) {
        print("masukkan jumlah baris yang diingnkan : ")
        var batas:Int= readLine()!!.toInt()
        for (a in 1..batas) {
            for (b in batas downTo a) {
                print(" ")
            }
            for (k in 1..a) {
                print("*")
            }
            println()
        }
    }