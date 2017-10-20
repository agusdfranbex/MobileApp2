fun main(args: Array<String>) {
    for (a in 1..5) {
        for (b in 5 downTo a) {
            print("*")
        }
        println()
    }
}