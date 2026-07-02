class Solution {
    public boolean isPalindrome(String s) {
       String rev="";
       String str="";
       for (int i=s.length()-1;i>=0;i--){
        
        if(Character.isLetterOrDigit(s.charAt(i))){
            str+=Character.toLowerCase(s.charAt(i));
        }
       }
       for (int i=str.length()-1;i>=0;i--){
         rev = rev + "" + str.charAt(i);
       }
       return rev.equals(str);
    }
}