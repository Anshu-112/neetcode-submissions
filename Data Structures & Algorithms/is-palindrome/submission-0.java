class Solution {
    public boolean isPalindrome(String s) {
       
      String[] arr = s.toLowerCase().split("[^a-z0-9]+");
      String t = "";
      for(int i=0;i<arr.length;i++){
        t += arr[i];
      }
      int i=0;
        int j= t.length()-1;
        while(i<j){
            if(t.charAt(i)!=t.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
      return true;

        
    }
}
