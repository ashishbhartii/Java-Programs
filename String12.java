// WAJP to enter a string and check if they ends with a particular character or not..


import java.util.Scanner;
public class String12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a String : ");
        String str = s.next();
        System.out.println();
        System.out.print("Enter a character to be checked if it ends : ");
        String a = s.next();
        System.out.println();
        boolean ind =str.endsWith(a);
        if (ind == true){
            System.out.println("Yes " +str+ "ends with " +a);
        }
        else{
            System.out.println("No " +str+ "does not ends with " +a);
        }
        System.out.println();
    }
}

