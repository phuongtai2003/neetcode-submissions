class Solution {
    private val validOperations = setOf("+", "-", "*", "/")
    fun evalRPN(tokens: Array<String>): Int {
        if(tokens.isEmpty()) return 0

        val resultStack = ArrayDeque<Int>()
        for(token in tokens) {
            if((token in validOperations).not()) {
                resultStack.addLast(token.toInt())
            }
            else {
                val paramB = resultStack.removeLast()
                val paramA = resultStack.removeLast()
                resultStack.addLast(getOperationResult(operation = token, paramA = paramA, paramB = paramB))
            }
        }

        return resultStack.removeLast()
    }

    private fun getOperationResult(operation: String, paramA: Int, paramB: Int) = when(operation){
        "+" -> paramA + paramB
        "-" -> paramA - paramB
        "*" -> paramA * paramB
        "/" -> paramA / paramB
        else -> throw IllegalArgumentException("Invalid operator")
    }
}
