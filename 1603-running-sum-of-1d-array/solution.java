    class Solution {
        public int[] runningSum(int[] nums) {
            int prefixsum = 0;

            for(int i = 0; i < nums.length; i++){
                prefixsum = prefixsum + nums[i];
                nums[i] = prefixsum;
            }
            return nums;
        }
    }
