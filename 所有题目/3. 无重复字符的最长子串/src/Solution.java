import java.util.HashSet;
import java.util.Set;

public class Solution {
    //滑动窗口
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s.equals("")) {
            return 0;
        }
        int left = 0;
        int right = 0;
        int maxLength = -1;
        Set<Character> set = new HashSet<>();
        //[left,right]
        while (right < s.length() && left <= right) {
            Character cur = s.charAt(right);
            if (set.contains(cur)) {
                maxLength = Math.max(maxLength, right - left);
                Character newCur = s.charAt(left);
                while (newCur != cur) {
                    set.remove((Object) newCur);
                    left++;
                    newCur = s.charAt(left);
                }
                set.remove((Object) newCur);
                left++;

            }
            set.add(cur);
            right++;
        }
        maxLength = Math.max(maxLength, right - left);
        return maxLength;
    }
}
