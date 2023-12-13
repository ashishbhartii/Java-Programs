// WAJP to find all the factors of a given number .

import java.util.Scanner;
public class Basics26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println("Lets find teh factors !!");
        System.out.println();
        System.out.print("Enter a Number  ->");
        int num=s.nextInt();
        System.out.println();
        System.out.print("factors of " +num+ "-> " );
        for (int i=1;i<=num;i++){
            if (num%i==0){
                System.out.print(i+ ", ");
            }
        }
        System.out.println();
        System.out.println();
    }
}
