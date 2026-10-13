class Solution {
    public int maximumCandies(int[] candies, long k) {
        
        int left = 1;
        int right = 0;
        for (int candy : candies) {
            right = Math.max(right, candy);
        }

        while(left <= right){
            int mid = left + (right - left)/ 2;
            long children = 0;
            for(int candy : candies){
                children += candy/mid;
            }

            if(children >= k){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return right;
    }
}
