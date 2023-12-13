// WAJP to input two strings and check for their equality (case sensitivity shall be considered)


import java.util.Scanner;
public class String08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a Primary String : ");
        String str = s.nextLine();
        System.out.println();
        System.out.println("Do You want to consider Case Sentivity ??");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println();
        System.out.print("Enter a Choice -> ");
        int a= s.nextInt();
        if (a==1){
            System.out.print("Enter the temp String to be checked (Case Sensitive) -> ");
            String str1 =s.next();
            if (str.equals(str1)){
                System.out.println();
                System.out.println("Yes, " +str+ " equals " +str1+ " Considering Case Sensitivity ");
                System.out.println();
            }
            else{
                System.out.println();
                System.out.println("No, " +str+ " does Not equals " +str1+ " Considering Case Sensitivity ");
                System.out.println();
            }
        }
        else if (a==2){
            System.out.print("Enter the temp String to be checked (Non Case Sensitive) -> ");
            String str1 =s.next();
            if (str.equalsIgnoreCase(str1)){
                System.out.println();
                System.out.println("Yes, " +str+ " equals " +str1+ " Not Considering Case Sensitivity ");
                System.out.println();
            }
            else{
                System.out.println();
                System.out.println("No, " +str+ " does Not equals " +str1+ " Without Considering Case Sensitivity ");
                System.out.println();
            }
        }
        
    }
}

