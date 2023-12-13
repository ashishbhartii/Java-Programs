// WAJP to check if its is palindrome or not .

import java.util.Scanner;
public class Basics23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println("Lets Check for Palindrome !!");
        System.out.println();
        System.out.print("Enter a Number to be checked ->");
        int num =s.nextInt();
        int temp=num;
        int r=0;
        System.out.println();
        int rev=0;
        while(num>0){
            r=num%10;
            rev=(rev*10)+r;
            num=num/10;
        }
        if(rev==temp){
            System.out.println(temp+ " is a PALINDROME number !!");
        }
        else{
            System.out.println(temp+ " is a Not a PALINDROME number !!");
        }
        System.out.println();
    }
}
