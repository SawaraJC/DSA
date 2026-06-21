//Using strings

// class Solution {
//     public boolean isValidSudoku(char[][] board) {
//         HashSet<String> seen = new HashSet<>();
        
//         for (int r = 0; r < 9; r++) {
//             for (int c = 0; c < 9; c++) {
//                 char val = board[r][c];

//                 if (val != '.') {
//                     String rowKey = val + " in row " + r;
//                     String colKey = val + " in col " + c;
//                     String blockKey = val + " in block " + (r / 3) + "-" + (c / 3);
                    

//                     if (!seen.add(rowKey) || !seen.add(colKey) || !seen.add(blockKey)) {
//                         return false;
//                     }
//                 }
//             }
//         }
        
//         return true;
//     }
// }

//short hands - Strings

// class Solution {
//     public boolean isValidSudoku(char[][] board) {

//         HashSet<String> set = new HashSet<>();

//         for(int r = 0; r < 9; r++) {

//             for(int c = 0; c < 9; c++) {

//                 char val = board[r][c];

//                 if(val == '.') {
//                     continue;
//                 }

//                 int box = (r / 3) * 3 + (c / 3);

//                 if(!set.add(val + "r" + r) ||
//                    !set.add(val + "c" + c) ||
//                    !set.add(val + "b" + box))
//                 {
//                     return false;
//                 }
//             }
//         }

//         return true;
//     }
// }


//without string creation overheads

// class Solution {
//     public boolean isValidSudoku(char[][] board) {

//         HashSet<Integer> set = new HashSet<>();

//         for(int r = 0; r < 9; r++) {

//             for(int c = 0; c < 9; c++) {

//                 if(board[r][c] == '.') {
//                     continue;
//                 }

//                 int num = board[r][c] - '0';

//                 int box = (r / 3) * 3 + (c / 3);

//                 int rowKey = num * 100 + r;
//                 int colKey = 1000 + num * 100 + c;
//                 int boxKey = 2000 + num * 100 + box;

//                 if(!set.add(rowKey) ||
//                    !set.add(colKey) ||
//                    !set.add(boxKey))
//                 {
//                     return false;
//                 }
//             }
//         }

//         return true;
//     }
// }


//Boolean arrays:

class Solution {

    public boolean isValidSudoku(char[][] board) {

        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for(int r = 0; r < 9; r++) {

            for(int c = 0; c < 9; c++) {

                if(board[r][c] == '.') {
                    continue;
                }

                int num = board[r][c] - '1';

                int box = (r / 3) * 3 + (c / 3);

                if(rows[r][num] ||
                   cols[c][num] ||
                   boxes[box][num])
                {
                    return false;
                }

                rows[r][num] = true;
                cols[c][num] = true;
                boxes[box][num] = true;
            }
        }

        return true;
    }
}