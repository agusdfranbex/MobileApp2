fun main(args: Array<String>) {
    var judul="Ini Percobaan Coding String"
    println(judul)              //menampilkan langsung
    println("judul : "+judul)   //menampilkan dngan penghubung +
    println("judul : $judul")   //menampilkan langsung di dalam string menggunakan tanda $

    var nama="agus" + " setiawan" + " calon SKom"
    println("nama : $nama")
    println("coba : "+judul[1])
    println("Uppercase " +judul.toUpperCase())
    println("Lowercase "+judul.toLowerCase())
    println("Split : "+judul.split(delimiters = ""))
    println("trim : "+judul.trim())


}