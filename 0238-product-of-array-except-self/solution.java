class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] ans = new int[nums.length];
        int previous = 1;

        for(int i = 0 ; i < nums.length; i++){
            ans[i] = previous;
            previous = previous * nums[i];
        }
        int next = 1;
        for(int i =nums.length - 1; i >= 0; i--){
            ans[i] = ans[i] * next;
            next = next * nums[i];
        }

        return ans;
    }
}
