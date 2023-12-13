// WAJP to print to check whwther a  number is prime or not .

import java.util.Scanner;
public class Basics22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println("Lets Check for Prime!!");
        System.out.println();
        System.out.print("Enter a Number to be checked ->");
        int num =s.nextInt();
        System.out.println();
        int count=0;
        for(int i=1;i<=num;i++){
            
            if(num%i==0){
                count++;
            }}
        if (count==2){
            System.out.println(num+ " is a PRIME Number !");
            }
        else{
            System.out.println(num+ " is a Not PRIME Number !");}
        
        System.out.println();
    }
}
