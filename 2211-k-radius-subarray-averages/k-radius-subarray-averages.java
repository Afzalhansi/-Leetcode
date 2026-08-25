import java.util.Arrays;

class Solution {
    public int[] getAverages(int[] nums, int k) {

        int left = 0;
        int right = 0;
        long currsum = 0;

        int[] result = new int[nums.length];
        Arrays.fill(result, -1);

        int windowSize = 2 * k + 1;

        if (windowSize > nums.length) {
            return result;
        }

        while (right < windowSize) {
            currsum += nums[right];
            right++;
        }

        result[k] = (int)(currsum / windowSize);

        while (right < nums.length) {

            currsum = currsum - nums[left] + nums[right];

            left++;
            right++;

            result[right - k - 1] = (int)(currsum / windowSize);
        }

        return result;
    }
}