class Solution {
    public int maxVowels(String s, int k) {

        int left = 0;
        int right = 0;
        int currvowels = 0;
        int maxvowels = 0;

        while(right < k){

            if(s.charAt(right) =='a'||
            s.charAt(right) =='e'||
            s.charAt(right) =='i'||
            s.charAt(right) =='o'||
            s.charAt(right) =='u'
            ){
                currvowels++;
            }
            right++;
        }
        maxvowels = Math.max(maxvowels, currvowels);


        while(right < s.length()){
            if(s.charAt(left) =='a'||
            s.charAt(left) =='e'||
            s.charAt(left) =='i'||
            s.charAt(left) =='o'||
            s.charAt(left) =='u'){
                currvowels--;
            }

            if(s.charAt(right) =='a'||
            s.charAt(right) =='e'||
            s.charAt(right) =='i'||
            s.charAt(right) =='o'||
            s.charAt(right) =='u'
            ){
                currvowels++;
            }
            left++;
            right++;

            maxvowels = Math.max(maxvowels, currvowels);
        }
        return maxvowels;
    }
}
