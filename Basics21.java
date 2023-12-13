// WAJP to print the multiplication table of number input by the user .

import java.util.Scanner;
public class Basics21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println("Lets print the Multiplication Table !!");
        System.out.println();
        System.out.print("Enter a Number  ->");
        int num =s.nextInt();
        System.out.println("=====Multiplication Table of " +num+"=====");
        System.out.println();
        for(int i=1;i<=10;i++){
            int tab=num*i;
            System.out.println(num+ " x " +i+ " = " +tab);
        }
        System.out.println();
    }
}
