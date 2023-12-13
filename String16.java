// WAJP to enter a string sentence and check for accidental double or tripple spaces in it.

import java.util.Scanner;
public class String16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println("To Check for double or tripple spaces in a String sentence !");
        System.out.println();
        System.out.print("Enter a String sentence: ");
        String str = s.nextLine();
        System.out.println();
        int ds=str.indexOf("  ");
        int ts=str.indexOf("   ");
        if (ds==-1 && ts==-1){
            System.out.println();
            System.out.println("Doubel Space = No    Tripple Space = No");
            System.out.println();
            System.out.println("<----STRING---->");
            System.out.println(str);
            System.out.println();
        }
        else if (ds>=0 && ts==-1){
            System.out.println();
            System.out.println("Doubel Space = Yes    Tripple Space = No");
            System.out.println();
            System.out.println("<----STRING---->");
            System.out.println(str);
            System.out.println();
            System.out.println("Double space starts at index " +ds);
            System.out.println();
        }
        else if (ds==-1 && ts>=0){
            System.out.println();
            System.out.println("Doubel Space = No    Tripple Space = Yes");
            System.out.println();
            System.out.println("<----STRING---->");
            System.out.println(str);
            System.out.println();
            System.out.println("Tripple space starts at index " +ts);
            System.out.println();
        }
        else if (ds>=0 && ts>=0){
            System.out.println();
            System.out.println("Doubel Space = Yes    Tripple Space = Yes");
            System.out.println();
            System.out.println("<----STRING---->");
            System.out.println(str);
            System.out.println();
            System.out.println("Double space starts at index " +ds);
            System.out.println("Tripple space starts at index " +ts);
            System.out.println();
        }
        else{
            System.out.println();
            System.out.println("Sorry !! Invalid Choice !!");
            System.out.println();
        }
    }
}

