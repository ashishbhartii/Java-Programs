// WAJP to print all the prime numbers within a given range  .

import java.util.Scanner;
public class NestedLoop14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println("Lets Find all the PRIME Numbers within a range !");
        System.out.println();
        System.out.print("Enter the Initial range ->");
        int ini =s.nextInt();
        System.out.print("Enter the Final range ->");
        int fin =s.nextInt();
        System.out.println();
        System.out.println("The Prime Numbers between " +ini+ " and " +fin+ "are => ");
        for(int i=ini;i<=fin;i++){
            int count=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    count++;
                }
            }
            if (count==2){
                System.out.print(i+ " ");
            }
            }
        
        System.out.println();
    }
}
