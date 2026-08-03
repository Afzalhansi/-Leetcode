class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left = 0;
        int count = 0;
        int currsum = 0;

        for(int right = 0; right < arr.length; right++){

            currsum += arr[right];

            if(right - left + 1 == k){

                if(currsum >= threshold * k){
                    count++;
                }
                currsum -= arr[left];
                left++;
            }
        }
        return count;
        
    }
}
