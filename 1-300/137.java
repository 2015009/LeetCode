/**
 * @Description: Given an integer array nums where every element appears three times except for one, which appears exactly once. Find the single element and return it.
 * @Author: CHEN SIZHE
 * @Date:2021/3/23 22:13
 */
class Solution {
    public int singleNumber(int[] nums) {
        int seen_once =0;
        int seen_twice=0;

        for (int i:nums){
            seen_once = ~seen_twice&(seen_once^i);
            seen_twice= ~seen_once&(seen_twice^i);
        }

        return seen_once;
    }
}
