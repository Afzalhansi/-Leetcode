class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int current = 0;
        int maximum = 0;

        for(int i =0; i < nums.length; i++){
            int curr = nums[i];
            if(curr == 1){
                current++;
            }
            else
            {
                current = 0;
            }

            if(current > maximum){
                maximum = current;
            }
        }
        return maximum;
        
    }
}
