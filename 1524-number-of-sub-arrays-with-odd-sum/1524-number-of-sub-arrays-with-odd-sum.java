class Solution {
    public int numOfSubarrays(int[] arr) {
        final int MOD = 1000000007;
        int odd = 0 , even = 1;
        long ans = 0;
        long parity = 0;

        for(int x : arr){
            parity = (parity + x) % 2;
            if(parity == 1) {
                ans = (ans + even) % MOD;
                odd++;
            } else {
                ans = (ans + odd) % MOD;
                even++; 
            }
        }
        return (int) ans;
    }
}