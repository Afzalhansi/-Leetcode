class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;

        for (int day : bloomDay) {
            left = Math.min(left, day);
            right = Math.max(right, day);
        }
        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        while(left <= right){
            int mid = left + (right - left)/2;
            int bouquets = 0;
            int cons = 0;

            for (int day : bloomDay) {
                if (day <= mid) {
                    cons++;

                    if (cons == k) {
                        bouquets++;
                        cons = 0;
                    }

                } else {
                    cons = 0;
                }
            }
            if (bouquets >= m) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
       return left; 
    }
}
