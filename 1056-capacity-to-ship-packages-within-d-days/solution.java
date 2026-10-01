class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int left = 0;
        int right = 0;

        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }
        
        while(left <=right){
            int mid = left + (right - left) /2;
            int dayUsed = 1;
            int currentLoad = 0;

            for(int weight : weights){
                if(currentLoad + weight > mid){
                    dayUsed++;
                    currentLoad = weight;
                }else{
                    currentLoad += weight;
                }
            }

            if(dayUsed <= days){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
    return left;
    }
}
