class Solution {
    public int findNumbers(int[] nums) {
        int evencount = 0;
    
        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            
            int digitcount = 0;
            while(curr > 0){
                curr = curr / 10;
                digitcount++;
            }
            if(digitcount % 2 == 0){
                evencount++;
            }
        }
        return evencount;
    }
}
