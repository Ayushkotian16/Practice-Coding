class Solution {
    public int trap(int[] height) {
        int left=0;
        int right=height.length-1;
        int leftmax=height[left];
        int rightmax=height[right];
        int water=0;
        while(left<right){
            if(height[left]<height[right]){
                leftmax=Math.max(leftmax,height[left]);
                if(leftmax-height[left]>0){
                    water+=leftmax-height[left];
                }
                left++;
            }else{
                rightmax=Math.max(rightmax,height[right]);
                if(rightmax-height[right]>0){
                    water+=rightmax-height[right];
                }
                right--;
            }
        }
        return water;
    }
}