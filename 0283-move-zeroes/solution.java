class Solution {
    public void moveZeroes(int[] nums) {
        int fast = 0;
        int slow = 0;

        while(fast < nums.length){

            if(nums[fast] == 0){
                fast++;
            }else if(nums[fast]!= 0){
                nums[slow] = nums[fast];
                slow++;
                fast++;
            }
        }
        while(slow < nums.length){
                nums[slow] = 0;
                slow++;
            }
    return;
    }
}
