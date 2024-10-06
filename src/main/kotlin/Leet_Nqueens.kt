class Leet_Nqueens {
    fun solveNQueens(n: Int): List<List<String>> {
        val board = Array(n) { CharArray(n) { '.' } }
        val results: ArrayList<ArrayList<String>> = arrayListOf()
        val leftRow = BooleanArray(n)
        val upperDiagonal = BooleanArray(2 * n - 1)
        val lowerDiagonal = BooleanArray(2 * n - 1)

        attack(0, board, results, leftRow, upperDiagonal, lowerDiagonal)

        return results
    }

    private fun attack(
        col: Int,
        board: Array<CharArray>,
        results: ArrayList<ArrayList<String>>,
        leftRow: BooleanArray,
        upperDiagonal: BooleanArray,
        lowerDiagonal: BooleanArray
    ) {
        if (col == board.size) {
            results.add(createBoard(board))
            return
        }

        for (row in board.indices) {
            if (!leftRow[row]&& !lowerDiagonal[row + col] && !upperDiagonal[board.size - 1 + col - row]) {
                board[row][col] = 'Q'
                leftRow[row] = true
                lowerDiagonal[row + col] = true
                upperDiagonal[board.size - 1 + col - row] = true
                attack(col + 1, board, results, leftRow, upperDiagonal, lowerDiagonal)
                // Update backtracking
                board[row][col] = '.'
                leftRow[row] = false
                lowerDiagonal[row + col] = false
                upperDiagonal[board.size - 1 + col - row] = false

            }
        }
    }
    private fun createBoard(board: Array<CharArray>): ArrayList<String> {
        val results = arrayListOf<String>()
        for (i in board.indices) {
            results.add(String(board[i]))
        }
        return results
    }
}