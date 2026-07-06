class Solution {
    public String largestNumber(int[] nums) {
        String[] word= new String[nums.length];
        for( int i = 0; i<nums.length;i++){
            word[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(word,(a,b)->(b+a).compareTo(a+b));
    StringBuilder ans= new StringBuilder();
    for(String w:word){
        ans.append(w);
    }
    if (word[0].equals("0")) {
    return "0";
}
return ans.toString();
    }
}