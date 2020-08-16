import java.util.HashMap;
import java.util.Map;

/**
 * 吃掉一个橘子。
 * 如果剩余橘子数 n 能被 2 整除，那么你可以吃掉 n/2 个橘子。
 * 如果剩余橘子数 n 能被 3 整除，那么你可以吃掉 2*(n/3) 个橘子。
 */
//使用从上往下进行递归，因为吃橘子的顺序没有规定，而且此题满足贪心算法，所以吃一个的时候就会占用很多内存空间
//通过使用贪心算法去除掉吃一个的时候,但是注意1，2，3个橘子的时候需要将一个一个吃也加上
public class Solution2 {
    Map<Integer, Integer> map = new HashMap<>();

    public int minDays(int n) {
        if (n == 0) {
            return 0;
        }
        if (map.containsKey(n)) {
            return map.get(n);
        }
        int method1 = n % 2 + minDays(n / 2) + 1;
        int method2 = n % 3 + minDays(n / 3) + 1;
        int min = Math.min(Math.min(method1, method2), n);
        map.put(n, min);
        return min;
    }


}
