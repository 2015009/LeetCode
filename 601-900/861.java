class Solution {
    public int minPartitions(String n) {
       int res = 0;
       for(int i = 0;i<n.length();i++){
           res = Math.max(res,Integer.valueOf(n.charAt(i)));
       }
       return res-48;
    }
}
