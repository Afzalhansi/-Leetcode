    class Solution {
        public int[] runningSum(int[] nums) {
            int sum = 0;

            for(int i = 0; i < nums.length; i++){
                int curr = nums[i];
                sum = sum + curr;
                nums[i] = sum; 
            }
            return nums;
        }
    }
