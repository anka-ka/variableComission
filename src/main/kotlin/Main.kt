fun main() {
    println(calculateCommission("Visa", 1000.0, 1000.0))
}
fun calculateCommission(cardType: String, sumOfPastTransaction: Double, currentTransaction: Double): Double {
    var comission = 0.0
    when {
        cardType == "Mastercard" || cardType == "Maestro" && sumOfPastTransaction < 75000 -> comission =
            currentTransaction * 0.006 + 20

        cardType == "Visa" || cardType == "Мир" ->
            if ((currentTransaction * 0.75) / 100 > 35.0) {
                comission = (currentTransaction * 0.75) / 100
            } else {
                comission = 35.0
            }

        cardType == "Vk Pay" -> comission = 0.0
    }
    if (cardType != "Vk Pay" && (sumOfPastTransaction > 600000 || currentTransaction > 150000)) {
        return -comission
    }
    if (cardType == "Vk Pay" && (sumOfPastTransaction > 40000 || currentTransaction > 15000)) {
        return -comission

    }
    return comission
}
