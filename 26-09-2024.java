//Approach-1 : Brute Force 
//T.C : O(n^2)
//S.C : O(n)
class MyCalendar {

    // List to store the booked intervals
    List<int[]> calendar;

    public MyCalendar() {
        // Initialize the list
        calendar = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        // Check for overlap with every existing booking
        for (int[] curr : calendar) {
            // If there is overlap, return false
            if (!(end <= curr[0] || start >= curr[1])) {
                return false;
            }
        }

        // If no overlap, add the booking to the calendar
        calendar.add(new int[]{start, end});
        return true;
    }
}
