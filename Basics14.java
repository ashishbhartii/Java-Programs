// WAJP to design a calculator by taking two number as an input.

import java.util.Scanner;
public class Basics14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println("Welcome to the Basic Calculator ");
        System.out.println();
        System.out.println("Lets take Two number as input and then perform operations :");
        System.out.print("Enter the first Number :");
        int n1 = s.nextInt();
        System.out.println();
        System.out.print("Enter the second Number :");
        int n2 = s.nextInt();
        System.out.println();
        System.out.println("Choose from the List of Operations You want to perform :");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Remainder");
        System.out.println();
        System.out.print("Enter Your choice from above : ");
        int ch = s.nextInt();
        System.out.println();
        if (ch == 1){
            System.out.println("Addition it is !!");
            System.out.print(n1+ "+" +n2+ " = ");
            System.out.println(n1+n2);
            System.out.println();
        }
        else if (ch == 2){
            System.out.println("Substraction it is !!");
            System.out.print(n1+ "-" +n2+ " = ");
            System.out.println(n1-n2);
            System.out.println();
        }
        else if (ch == 3){
            System.out.println("Multiplication it is !!");
            System.out.print(n1+ "*" +n2+ " = ");
            System.out.println(n1*n2);
            System.out.println();
        }
        else if (ch == 4){
            System.out.println("Division it is !!");
            if (n1>n2){
                System.out.print(n1+ "/" +n2+ " = ");
                System.out.println(n1/n2);
                System.out.println();
            }
            else{
                System.out.print(n2+ "/" +n1+ " = ");
                System.out.println(n2/n1);
                System.out.println();
            }
        }
        else if (ch == 5){
            System.out.println("Remainder it is !!");
            if (n1>n2){
                System.out.print(n1+ "%" +n2+ " = ");
                System.out.println(n1%n2);
                System.out.println();
            }
            else{
                System.out.print(n2+ "%" +n1+ " = ");
                System.out.println(n2%n1);
                System.out.println();
            }
        }
        else{
            System.out.println("Sorry Invalid Choice !!");
            System.out.println();
        }
    }
}
