// WAJP to enter a string and trim it as per the user utilize concept of substring.


import java.util.Scanner;
public class String10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a String to be trimmed : ");
        String str = s.nextLine();
        System.out.println();
        System.out.println("How do you want to trim it ?");
        System.out.println("1. Only from initial Index ");
        System.out.println("2. Initial and Final Index both ");
        System.out.println();
        System.out.print("Enter a Choice -> ");
        int a= s.nextInt();
        if (a==1){
            System.out.println("So its Only Initial Index !! Perfect !!");
            System.out.println();
            System.out.print("Enter the Intial Index of to begin the Trimming -> ");
            int i1 =s.nextInt();
            System.out.println();
            String str1 = str.substring(i1);
            System.out.println("<----Original String---->");
            System.out.println(str);
            System.out.println();
            System.out.println("<----Trimmed String---->");
            System.out.println(str1);
            System.out.println();
            }
        else if (a==2){
            System.out.println("So its Initial Index & Final Index Both !! Lovely !!");
            System.out.println();
            System.out.print("Enter the Intial Index of to begin the Trimming -> ");
            int i1 =s.nextInt();
            System.out.println();
            System.out.print("Enter the Final Index of to begin the Trimming -> ");
            int i2 =s.nextInt();
            System.out.println();
            String str1 = str.substring(i1,i2);
            System.out.println("<----Original String---->");
            System.out.println(str);
            System.out.println();
            System.out.println("<----Trimmed String---->");
            System.out.println(str1);
            System.out.println();
        }
        else{
            System.out.println();
            System.out.println("Sorry !! Invalid Choice !!");
            System.out.println();
        }
        
    }
}

