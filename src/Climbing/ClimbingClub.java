package Climbing;

import java.util.ArrayList;
import java.util.List;

public class ClimbingClub {
    private List<ClimbInfo> climbList;
    
    public ClimbingClub() {
        climbList = new ArrayList <>();
    }
    
    public String toString() {
        String out = "";
        for(ClimbInfo i: climbList) {
            out += i.toString() + ", ";
        }
        return out;
    }
    
    public void addClimb(String peakName, int climbTime) {
        climbList.add(new ClimbInfo(peakName, climbTime));
    }
    public void addClimbAlphabetical(String peakName, int climbTime) {
        ClimbInfo ci = new ClimbInfo(peakName, climbTime);
        for(int i = 0; i < climbList.size(); i++) {
            if(ci.getName().compareTo(climbList.get(i).getName()) <= 0) {
                climbList.add(i, ci);
                return;
            }
        }
        climbList.add(ci);
    }
    public int distinctPeakNames() {
        if (climbList.isEmpty()) {
            return 0;
        }
        ClimbInfo currInfo = climbList.get(0);
        String prevName = currInfo.getName();
        String currName;
        int numNames = 1;
        for (int k = 1; k < climbList.size(); k++) {
            currInfo = climbList.get(k);
            currName = currInfo.getName();
            if (!prevName.equals(currName)) {
                numNames++;
                prevName = currName;
            }
        }
        return numNames;
    }
    
    
    public static void main(String[] args) {
        ClimbingClub hikerClub = new ClimbingClub();
        hikerClub.addClimb("Monadnock", 274);
        hikerClub.addClimb("Whiteface", 301);
        hikerClub.addClimb("Algonquin", 225);
        hikerClub.addClimb("Monadnock", 344);
        System.out.println(hikerClub.distinctPeakNames());
    }
}
