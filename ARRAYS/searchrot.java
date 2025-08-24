class searchrot {
    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int min=Integer.MAX_VALUE;
        int in=0;
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
                in=i;

            }
        }
        
        Arrays.sort(nums);
        while(s<=e){
            int m=(s+e)/2;
            if(nums[m]==target){
                return (m+in)%nums.length;
            }
            if(nums[m]>target){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return -1;

        
    }
}
