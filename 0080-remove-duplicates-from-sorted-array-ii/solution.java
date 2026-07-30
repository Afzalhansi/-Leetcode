class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length ==0 || nums.length == 1){
            return nums.length;
        }

        int slow = 2;
        for(int fast = 2; fast< nums.length; fast++){
            if(nums[fast] != nums[slow-2]){
                nums[slow] = nums[fast];
                slow++;
            }
        }
    return slow;
    }
}
