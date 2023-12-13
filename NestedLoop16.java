// WAJP to print all the Palindrome numbers within a given range  .

import java.util.Scanner;
public class NestedLoop16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println("Lets Find all the PALINDROME Numbers within a range !");
        System.out.println();
        System.out.print("Enter the Initial range ->");
        int ini =s.nextInt();
        System.out.print("Enter the Final range ->");
        int fin =s.nextInt();
        System.out.println();
        System.out.println("The PALINDROME Numbers between " +ini+ " and " +fin+ "are => ");
        for(int i=ini;i<=fin;i++){
            int count=0;
            int temp=i;
            int r=0;
            while(i>0){
                r=i%10;
                count=(count*10)+r;
                i=i/10;
            }
            if (count==temp){
                System.out.print(temp+ " ");
            }
        }
        
        System.out.println();
    }
}
