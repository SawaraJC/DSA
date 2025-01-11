class Solution {
    public int reverse(int x) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int rev = 0;

        int num = 0;

        if(x < 0){
            num = -1 * x;
        }else{
            num = x;
        }

        while(num > 0){
            int rem = num % 10;
            rev = rev*10 + rem;
            num = num / 10;
        }

        if(x < 0){
            rev = -1*rev;
        }else{
            rev =  rev;
        }

        if (rev > max || rev < min){
            return 0;
        }

        return rev;
        // if(x < 0){
        //     return -1*rev;
        // }else{
        //     return rev;
        // }
    }
}