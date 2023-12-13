// WAJP to print a greet message.

import java.util.Scanner;
public class Basics02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Whats your name ??");
        String str=s.next();
        System.out.println();
        System.out.println("Hello, " +str+ " Have a great Day !!");
    }
}
