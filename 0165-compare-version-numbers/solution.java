class Solution {
    public int compareVersion(String version1, String version2) {

        int i = 0;
        int j = 0;

        while(i < version1.length() || j < version2.length()){

            int start1 = i;
            int start2 = j;
            while(i < version1.length() && version1.charAt(i) !='.'){
                i++;
            }

            while(j < version2.length() && version2.charAt(j) !='.'){
                j++;
            }

            String part1 = version1.substring(start1, i);
            String part2 = version2.substring(start2, j);

            int num1 = part1.isEmpty() ? 0 : Integer.parseInt(part1);
            int num2 = part2.isEmpty() ? 0 : Integer.parseInt(part2);

            if (num1 > num2) {
                return 1;
            } else if (num1 < num2) {
                return -1;
            } 

            if (i < version1.length()) {
                i++;
            }

            if (j < version2.length()) {
                j++;
            }       
        }
    return 0;
    }
}
