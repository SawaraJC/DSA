class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int count = 0;
        int diff = 0;

        for(int i=0; i<seats.length; i++){
            diff = seats[i]-students[i];
            if(Math.abs(diff)>0){
                count+=Math.abs(diff);
            }
        }

        return count;
    }
}