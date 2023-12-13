// WAJP to print a hollow square or rectangel as per the user.

import java.util.Scanner;
public class NestedLoop12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println("<===== HOLLOW PATTERNS =====>");
        System.out.println();
        System.out.println("Choose The Type Of Pattern \n1.Hollow Square \n2.Hollow Rectangle ");
        System.out.println();
        System.out.print("Enter Your Choice -> ");
        int ch = s.nextInt();
        System.out.println();
        if (ch==1){
            System.out.println("<===== HOLLOW SQUARE PATTERN =====>");
            System.out.println();
            System.out.print("Enter the Length of the Side of the Square -> ");
            int side=s.nextInt();
            System.out.println();
            for (int i=1;i<=side;i++){
                for (int j=1;j<=side;j++){
                    if(i==1 || i==side || j==1 || j==side){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                   }
                System.out.println();
            }
            System.out.println();
        }
        else if (ch==2){
            System.out.println("<===== HOLLOW RECTANGLE PATTERN =====>");
            System.out.println();
            System.out.print("Enter the Length of the Side of the Rectangle -> ");
            int length=s.nextInt();
            System.out.print("Enter the Breadth of the Side of the Rectangle -> ");
            int breadth=s.nextInt();
            System.out.println();
            for (int i=1;i<=length;i++){
                for (int j=1;j<=breadth;j++){
                    if (i==1 || i==length || j==1 || j==breadth){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
