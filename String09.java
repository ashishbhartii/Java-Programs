// WAJP to enter a string and trim all the white spaces.


import java.util.Scanner;
public class String09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a String : ");
        String str = s.nextLine();
        System.out.println();
        String ind =str.trim();
        System.out.println("Original String -> " +str);
        System.out.println("Trimmed String -> " +ind);
        System.out.println();
    }
}

