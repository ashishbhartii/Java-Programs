// WAJP to enter a Year and check ehether its a Leap Year or Not.

import java.util.Scanner;
public class Basics18 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter an Year !!");
        int n=sc.nextInt();
        if(n%4==0){
            System.out.println();
            System.out.println(n+ " is an LEAP Year !!");
            System.out.println();
        }
        else{
            System.out.println();
            System.out.println(n+ " is NOT a LEAP Year !!");
            System.out.println();
        }
        System.out.println(n);
    }
    
}
