import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1(){

        Solution s = new Solution();
        s.lengthOfLongestSubstring("aau");
        s.lengthOfLongestSubstring("pwwkew");
        s.lengthOfLongestSubstring("abcabcbb");
        s.lengthOfLongestSubstring("bbbbb");

        s.lengthOfLongestSubstring("b");
    }
}
