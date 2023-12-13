// WAJP to find the percentage of marks a student obtains out of his five subjects.

import java.util.Scanner;
public class Basics09 {
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
    }
    
}
