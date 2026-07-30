class Solution {
    public int thirdMax(int[] nums) {
        Integer largest = null;
        Integer secondLargest = null;
        Integer thirdLargest = null;

        for (int curr : nums) {

            // Skip duplicates
            if ((largest != null && curr == largest) ||
                (secondLargest != null && curr == secondLargest) ||
                (thirdLargest != null && curr == thirdLargest)) {
                continue;
            }

            // Update largest
            if (largest == null || curr > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = curr;
            }

            // Update second largest
            else if (secondLargest == null || curr > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = curr;
            }

            // Update third largest
            else if (thirdLargest == null || curr > thirdLargest) {
                thirdLargest = curr;
            }
        }

        // If there is no third distinct maximum,
        // return the largest.
        if (thirdLargest == null) {
            return largest;
        }

        return thirdLargest;
    }
}
