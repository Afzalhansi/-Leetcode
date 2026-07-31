class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int p1 = 0;
        int p2 = 0;
        int k = 0;
        int[] result =new int[Math.min(nums1.length, nums2.length)];

        while(p1< nums1.length && p2 < nums2.length){
            if(nums1[p1] == nums2[p2]){
               if (k == 0 || result[k - 1] != nums1[p1]) {
                    result[k] = nums1[p1];
                    k++;
                 }
               p1++;
               p2++;
            }
            else if(nums1[p1] < nums2[p2]){
                p1++;
            }else {
                p2++;
            }
        }  
    return Arrays.copyOf(result, k);     
    }
}
