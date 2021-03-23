
/**
 * @Description: Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.
 * @Author: CHEN SIZHE
 * @Date:2021/3/23 22:15
 */
class Solution {
    public int[] singleNumber(int[] nums) {
        int res = 0;
        for(int n: nums){
            res^=n;
        }

        int det=1;
        while((res&det)==0){
            det<<=1;
        }

        int a=0;
        int b=0;
        for(int n: nums){
            if((n&det)==0){
                a^=n;
            }else{
                b^=n;
            }
        }
        return new int[]{a,b};

    }
}
