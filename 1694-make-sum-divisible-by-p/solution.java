class Solution {
    public int minSubarray(int[] nums, int p) {

        long prefixsum = 0;
        long totalSum = 0;
        int minLength = nums.length + 1;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, -1);

        for(int i =0; i < nums.length; i++){
            totalSum += nums[i];
        }

        int targetRem =(int)(totalSum % p);
            if(targetRem == 0){
                return 0;
        }

        for(int i =0; i < nums.length; i++){
            prefixsum += nums[i];
            int currentRem =(int)(prefixsum % p);

            int neededRem = (currentRem - targetRem + p) % p;

            if(map.containsKey(neededRem)){
                int length = i - map.get(neededRem);
                minLength = Math.min(minLength, length);
            }
            map.put(currentRem, i);
        } 
        if(minLength == nums.length + 1 || minLength == nums.length){
            return -1;
        }
        return minLength;
    }
}
