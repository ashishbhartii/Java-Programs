// WAPJP to take an input and check whether it is integer or not.

import java.util.Scanner;
public class Basics05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a Number : ");
        boolean a = s.hasNextInt();
        System.out.println(a);
    }
}
