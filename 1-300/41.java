class Solution {
    public int firstMissingPositive(int[] nums) {
        // find the element between 1 and n(n is the length of nums) and make sure it on the (i-1) location
        int n = nums.length;
        for(int i=0; i<n; i++){

            // 'while' can guarantee that each at index i don't need for consideration.  
            while(nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]){
                swap(nums,i,nums[i]-1);
            }
        }

        for(int i=0; i<n; i++){
            if(nums[i]!=i+1) return i+1;
        }
        
        return n+1;
    }
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;        
    }
}
