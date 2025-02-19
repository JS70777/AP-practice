package Climbing;

public class ClimbInfo {
    private String name;
    private int time;
    
    public ClimbInfo(String peakName, int climbTime) {
        name = peakName;
        time = climbTime;
    }
    
    public String getName() {
        return name;
    }
    public int getTime() {
        return time;
    }
    public String toString() {
        return name + ": " + time + " mins";
    }
}
