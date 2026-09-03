class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0; i < nums.length; i++){
            int current = nums[i];
            map.put(current, map.getOrDefault(current, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
           int number = entry.getKey();
           int freq = entry.getValue();

            if(freq > nums.length/2){
                return number;
            }
        }
        return -1;
    }
}
