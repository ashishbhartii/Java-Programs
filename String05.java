// WAJP to Input a string and find its length .

import java.util.Scanner;
public class String05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a String : ");
        String str = s.next();
        System.out.println();
        int l = str.length();
        System.out.println("The Length of Characters in "+str+ " = " +l);
        System.out.println();
    }
}

