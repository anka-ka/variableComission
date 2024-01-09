fun main() {
    println(calculateCommission(currentTransaction = 1000.0))
}

fun calculateCommission(cardType: String = "Vk Pay", sumOfPastTransaction: Double = 0.0, currentTransaction: Double): Double {
    var comission = 0.0
    when {
        (cardType == "Mastercard" && sumOfPastTransaction > 75000.0) ||
                (cardType == "Maestro" && sumOfPastTransaction > 75000.0) -> comission =
            currentTransaction * 0.006 + 20

        cardType == "Visa" || cardType == "Мир" ->
            if ((currentTransaction * 0.75) / 100 > 35.0) {
                comission = (currentTransaction * 0.75) / 100
            } else {
                comission = 35.0
            }

        cardType == "Vk Pay" -> comission = 0.0
    }
    if (cardType != "Vk Pay" && (sumOfPastTransaction + currentTransaction > 600000 || currentTransaction > 150000)) {
        return -comission
    }
    if (cardType == "Vk Pay" && (sumOfPastTransaction + currentTransaction > 40000 || currentTransaction > 15000)) {
        return -comission

    }
    return comission
}
