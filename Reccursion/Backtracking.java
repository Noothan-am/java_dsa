
// N Queen

class Solution {
    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';
        List<List<String>> res = new ArrayList<List<String>>();
        dfs(0, board, res, n);
        return res;
    }

    public static void dfs(int col, char[][] board, List<List<String>> res, int n) {
        if(n == col) {
            res.add(construct(board));
            return;
        }
        for(int row = 0; row < n; row++) {
            if(isValid(row, col, board, n)) {
                board[row][col] = 'Q';
                dfs(col+1, board, res, n);
                board[row][col] = '.';
            }
        }
    }

    public static boolean isValid(int r, int c, char[][] board, int n) {
        int row =r;
        int col =c;
        while(col >= 0){
            if(board[row][col] == 'Q') return false;
            col--;
        }
        row =r;
        col =c;
        while(row >= 0 && col >= 0){
            if(board[row][col] == 'Q') return false;
            row--;
            col--;
        }
        row =r;
        col =c;
        while(row < n && col >= 0){
            if(board[row][col] == 'Q') return false;
            row++;
            col--;
        }
        return true;
    }

    static List<String> construct(char[][] board) {
        List<String> res = new ArrayList<String>();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}
