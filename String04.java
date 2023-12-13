// WAJP to Input a string and find the frequency of a particular character in it .

import java.util.Scanner;
public class String04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a String : ");
        String str = s.next();
        System.out.println();
        System.out.print("Enter a character whose frequency is to be Found : ");
        char a = s.next().charAt(0);
        System.out.println();
        int l =str.length();
        int c=0;
        for (int i=0;i<l;i++){
            char n = str.charAt(i);
            if (n==a){
                c = c + 1;
            }
        }
        System.out.println("The Frequency of " +a+ " in String " +str+ " = " +c);
        System.out.println();
    }
}

