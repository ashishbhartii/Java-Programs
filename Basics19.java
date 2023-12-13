// WAJP to print first 10 even numbers and odd numbers .

import java.util.Scanner;
public class Basics19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println("Lets print first 10 EVEN & ODD numbers !!");
        System.out.println("You Make a choice \n1.EVEN  \n2.ODD");
        System.out.print("Enter your Choice ->");
        int ch =s.nextInt();
        if (ch==1){
            System.out.println();
            System.out.println("Lets print 1st 10 EVEN numbers");
            System.out.println();
            for(int i=1;i<=10;i++){
                System.out.println(2*i);
                System.out.println();
            }
        }
        else if (ch==2){
            System.out.println();
            System.out.println("Lets print 1st 10 ODD numbers");
            System.out.println();
            for(int i=0;i<10;i++){
                System.out.println((2*i)+1);
                System.out.println();
            }
        }
    }
}
