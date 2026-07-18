class Solution {
    public int pivotIndex(int[] nums) {
        int totalsum = 0;
        int leftsum = 0;
        int rightsum = 0;

        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            totalsum = totalsum + curr;
        }

        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            rightsum =totalsum - leftsum - curr;

            if(leftsum == rightsum){
                return i;
            }
            leftsum = leftsum + curr;
        }

        return -1;
    }
}
