class Solution {
    fun lengthOfLastWord(s: String): Int {
        var index = s.length - 1

        var result = 0
        while(index >= 0) {
            if(s[index] == ' ') {
                index--
            }
            else {
                while(index >= 0 && s[index] != ' ') {
                    result += 1
                    index--
                }
                return result
            }
        }

        return result
    }
}
