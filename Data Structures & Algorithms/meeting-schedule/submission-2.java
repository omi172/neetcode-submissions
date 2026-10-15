/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals == null || intervals.size() == 0){
            return true;
        }
        Collections.sort(intervals,(a,b) -> a.start - b.start);
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;
        for(int i = 1; i < intervals.size(); i++){
            if(end > intervals.get(i).start){
                return false;
            }
            end = Math.max(intervals.get(i).end,end);
            start = Math.max(intervals.get(i).start,start);
        }
        return true;
    }
}
