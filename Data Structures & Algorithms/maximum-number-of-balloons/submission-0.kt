class Solution {
    fun maxNumberOfBalloons(text: String): Int {
        val mp = mutableMapOf<Char, Int>()
        for (c in text) {
            if (c in "balon") {
                mp[c] = mp.getOrDefault(c, 0) + 1
            }
        }

        if (mp.size < 5) {
            return 0
        }

        mp['l'] = mp['l']!! / 2
        mp['o'] = mp['o']!! / 2
        return mp.values.min()
    }
}