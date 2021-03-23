

/**
 * @Description: Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * @Author: CHEN SIZHE
 * @Date:2021/3/23 22:10
 */
class Solution {
    public int singleNumber(int[] nums) {
        int res =0;
        for(int i: nums){
            res^=i;
        }
        return res;
    }
}
