class Solution {
    public void moveZeroes(int[] nums) {

        int size = nums.length;
        int position = 0;

        for (int i = 0; i < size; i++){
            if(nums[i] != 0){
            nums[position] = nums[i];
            position++;   
            }
        }

        for (; position < size; position++){
            nums[position] = 0;
        }
    }
}
