// WAJP to print the first n fibonacci series .

import java.util.Scanner;
public class Basics25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println("Lets print FIBONACCI series !!");
        System.out.println();
        System.out.print("Enter a range -> ");
        int n =s.nextInt();
        System.out.print("<----- FIBONACCI ----->");
        System.out.println();
        int a=0;
        int b=1;
        int c=0;
        System.out.print(a+ " ");
        System.out.print(b+ " ");
        for (int i=1;i<(n-1);i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+ " ");
        }
        System.out.println();
        System.out.println();
    }
}
