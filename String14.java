// WAJP to enter a string and find out the index of a particular character.


import java.util.Scanner;
public class String14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a String : ");
        String str = s.next();
        System.out.println();
        System.out.print("Enter a character Whose index is to be determined : ");
        char a = s.next().charAt(0);
        System.out.println();
        int ind =str.indexOf(a);
        System.out.println("The index of " +a+ "in " +str+ " = " +ind);
        System.out.println();
    }
}

