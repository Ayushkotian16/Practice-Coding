class Solution {
    public String longestPalindrome(String s) {
       String ans="";
        String even="";
        String odd="";
        int j=0;
        int maxx=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            odd=palindrome(s,i,i);
             if(maxx<odd.length()){
            maxx=Math.max(maxx,odd.length());
            ans=odd;
            }
            even=palindrome(s,i,i+1);
            if(maxx<even.length()){
            maxx=Math.max(maxx,even.length());
            ans=even;
            }
        }
        return ans;
    }
    public String palindrome(String s, int left,int right){
        int maxx=0;
        int length=0;
        String str="";
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            length=right-left+1;
            if(length>maxx){
            maxx=Math.max(maxx,length);
            str=s.substring(left,right+1);
            }
            left--;
            right++;
        }
        return str;
    }
}