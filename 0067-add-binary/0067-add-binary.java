class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder(); // To store the final result.
        int carry = 0; // Initialize carry to 0.
        int a1 = a.length() - 1; // Index pointer for string a.
        int b1 = b.length() - 1; // Index pointer for string b.

        // Traverse both strings from the end to the start.
        while (a1 >= 0 || b1 >= 0) {
            int sum = carry; // Start with the carry from the previous step.

            // Add the current bit of a if available.
            if (a1 >= 0) {
                sum += a.charAt(a1) - '0'; // Convert char to int and add to sum.
                a1--; // Move to the next bit.
            }

            // Add the current bit of b if available.
            if (b1 >= 0) {
                sum += b.charAt(b1) - '0'; // Convert char to int and add to sum.
                b1--; // Move to the next bit.
            }

            // Append the current bit (sum % 2) to the result.
            result.append(sum % 2);

            // Update carry for the next step (sum / 2).
            carry = sum / 2;
        }

        // If there's a carry left after the loop, append it.
        if (carry != 0) {
            result.append(carry);
        }

        // Reverse the result as we've constructed it in reverse order.
        return result.reverse().toString();
    }
}
