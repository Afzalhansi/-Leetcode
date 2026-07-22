class Solution {
    public int largestAltitude(int[] gain) {

        int sum = 0;
        int max = 0;

        for(int i = 0; i < gain.length; i++){
            int curr = gain[i];
            sum = sum + curr;

            if(sum > max){
            max = sum;
        }
        }
        return max;
    }
}