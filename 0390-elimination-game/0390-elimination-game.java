class Solution {
    public int lastRemaining(int n) {
    boolean leftToRight = true;
    int remaining = n;
    int step = 1;
    int head = 1;
    
    while (remaining > 1) {
        if (leftToRight || remaining % 2 == 1) {         //This condition checks if we are moving from left to right or if there is an odd number of remaining elements. If either condition is true, we update the head variable
            head += step;
        }
        remaining /= 2;                      
        step *= 2;                          //double the step size after removing every element
        leftToRight = !leftToRight;         //update wheter moving towards left or right
    }
    
    return head;
    }
}