class Solution {
    public boolean canArrange(int[] arr, int k) {
         int[] mod = new int[k];
        for (int num : arr) {
            ++mod[(num % k + k) % k];
        }
        for (int i = 1; i + i < k; ++i) {
            if (mod[i] != mod[k - i]) {
                return false;
            }
            if(i*2==k){
                if(mod[i]%2!=0){
                    return false;
                }
            }
        }
        return mod[0] % 2 == 0;
        }
    }
