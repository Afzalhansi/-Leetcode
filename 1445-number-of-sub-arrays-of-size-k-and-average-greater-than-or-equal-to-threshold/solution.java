class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left = 0;
        int count = 0;
        int currsum = 0;
        int right = 0;

        while(right < k){
                currsum += arr[right];
                right++;
            }
            if(currsum >= k * threshold){
               count++;
            }

        while(right < arr.length){
            currsum = currsum - arr[left] + arr[right];
            left++;
            right++;
            if(currsum >= k * threshold){
               count++;
            }
        }
        return count;
    }
}
