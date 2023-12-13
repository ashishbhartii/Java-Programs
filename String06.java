// WAJP to Input a string and perform case Conversion.

import java.util.Scanner;
public class String06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a String : ");
        String str = s.next();
        System.out.println();
        String uc = str.toUpperCase();
        String lc = str.toLowerCase();
        System.out.println("Original String = "+str);
        System.out.println("Upper Cased String = "+uc);
        System.out.println("Lower Cased String = "+lc);
        System.out.println();
    }
}

