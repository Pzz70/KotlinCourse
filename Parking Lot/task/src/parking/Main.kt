// 2020
import java.util.*

var parking = MutableList(0) { "" }
var allNumbers = MutableList(0) { "" }
var allColors = MutableList(0) { "" }

fun main() {
    do {
        val action = readLine()!!.toString().split(" ")
        when (action[0]) {
            "create" -> create(action)
            "status" -> status()
            "park" -> park(action)
            "leave" -> leave(action)
            "reg_by_color" -> regByColor(action)
            "spot_by_reg" -> spotByReg(action)
            "spot_by_color" -> spotByColor(action)
            "exit" -> return exit()
        }
    } while (action.toString() != "exit")
}

fun create(action: List<String>) {
    val parkLots = action[1].toInt()
    parking = MutableList(parkLots) { "" }
    println("Created a parking lot with $parkLots spots.")
}

fun status() {
    if (parking == MutableList(0) { "" }) {
        println("Sorry, a parking lot has not been created.")
    } else {
        var emptyPlaces = true
        for (i in parking) {
            if (i != "") {
                emptyPlaces = false
            }
        }
        if (emptyPlaces) {
            println("Parking lot is empty.")
        } else {
            var numberPlace = 0
            for (i in parking) {
                numberPlace++
                if (i != "") {
                    println("$numberPlace ${parking[numberPlace - 1]}")
                }
            }
        }
    }
}

fun park(action: List<String>) {
    if (parking == MutableList(0) { "" }) {
        println("Sorry, a parking lot has not been created.")
    } else {
        var freePlace = false
        for (i in parking) {
            if (i == "") {
                freePlace = true
            }
        }

        if (!freePlace) println("Sorry, the parking lot is full.")
        else {
            var spot = 0
            val mark = action[1]
            val color = action[2]
            for (i in parking) {
                spot++
                if (i == "") break
            }
            parking[spot - 1] = "$mark $color"
            allNumbers.add(mark)
            allColors.add(color)
            println("$color car parked in spot $spot.")
        }
    }
}

fun leave(action: List<String>) {
    if (parking == MutableList(0) { "" }) {
        println("Sorry, a parking lot has not been created.")
    } else {
        val leavePlace = action[1].toInt()
        parking[leavePlace - 1] = ""
        allNumbers[leavePlace - 1] = ""
        allColors[leavePlace - 1] = ""
        println("Spot $leavePlace is free.")
    }
}

fun regByColor(action: List<String>) {
    if (parking == MutableList(0) { "" }) {
        println("Sorry, a parking lot has not been created.")
    } else {
        var result = ""
        var testColor = ""
        var noCarsWithColor = true
        for (i in 0..allColors.lastIndex) {
            testColor = allColors[i].lowercase(Locale.getDefault())
            if (testColor == action[1].lowercase(Locale.getDefault())) {
                result += if (result == "") {
                    allNumbers[i]
                } else {
                    ", ${allNumbers[i]}"
                }
                noCarsWithColor = false
            }
        }

        if (noCarsWithColor) {
            println("No cars with color ${action[1]} were found.")
        } else {
            println(result)
        }
    }
}

fun spotByColor(action: List<String>) {
    if (parking == MutableList(0) { "" }) {
        println("Sorry, a parking lot has not been created.")
    } else {
        var result = ""
        var testColor = ""
        var noCarsWithColor = true
        for (i in 0..allColors.lastIndex) {
            testColor = allColors[i].lowercase(Locale.getDefault())
            if (testColor == action[1].lowercase(Locale.getDefault())) {
                result += if (result == "") {
                    "${i + 1}"
                } else {
                    (", ${i + 1}")
                }
                noCarsWithColor = false
            }
        }

        if (noCarsWithColor) {
            println("No cars with color ${action[1]} were found.")
        } else {
            println(result)
        }
    }
}

fun spotByReg(action: List<String>) {
    if (parking == MutableList(0) { "" }) {
        println("Sorry, a parking lot has not been created.")
    } else {
        var result = ""
        var testNumber = ""
        var noCarsWithReg = true
        for (i in 0..allNumbers.lastIndex) {
            testNumber = allNumbers[i]
            if (testNumber == action[1]) {
                result += if (result == "") {
                    "${i + 1}"
                } else {
                    ", ${i + 1}"
                }
                noCarsWithReg = false
            }
        }
        if (noCarsWithReg) {
            println("No cars with registration number ${action[1]} were found.")
        } else {
            println(result)
        }
    }
}

fun exit() {
}
