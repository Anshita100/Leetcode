class Solution {
    public void solve(char[][] board) {
        int n = board.length;
        if (n == 0) return;
        int m = board[0].length;

        // Mark boundary 'O's and any 'O's connected to them with '#'
        for (int i = 0; i < n; i++) {
            if (board[i][0] == 'O') helper(i, 0, board);
            if (board[i][m - 1] == 'O') helper(i, m - 1, board);
        }
        for (int j = 0; j < m; j++) {
            if (board[0][j] == 'O') helper(0, j, board);
            if (board[n - 1][j] == 'O') helper(n - 1, j, board);
        }

        // Flip remaining 'O' to 'X' and revert '#' back to 'O'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if (board[i][j] == '#') {
                    board[i][j] = 'O';
                }
            }
        }
    }

    // Helper function to mark 'O's connected to boundary 'O's
    public void helper(int i, int j, char[][] board) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != 'O') {
            return;
        }
        board[i][j] = '#'; // Mark as part of the boundary-connected region
        helper(i + 1, j, board);
        helper(i - 1, j, board);
        helper(i, j + 1, board);
        helper(i, j - 1, board);
    }
}
