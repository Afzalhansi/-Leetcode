class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum = 0;
        int leftsum = 0;
        int rightsum = 0;

        for(int i =0; i < nums.length; i++){
            totalsum += nums[i];
        }

        for(int i =0; i < nums.length; i++){

            rightsum = totalsum - leftsum - nums[i];
            
            if(leftsum == rightsum){
                return i;
            }
            leftsum += nums[i];
        }

        return  -1;
    }
}
