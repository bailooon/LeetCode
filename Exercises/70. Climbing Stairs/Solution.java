class Solution {
    public int climbStairs(int n) {

        int way1 = 1;
        int way2 = 2;

        if (n <= 2) {
            return n;
        }

        for (int i = 3; i <= n; i++) {
            int current = way1 + way2;
            way1 = way2;
            way2 = current;
        }

        return way2;

    }
}
