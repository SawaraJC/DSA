class Solution {
    public boolean isPalindrome(int x) {
        int rem = 0;
        int reverse = 0;
        int num = x;

        if(x < 0)
            return false;

        while(num != 0){
            rem = num%10;
            reverse = reverse*10 + rem;
            num = num/10;
        }

        return x == reverse;
    }
}