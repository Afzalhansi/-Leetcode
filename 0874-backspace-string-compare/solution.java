class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        int i = s.length() - 1;
        int j = t.length() - 1;

        int skips = 0;
        int skipt = 0;

        while(i >= 0 || j >= 0) {

            while(i >= 0) {

                if(s.charAt(i) == '#') {
                    skips++;
                    i--;
                }
                else if(skips > 0) {
                    skips--;
                    i--;
                }
                else {
                    break;
                }
            }

            while(j >= 0) {

                if(t.charAt(j) == '#') {
                    skipt++;
                    j--;
                }
                else if(skipt > 0) {
                    skipt--;
                    j--;
                }
                else {
                    break;
                }
            }

            if(i >= 0 && j >= 0) {

                if(s.charAt(i) != t.charAt(j)) {
                    return false;
                }

                i--;
                j--;
            }
            else if(i >= 0 || j >= 0) {
                return false;
            }
        }

        return true;
    }
}
