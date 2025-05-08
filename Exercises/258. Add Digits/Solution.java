class Solution {
    public int addDigits(int num) {

        int rest = 0;
        int i = 0;

        if (num < 10) {
            return num;
        }

        while (i == 0) {
            rest = num % 10;
            num /= 10;
            num += rest;

            if (num < 10) {
                i++;
            }
        }

        return num;

    }
}
