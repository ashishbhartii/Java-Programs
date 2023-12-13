// WAJP to Input a string sentence and replace a character with a particular character input from the user .

import java.util.Scanner;
public class String07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a String sentence: ");
        String str = s.nextLine();
        System.out.println();
        System.out.print("Enter a character to be replaced from the above string : ");
        char a = s.next().charAt(0);
        System.out.println();
        System.out.print("Enter a character to be replaced WITH from the above string : ");
        char b = s.next().charAt(0);
        System.out.println();
        String nstr =str.replace(a,b);
        System.out.println("Original String ->" +str);
        System.out.println("Relaced String ->" +nstr);
        System.out.println();
    }
}

