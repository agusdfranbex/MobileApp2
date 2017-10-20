fun main(args: Array<String>) {
    var array1=Array<Int>(5){0}
    array1[3]=55
    println("Nilai Array[3]= "+array1[3])

    println("elemen dalam array")
    for (element in array1){
        println(element)
    }

    println("elemen dalam array")
    for (index in 0..4){
        println(array1[index])
    }

    var array2=Array<String>(4){" "}
    for (index in 0..3){
        print("nilai array [$index]=")
        array2[index]= readLine()!!
    }

    for (index in 0..3){
        println("array ke [$index] = "+array2[index])
    }
}