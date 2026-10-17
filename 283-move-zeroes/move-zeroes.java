class Solution {
    public void moveZeroes(int[] nums) {
        int fast = 0;
        int slow = 0;

        for(int i = 0; i <= nums.length - 1; i++){

            if(nums[fast] == 0){
                fast++;
            }else if(nums[fast]!= 0){
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow++;
                fast++;
            }
        }
    return;
    }
}