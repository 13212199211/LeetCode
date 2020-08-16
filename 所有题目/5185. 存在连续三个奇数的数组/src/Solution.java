public class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int left = 0;
        int right = 0;
        while (right < arr.length) {
            //如果是奇数
            if (arr[right] % 2 != 0) {
                if (right - left >= 2) {
                    return true;
                }
                right++;
            } else {
                left = ++right;
            }
        }
        return false;
    }
}
