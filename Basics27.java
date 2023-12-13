// WAJP to find all the factorial of a given number .

import java.util.Scanner;
public class Basics27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println("Lets find the factorial !!");
        System.out.println();
        System.out.print("Enter a Number  ->");
        int num=s.nextInt();
        System.out.println();
        System.out.println("<-------factorial of " +num+ " -------> " );
        System.out.println();
        int fac=1;
        System.out.print(num+ " = ");
        for (int i=1;i<=num;i++){
            fac=fac*i;
            System.out.print(i+ " x " );
        }
        System.out.print(" = " +fac);
        System.out.println();
        System.out.println();
    }
}
