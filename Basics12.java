// WAJP to evaluate the following Expression [ (v^2 - u^2) / 2as ]


import java.util.Scanner;
public class Basics12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" lets Evaluate the Expression [ (v^2 - u^2) / 2as ] ");
        System.out.println("v = Final Velocity");
        System.out.println("u = initial Velocity");
        System.out.println("a = Constant Speed ");
        System.out.println("s = Displacement ");
        System.out.println();
        System.out.print("Enter the Final Velocity (v) in m/s = ");
        int v = sc.nextInt();
        System.out.println();
        System.out.print("Enter the Initial Velocity (u) in m/s = ");
        int u = sc.nextInt();
        System.out.println();
        System.out.print("Enter the Constant Speed (a) in m/s = ");
        int a = sc.nextInt();
        System.out.println();
        System.out.print("Enter the Displacement (s) in m = ");
        int s = sc.nextInt();
        System.out.println();
        float exp = (v^2 - u^2) / 2*a*s;
        System.out.println("The result of Third Equation of motion [ (v^2 - u^2) / 2as ] is = " +exp); 
    }
    
}
