import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        s.leastInterval(new char[]{'B', 'A', 'A', 'A', 'B', 'B'}, 3);
    }
    @Test
    public void test2() {
        Solution2 s = new Solution2();
        s.leastInterval(new char[]{'B', 'A', 'A', 'A', 'B', 'B'}, 3);
    }
}
