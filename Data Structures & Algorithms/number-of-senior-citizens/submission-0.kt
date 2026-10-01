class Solution {
    fun countSeniors(details: Array<String>): Int {
        var totalSen = 0

        for(citizen in details) {
            val age = citizen.substring(11,13).toInt()
            totalSen += if(age > 60) 1 else 0
        }

        return totalSen
    }
}
