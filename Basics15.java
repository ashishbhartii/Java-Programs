// WAJP to perform temperature conversion.

import java.util.Scanner;
public class Basics15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println("   Temperature Conversion   ");
        System.out.println();
        System.out.println("Choose the Type of Conversion from Below :");
        System.out.println("1. Farenheit To Celcius ");
        System.out.println("2. Celcius to Farenheit ");
        System.out.println();
        System.out.print("Enter the Choice -> ");
        int n = s.nextInt();
        System.out.println();
        if (n==1){
            System.out.println("Farenheit To Celcius");
            System.out.print("Enter the temperature in Farenheit : ");
            float f = s.nextInt();
            System.out.println();
            float c = ((f-32)*5)/9;
            float k = c + 273;
            System.out.println(f + " degree F = " + c + " degree C");
            System.out.println(f + " degree F = " + k + " degree Kelvin");
            System.out.println();
        }
        else if (n==2){
            System.out.println("Celcius To Farenheit");
            System.out.print("Enter the temperature in Celcius : ");
            float c = s.nextInt();
            System.out.println();
            float f = ((c*9)/5)+329;
            float k = c + 273;
            System.out.println(c + " degree C = " + f + " degree F");
            System.out.println(c + " degree C = " + k + " degree Kelvin");
            System.out.println();
        }
        else{
            System.out.println("Sorry Invalid Choice !!");
            System.out.println();
        }
    }
}
