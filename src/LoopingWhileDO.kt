fun main(args: Array<String>) {
    print("masukkan banyaknya perulangan : ")
    var batas:Int= readLine()!!.toInt()
    var a:Int=1
    do {
        println("coba ke - $a")
        a++
    }while (a<=batas)
}