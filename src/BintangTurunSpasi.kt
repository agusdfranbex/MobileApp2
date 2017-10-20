fun main(args: Array<String>) {
    for (a in 1..5){
        for (b in 1..a){
            print(" ")
        }

        for (c in 5 downTo a){
            print("*")
        }
        println()
    }
}