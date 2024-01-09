import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun calculateCommissionForVkPay() {
        val cardType ="Vk Pay"
        val sumOfPastTransaction = 0.0
        val currentTransaction = 1000.0
         val result = calculateCommission(cardType, sumOfPastTransaction, currentTransaction)

        assertEquals(0.0,result,0.0)
    }

    @Test
    fun calculateCommissionForMastercardLess75000() {
        val cardType ="Mastercard"
        val sumOfPastTransaction = 0.0
        val currentTransaction = 1000.0
        val result = calculateCommission(cardType, sumOfPastTransaction, currentTransaction)

        assertEquals(0.0,result,0.0)
    }
    @Test
    fun calculateCommissionForMastercardMore75000() {
        val cardType ="Mastercard"
        val sumOfPastTransaction = 76000.0
        val currentTransaction = 1000.0
        val result = calculateCommission(cardType, sumOfPastTransaction, currentTransaction)

        assertEquals(26.0,result,0.0)
    }
    @Test
    fun calculateCommissionForMaestroLess75000() {
        val cardType ="Maestro"
        val sumOfPastTransaction = 0.0
        val currentTransaction = 1000.0
        val result = calculateCommission(cardType, sumOfPastTransaction, currentTransaction)

        assertEquals(0.0,result,0.0)
    }
    @Test
    fun calculateCommissionForMaestroMore75000() {
        val cardType ="Maestro"
        val sumOfPastTransaction = 76000.0
        val currentTransaction = 1000.0
        val result = calculateCommission(cardType, sumOfPastTransaction, currentTransaction)

        assertEquals(26.0,result,0.0)
    }
    @Test
    fun calculateCommissionForVisaLess35() {
        val cardType ="Visa"
        val sumOfPastTransaction = 0.0
        val currentTransaction = 10.0
        val result = calculateCommission(cardType, sumOfPastTransaction, currentTransaction)

        assertEquals(35.0,result,0.0)
    }
    @Test
    fun calculateCommissionForVisaMore35() {
        val cardType ="Visa"
        val sumOfPastTransaction = 0.0
        val currentTransaction = 10000.0
        val result = calculateCommission(cardType, sumOfPastTransaction, currentTransaction)

        assertEquals(75.0,result,0.0)
    }
    @Test
    fun calculateCommissionForMirLess35() {
        val cardType ="Мир"
        val sumOfPastTransaction = 0.0
        val currentTransaction = 10.0
        val result = calculateCommission(cardType, sumOfPastTransaction, currentTransaction)

        assertEquals(35.0,result,0.0)
    }
    @Test
    fun calculateCommissionForMirMore35() {
        val cardType ="Visa"
        val sumOfPastTransaction = 0.0
        val currentTransaction = 10000.0
        val result = calculateCommission(cardType, sumOfPastTransaction, currentTransaction)

        assertEquals(75.0,result,0.0)
    }
    @Test
    fun calculateCommissionUsingLimitsForVkPaySumOfPastTransactionLess40000() {
        val cardType ="Vk Pay"
        val sumOfPastTransaction = 20000.0
        val currentTransaction = 10000.0
        val result = calculateCommission(cardType, sumOfPastTransaction, currentTransaction)

        assertEquals(0.0,result,0.0)
    }
    @Test
    fun calculateCommissionUsingLimitsForVkPaySumOfPastTransactionMore40000() {
        val cardType ="Vk Pay"
        val sumOfPastTransaction = 50000.0
        val currentTransaction = 10000.0
        val result = calculateCommission(cardType, sumOfPastTransaction, currentTransaction)

        assertEquals(0.0,result,0.0)
    }
    @Test
    fun calculateCommissionUsingLimitsForVkPayCurrentTransactionMore15000() {
        val cardType ="Vk Pay"
        val sumOfPastTransaction = 50000.0
        val currentTransaction = 16000.0
        val result = calculateCommission(cardType, sumOfPastTransaction, currentTransaction)

        assertEquals(0.0,result,0.0)
    }
    @Test
    fun calculateCommissionUsingLimitsForVkPayCurrentTransactionLess15000() {
        val cardType ="Vk Pay"
        val sumOfPastTransaction = 50000.0
        val currentTransaction = 1000.0
        val result = calculateCommission(cardType, sumOfPastTransaction, currentTransaction)

        assertEquals(0.0,result,0.0)
    }
    @Test
    fun calculateCommissionUsingLimitsForMastercardSumOfPastTransactionLess600000() {
        val cardType ="Mastercard"
        val sumOfPastTransaction = 76000.0
        val currentTransaction = 10000.0
        val result = calculateCommission(cardType, sumOfPastTransaction, currentTransaction)

        assertEquals(80.0,result,0.0)
    }
    @Test
    fun calculateCommissionUsingLimitsForMastercardSumOfPastTransactionMore600000() {
        val cardType ="Mastercard"
        val sumOfPastTransaction = 600000.0
        val currentTransaction = 10000.0
        val result = calculateCommission(cardType, sumOfPastTransaction, currentTransaction)

        assertEquals(-80.0,result,0.0)
    }
    @Test
    fun calculateCommissionUsingLimitsForMaestroSumOfPastTransactionLess600000() {
        val cardType ="Maestro"
        val sumOfPastTransaction = 76000.0
        val currentTransaction = 10000.0
        val result = calculateCommission(cardType, sumOfPastTransaction, currentTransaction)

        assertEquals(80.0,result,0.0)
    }
    @Test
    fun calculateCommissionUsingLimitsForMaestroSumOfPastTransactionMore600000() {
        val cardType ="Maestro"
        val sumOfPastTransaction = 600000.0
        val currentTransaction = 10000.0
        val result = calculateCommission(cardType, sumOfPastTransaction, currentTransaction)

        assertEquals(-80.0,result,0.0)
    }
    @Test
    fun calculateCommissionUsingLimitsForMastercardCurrentTransactionLess150000() {
        val cardType ="Mastercard"
        val sumOfPastTransaction = 76000.0
        val currentTransaction = 10000.0
        val result = calculateCommission(cardType, sumOfPastTransaction, currentTransaction)

        assertEquals(80.0,result,0.0)
    }
    @Test
    fun calculateCommissionUsingLimitsForMastercardCurrentTransactionMore150000() {
        val cardType ="Mastercard"
        val sumOfPastTransaction = 76000.0
        val currentTransaction = 160000.0
        val result = calculateCommission(cardType, sumOfPastTransaction, currentTransaction)

        assertEquals(-980.0,result,0.0)
    }
    @Test
    fun calculateCommissionUsingLimitsForVisaCurrentTransactionMore150000() {
        val cardType ="Visa"
        val sumOfPastTransaction = 1000.0
        val currentTransaction = 160000.0
        val result = calculateCommission(cardType, sumOfPastTransaction, currentTransaction)

        assertEquals(-1200.0,result,0.0)
    }
    @Test
    fun calculateCommissionUsingLimitsForVisaCurrentTransactionLess150000() {
        val cardType ="Visa"
        val sumOfPastTransaction = 1000.0
        val currentTransaction = 10000.0
        val result = calculateCommission(cardType, sumOfPastTransaction, currentTransaction)

        assertEquals(75.0,result,0.0)
    }
    @Test
    fun calculateCommissionUsingLimitsForVisaSumOfPastTransactionLess600000() {
        val cardType ="Visa"
        val sumOfPastTransaction = 76000.0
        val currentTransaction = 10000.0
        val result = calculateCommission(cardType, sumOfPastTransaction, currentTransaction)

        assertEquals(75.0,result,0.0)
    }
    @Test
    fun calculateCommissionUsingLimitsForVisaSumOfPastTransactionMore600000() {
        val cardType ="Visa"
        val sumOfPastTransaction = 600000.0
        val currentTransaction = 10000.0
        val result = calculateCommission(cardType, sumOfPastTransaction, currentTransaction)

        assertEquals(-75.0,result,0.0)
    }
}


