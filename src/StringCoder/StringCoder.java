package StringCoder;

import java.util.ArrayList;
import java.util.Scanner;

public class StringCoder {
    private String masterString;
    
    public StringCoder(String master) {
        masterString = master;
    }
    
    public String decodeString(ArrayList<StringPart> parts) {
        String out = "";
        for(StringPart part: parts) {
            out += masterString.substring(part.getStart(), part.getStart() + part.getLength());
        }
        return out;
    }
    private StringPart findPart(String str) {
        int bestI = 0;
        int bestLength = 0;
        int strI = 0;
        for(int i = 0; i < masterString.length(); i++) {
            if(strI < str.length() && masterString.charAt(i) == str.charAt(strI)) {
                if(strI + 1> bestLength) {
                    bestI = i;
                }
                bestLength = Math.max(++strI, bestLength);
            } else {
                strI = 0;
            }
//            System.out.println("i: " + i + ", bestI: " + bestI + ", bestLength: " + bestLength + ", strI: " + strI);
        }
        return new StringPart(bestI - bestLength + 1, bestLength);
    }
    public ArrayList<StringPart> encodeString(String word) {
        ArrayList<StringPart> strs = new ArrayList <>();
        String leftover = word;
        while(!leftover.isEmpty()) {
            StringPart sp = findPart(leftover);
            strs.add(sp);
            leftover = leftover.substring(sp.getLength());
        }
        return strs;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringCoder sc = new StringCoder(scan.nextLine());
        ArrayList<StringPart> strs = sc.encodeString(scan.nextLine());
        System.out.println(sc.decodeString(strs));
    }
}
