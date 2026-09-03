class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=0;
        for(j=0;j<n;j++){
            if(nums[j]!=0){
                nums[i]=nums[j];
                i++;
           }

            }
            for(int l=i;l<n;l++){
               nums[l]=0;
            }
        }
    }