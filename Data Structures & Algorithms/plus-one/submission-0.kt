class Solution {
    fun plusOne(digits: IntArray): IntArray {
        if(digits.isEmpty()) return digits
        val lastDigit = digits[digits.size - 1]
        var remainder = if(lastDigit + 1 >= 10) {
            (lastDigit + 1) / 10
        } else {
            0
        }

        digits[digits.size - 1] += 1
        if(remainder == 0) {
            return digits
        }

        digits[digits.size - 1] %= 10
        var index = digits.size - 2
        while(remainder != 0 && index >= 0) {
            val lastDigitVal = digits[index] + remainder
            remainder = if(lastDigitVal >= 10) {
                digits[index] = lastDigitVal % 10
                lastDigitVal / 10
            } else {
                digits[index] = lastDigitVal
                0
            }
            index--
        }

        if(remainder==0) return digits
        val resultWithRemainder = IntArray(1 + digits.size)
        for(index in resultWithRemainder.indices) {
            if(index == 0) {
                resultWithRemainder[index] = remainder
            }
            else {
                resultWithRemainder[index] = digits[index-1]
            }
        }
        return resultWithRemainder
    }
}
