fun main(args: Array<String>) {
    print("masukkan jumlah count yang diinginkan : ")
    var batas:Int= readLine()!!.toInt()
    for (variable in 1..batas){
        if (variable==3)            //variable yang tidak ditampilkan
            continue
            println("variable ke-$variable")
    }
}