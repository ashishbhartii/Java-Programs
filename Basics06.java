// WAJP to convert miles into KM and Vice Versa.

import java.util.Scanner;
public class Basics06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Welcome to Distance Conversion :");
        // 1 mile = 1.6 km
        System.out.println();
        System.out.println("Enter your Choice from Below Mentioned Options:");
        System.out.println("1. Mile to Kilometer ");
        System.out.println("2. Kilometer to Mile ");
        System.out.println();
        System.out.print("Enter the Choice Here -->");
        int n=s.nextInt();
        System.out.println();
        if (n==1){
            System.out.print("Enter the Distance in Mile =");
            int b=s.nextInt();
            System.out.println();
            float b1=(float) (b * 1.6);
            System.out.println(b+ " miles = " +b1+ " Km ");
        }
        else if (n==2){
            System.out.print("Enter the Distance in Km =");
            int c=s.nextInt();
            System.out.println();
            float c1=(float) (c / 1.6);
            System.out.println(c+ " Km = " +c1+ " miles ");
        }
        else{
            System.out.println("Sorry Invalid Choice !!");
            System.out.println();
        }
    }
    
}
