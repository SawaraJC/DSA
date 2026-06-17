import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> st = new Stack<>();

        for (String item : operations) {

            if (item.equals("C")) {
                st.pop();
            }
            else if (item.equals("D")) {
                st.push(st.peek() * 2);
            }
            else if (item.equals("+")) {
                int sum = st.get(st.size() - 1)
                        + st.get(st.size() - 2);

                st.push(sum);
            }
            else {
                st.push(Integer.parseInt(item));
            }
        }

        int res = 0;

        for (int score : st) {
            res += score;
        }

        return res;
    }
}