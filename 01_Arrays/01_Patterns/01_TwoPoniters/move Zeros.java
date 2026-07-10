class Solution {
    public void moveZeroes(int[] nums) {
         int j = nums.length-1;
        int k=0;
        int demo[]=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                demo[k]=nums[i];
                k++;
            }else {
                demo[j]=nums[i];
                j--;
            }
        }
        for(int i =0;i<nums.length;i++){
            nums[i]=demo[i];
        }
    }
}
