// WAJP to reverse the number .

import java.util.Scanner;
public class Basics24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println("Lets make the reverse !!");
        System.out.println();
        System.out.print("Enter a Number to be reversed ->");
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
        System.out.println("Orignal Number -> " +temp);
        System.out.println("Reversed Number -> " +rev);
        System.out.println();
    }
}
