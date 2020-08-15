import java.util.Arrays;

public class Solution2 {
    public int leastInterval(char[] tasks, int n) {
        if (tasks.length <= 0) {
            return 0;
        }
        int[] taskNum = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            taskNum[tasks[i] - 'A']++;
        }
        //从大到小排序
        Arrays.sort(taskNum);
        int sameNum = 1;
        //寻找和最大任务数相同的任务
        for (int i = taskNum.length - 2; i >= 0; i--) {
            if (taskNum[i] != taskNum[taskNum.length - 1]) {
                break;
            }
            sameNum++;
        }
        return Math.max((taskNum[taskNum.length - 1] - 1) * (n + 1) + sameNum, tasks.length);
    }
}
