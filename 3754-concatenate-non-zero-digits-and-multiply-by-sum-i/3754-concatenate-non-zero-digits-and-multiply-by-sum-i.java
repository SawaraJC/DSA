class Solution {
    public long sumAndMultiply(int n) {
        long res = 0;
        long sum = 0;
        int place = 1;

        if(n==0){
            return 0;
        }

        while (n>0){
            int rem = n%10;
            if(rem > 0){
                sum += rem;
                res = rem * place + res;
                place *= 10;
            }
            n = n/10;
        }

        res = sum * res;

        return res;
    }
}