class Solution {
    public int characterReplacement(String s, int k) {
        int left =0;
        int maxlength = 0;
        int maxFreq=0;
         int[] freq = new int[26];

        for(int i=0;i<s.length();i++){
           
            char ch = s.charAt(i);
            freq[ch-'A']++;
            maxFreq= Math.max(freq[ch-'A'],maxFreq);

            while((i-left+1)-maxFreq>k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            maxlength = Math.max(maxlength, i - left + 1);
        }
        return maxlength;
        
    }
}
