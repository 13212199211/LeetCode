import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        s.maxDistance(new int[]{5, 4, 3, 2, 1, 1000000000}, 2);
    }
}
