class Solution {
    public int countSeniors(String[] details) {
        int ages = 0;

        for(String det: details){
            int char11 = det.charAt(11) - '0';
            int char12 = det.charAt(12) - '0';

            int age = char11*10 + char12;

            if(age > 60){
                ages++;
            }
        }

        return ages;
    }
}