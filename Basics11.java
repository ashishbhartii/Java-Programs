// WAJP to enter a grade and then encrypt it and decrypyt it as per the user

import java.util.Scanner;
public class Basics11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the Grade [A,B,C..] -->");
        char a= s.next().charAt(0);
        System.out.println();
        System.out.print("Enter the Encryption key -->");
        int key=s.nextInt();
        System.out.println();
        char grade=(char)(a + key);
        System.out.println("Original Grade = " +a);
        System.out.println("Encrypted Grade = " +grade);

    }
}



