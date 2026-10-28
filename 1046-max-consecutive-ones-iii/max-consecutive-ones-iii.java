class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int zeroes = 0;
        int maxLength = 0;

        for(int right = 0; right <= nums.length -1 ; right++){
            if(nums[right] == 0){
                zeroes++;
            }

            while(zeroes > k){
                if(nums[left] == 0){
                    zeroes--;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}