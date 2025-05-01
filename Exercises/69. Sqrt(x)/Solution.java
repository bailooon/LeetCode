class Solution {
    public int mySqrt(int x) {
        int start = 1;
        int end = x / 2;
        int answer = 0;

        if(x < 2){
            return x;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            double square = (double) mid * mid;
            if (square == x) {
                return mid;
            } else if (square < x) {
                answer = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return answer;
    }
}
