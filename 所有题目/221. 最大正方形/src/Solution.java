public class Solution {
    public int maximalSquare(char[][] matrix) {
        if (matrix.length <= 0) {
            return 0;
        }
        int[][] repo = new int[matrix.length][matrix[0].length];
        int maxLength = 0;
        //存储以x,y为右下节点的最大正方形边长
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                char cur = matrix[i][j];
                if (cur == '0') {
                    repo[i][j] = -1;
                } else {
                    int curLength = 1;
                    if (i - 1 >= 0 && j - 1 >= 0 && repo[i - 1][j - 1] != -1) {
                        int repoLength = repo[i - 1][j - 1];
                        while (curLength <= repoLength && matrix[i - curLength][j] != '0' && matrix[i][j - curLength] != '0') {
                            curLength++;
                        }
                        repo[i][j] = curLength;
                    } else {
                        repo[i][j] = 1;
                    }
                    maxLength = Math.max(maxLength, curLength);
                }
            }
        }
        return maxLength * maxLength;
    }
}
