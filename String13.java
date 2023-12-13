// WAJP to enter a string and return the character at a particular index.

import java.util.Scanner;
public class String13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a String : ");
        String str = s.next();
        System.out.println();
        System.out.print("Enter an index whose character is to be returned : ");
        int a = s.nextInt();
        System.out.println();
        char p =str.charAt(a);
        System.out.println("The character at index " +a+ "in " +str+ " = " +p);
        System.out.println();
    }
}

