// WAJP to input 2 numbers and the find the greater one.

import java.util.Scanner;
public class Basics13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please Enter Three Numbers ");
        System.out.println();
        System.out.print("Enter the First Number : ");
        int a1 = s.nextInt();
        System.out.println();
        System.out.print("Enter the First Number : ");
        int a2 = s.nextInt();
        System.out.println();
        System.out.print("Enter the First Number : ");
        int a3 = s.nextInt();
        System.out.println();
        if (a1>a2 && a1>a3){
            System.out.println("The largest Number is " + a1);
        }
        else if (a2>a3 && a2>a1){
            System.out.println("The largest Number is " + a2);
        }
        else{
            System.out.println("The largest Number is " + a3);
        }
        System.out.println();
        if (a1<a2 && a1<a3){
            System.out.println("The Smallest Number is " + a1);
        }
        else if (a2<a3 && a2<a1){
            System.out.println("The Smallest Number is " + a2);
        }
        else{
            System.out.println("The Smallest Number is " + a3);
        }
    }
    
}
