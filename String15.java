// WAJP to and replace a particular whiteSpaces with a user input underscores..

import java.util.Scanner;
public class String15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a String sentence: ");
        String str = s.nextLine();
        System.out.println();
        String nstr =str.replace(' ', '_');
        System.out.println("<----Original String---->");
        System.out.println(str);
        System.out.println("<----Relaced String---->");
        System.out.println(nstr);
        System.out.println();
    }
}

