class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int k = nums.length - 1;
        int[] result = new int[nums.length];

        while(left <= right){
            if(nums[left]* nums[left] > nums[right]* nums[right]){
                result[k] = nums[left] * nums[left];
                left++;
                k--;
            }else{
                result[k] = nums[right] * nums[right];
                right--;
                k--;
            }
        }
        return result;
    }
}
