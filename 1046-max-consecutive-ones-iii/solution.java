class Solution {
    public int longestOnes(int[] nums, int k) {

        int left = 0;
        int zerocount = 0;
        int maxlength = 0;


        
        for(int right = 0; right < nums.length; right++){


            if(nums[right] == 0){
                zerocount++;
            }


            while(zerocount > k){
                if(nums[left] == 0){
                    zerocount--;
                }
                left++;
            }
            maxlength = Math.max(maxlength, right - left + 1);
        }
        return maxlength;
    }
}
