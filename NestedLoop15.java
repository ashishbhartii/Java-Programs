// WAJP to print all the prime numbers within a given range along with their factorials  .

import java.util.Scanner;
public class NestedLoop15 {
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
                System.out.print(i+ " = ");
                int fac=1;
                System.out.println("Prime No " +i+ " = ");
                for (int i1=1;i1<=i;i1++){
                    fac=fac*i1;
                    System.out.print(i1+ " x " );
                }
                System.out.println("=" +fac);
                System.out.println();
            }
        }
        System.out.println();
    }
}
