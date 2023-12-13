// WAJP to find the percentage of marks a student obtains out of his five subjects and find his grade 
    // (A=85-100  B=70-85  C=50-70  D=40-50  E=<40)

import java.util.Scanner;
public class Basics16 {
    public static void main(String[] args) {
        System.out.println("Lets Do the PErcentage !!");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the name of the Student =");
        String str = s.next();
        System.out.println();
        System.out.print("Enter Marks in Maths =");
        int math = s.nextInt();
        System.out.println();
        System.out.print("Enter Marks in English =");
        int eng = s.nextInt();
        System.out.println();
        System.out.print("Enter Marks in Science =");
        int sci = s.nextInt();
        System.out.println();
        System.out.print("Enter Marks in Hindi =");
        int hin = s.nextInt();
        System.out.println();
        System.out.print("Enter Marks in Social Studies =");
        int sst = s.nextInt();
        System.out.println();
        int pcnt = (math+eng+sci+hin+sst)/5;
        System.out.print("The Percentage Obtained by ");
        System.out.print(str+ " is = ");
        System.out.println(pcnt+ "%");
        System.out.println();
        if (pcnt>=85 && pcnt<=100){
            System.out.println();
            System.out.println("Congratulations !! "  +str+ " Grade A , with " +pcnt+ " % marks ");
            System.out.println();
        }
        else if (pcnt>=70 && pcnt<85){
            System.out.println();
            System.out.println("Good !!, " +str+  " Grade B , with " +pcnt+ " % marks ");
            System.out.println();
        }
        else if (pcnt>=50 && pcnt<70){
            System.out.println();
            System.out.println("Need Impovement!! " +str+ " Grade C , with " +pcnt+ " % marks ");
            System.out.println();
        }
        else if (pcnt>=40 && pcnt<50){
            System.out.println();
            System.out.println("Poor Performance!! "   +str+ "  Grade D , with " +pcnt+ " % marks ");
            System.out.println();
        }
        else if (pcnt<400){
            System.out.println();
            System.out.println(" FAIL  ! " +str+  "  Grade E , with " +pcnt+ " % marks ");
            System.out.println();
        }
        else{
            System.out.println();
            System.out.println("Sorry Invalid Call or Choice !!");
            System.out.println();
        }
    }
    
}
