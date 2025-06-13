class Solution {
    public int maxAdjacentDistance(int[] nums) {

        int maxDiff = 0;
        int size = nums.length;

        for(int i = 0; i < size; i++){
            int next = (i + 1) % size;
            int diff = Math.abs(nums[i] - nums[next]);
            maxDiff = Math.max(maxDiff, diff);
        }

        return maxDiff;
    }
}
