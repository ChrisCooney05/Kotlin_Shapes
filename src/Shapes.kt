fun main() {
    // Square Variables
    val sqSide = 7
    val sqChar1 = "X  "
    val sqChar2 = "O  "
    // Write your code below
    for (i in 1..sqSide) {
        for (j in 1..sqSide) {
            if (j % 2 == 0 && i % 2 == 0 || j % 2 != 0 && i % 2 != 0) {
                print(sqChar1)
            } else {
                print(sqChar2)
            }
        }
        println()
    }
    println()
    // Triangle Variables
    val triRows = 10
    var triCount = 0
    var triRowLen = triRows
    val triChar1 = "/  "
    val triChar2 = "   "
    // Write your code below
    for (i in triRows downTo 1) {
        while ( triCount < triRowLen) {
            triCount++
            if (triCount != 1 && triCount != triRowLen && i != triRows) {
                print(triChar2)
            } else {
                print(triChar1)
            }
        }
        triCount = 0
        println()
        triRowLen--
    }

    //@grid is a label. if 1 == 3 we can break out of both loops
    //can also be used with continue to skip a block
    grid@ for (i in 1..3) {
        for ( j in 'A'..'C') {
            if (i == 3) {
                break@grid
            }
            print("$i$j")
        }
        println()
    }

}