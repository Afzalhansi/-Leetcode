class Solution {
    public int removeDuplicates(int[] nums) {
        int fast = 1;
        int slow = 0;

        for(int i = 1; i <= nums.length - 1; i++){

            if(nums[fast] != nums[fast - 1]){
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        } 
        return slow + 1;  
    }
}
