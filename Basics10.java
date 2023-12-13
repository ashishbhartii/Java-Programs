// WAJP to enter two numbers and find the greater among them.

import java.util.Scanner;
public class Basics10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the first Number :");
        int a=s.nextInt();
        System.out.println();
        System.out.print("Enter the Second Number :");
        int b=s.nextInt();
        System.out.println();
        if (a>b){
            System.out.println("a > b or " + a + " > " +b);
        }
        else if (b>a){
            System.out.println("a < b or " + a + " < " +b);
        }
        else if (a==b){
            System.out.println("a = b or " + a + " = " +b);
        }
    }
    
}
