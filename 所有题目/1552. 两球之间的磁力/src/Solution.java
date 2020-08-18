import java.util.Arrays;

public class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        //求出平均最大间距
        int maxDis = (position[position.length - 1] - position[0]) / (m - 1);
        int left = 0;
        int right = maxDis;
        int tempDis = 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (check(mid, position, m)) {
                tempDis = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        return tempDis;
    }

    public boolean check(int dis, int[] position, int m) {
        int left = 0;
        int sum = 0;
        for (int i = 0; i < position.length; i++) {
            if (position[i] - position[left] >= dis) {
                left = i;
                sum++;
                if (sum >= m - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
