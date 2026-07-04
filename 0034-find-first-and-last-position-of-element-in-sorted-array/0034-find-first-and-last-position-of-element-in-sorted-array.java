class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result= new int[2];
        result[0]=occurance(nums,target,true);
        result[1]=occurance(nums,target,false);
    return result;
    }
    public int occurance(int[] nums,int target,boolean first){
        int index=-1;
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(target==nums[mid]){
                index=mid;
                if(first){
                    right=mid-1;
                }else{
                    left=mid+1;
                }  
            }else if(target<nums[mid]){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return index;
    }
}