import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int leastInterval(char[] tasks, int n) {
        if (tasks.length <= 0) {
            return 0;
        }
        Integer[] taskNum = new Integer[26];
        Arrays.fill(taskNum, new Integer(0));
        for (int i = 0; i < tasks.length; i++) {
            taskNum[tasks[i] - 'A']++;
        }
        //从大到小排序
        Arrays.sort(taskNum, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        int maxNums = 1;
        //寻找和最大任务数相同的任务
        for (int i = 1; i < taskNum.length; i++) {
            if (taskNum[i].equals(taskNum[0])) {
                break;
            }
            maxNums = i + 1;
        }
        return Math.max((taskNum[0] - 1) * (n + 1) + maxNums, tasks.length);
    }
}
