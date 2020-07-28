package pkg1;

import java.util.Enumeration;
import java.util.Vector;

public class enumex {
    public static void main(String[] args) {
        String[] num = {"one", "two", "three", "four", "five",
                "six", "seven", "eight", "nine", "ten"};
        Vector aVector = new Vector(java.util.Arrays.asList(num));
        System.out.println("Before Vector: " + aVector);
        Enumeration nums = aVector.elements();
        int elementno = 1;
        System.out.println("Element NO. Element");
        while(nums.hasMoreElements())
        {
            String aString = (String)nums.nextElement();
            System.out.println(elementno+" "+aString);
            if(aString.length() > 4) {
                aVector.remove(aString); // during this statement element no and element will be changed
                //nums = aVector.elements();
            }
            elementno++;
        }
        System.out.println("After Vector: " + aVector);
    }
}
