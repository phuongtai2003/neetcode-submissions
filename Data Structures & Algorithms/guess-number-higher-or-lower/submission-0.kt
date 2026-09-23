/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return       -1 if num is higher than the picked number
 *                1 if num is lower than the picked number
 *               otherwise return 0
 * fun guess(num: Int): Int
 */

class Solution : GuessGame() {
    fun guessNumber(n: Int): Int {
        var left = 0
        var right = n

        while(true) {
            val mid = left + (right - left) / 2
            val guessRes = guess(mid)
            if(guessRes == 0) return mid
            else if(guessRes > 0) {
                left = mid + 1
            }
            else {
                right = mid - 1
            }
        }
    }
}
