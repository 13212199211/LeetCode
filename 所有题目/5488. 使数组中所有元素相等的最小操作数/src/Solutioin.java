public class Solutioin {
    public int minOperations(int n) {
        int mid = n / 2;
        int sum = 0;
        for (int i = 0; i < mid; i++) {
            sum += n - (i * 2 + 1);
        }
        return sum;
    }
}
