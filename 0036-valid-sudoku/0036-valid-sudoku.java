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


class Solution {
    public boolean isValidSudoku(char[][] board) {

        HashSet<String> set = new HashSet<>();

        for(int r = 0; r < 9; r++) {

            for(int c = 0; c < 9; c++) {

                char val = board[r][c];

                if(val == '.') {
                    continue;
                }

                int box = (r / 3) * 3 + (c / 3);

                if(!set.add(val + "r" + r) ||
                   !set.add(val + "c" + c) ||
                   !set.add(val + "b" + box))
                {
                    return false;
                }
            }
        }

        return true;
    }
}