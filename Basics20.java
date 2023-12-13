// WAJP to print even numbers and odd numbers within a range input from the user.

import java.util.Scanner;
public class Basics20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println("Lets print first 10 EVEN & ODD numbers !!");
        System.out.println("You Make a choice \n1.EVEN  \n2.ODD");
        System.out.print("Enter your Choice ->");
        int ch =s.nextInt();
        if (ch==1){
            System.out.println();
            System.out.println("Lets print EVEN numbers within the range !");
            System.out.println();
            System.out.print("Enter the initial range ->");
            int in=s.nextInt();
            System.out.print("Enter the final range ->");
            int fn=s.nextInt();
            System.out.println();
            for(int i=in;i<=fn;i++){
                if(i%2==0){
                    System.out.println(i);
                }
            }
        }
        else if (ch==2){
            System.out.println();
            System.out.println("Lets print ODD numbers within the range !");
            System.out.print("Enter the initial range ->");
            int in=s.nextInt();
            System.out.print("Enter the final range ->");
            int fn=s.nextInt();
            System.out.println();
            for(int i=in;i<=fn;i++){
                if(i%2!=0){
                System.out.println(i);
            }
            }
        }
    }
}
