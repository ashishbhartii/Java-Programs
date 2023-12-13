// WAJP to print the permutation and combination of any given number as per the user choice.

import java.util.Scanner;
public class Basics28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println("Lets do the PERMUTATION and COMBINATION !!");
        System.out.println();
        System.out.println("Permutation [ nPr ] -->  n!/(n-r)! \nCombination [ nCr ] -->  n!/[r!(n-r)!]");
        System.out.println();
        System.out.print("Enter a value of (n) --> ");
        int n=s.nextInt();
        System.out.print("Enter a value of (r) --> ");
        int r=s.nextInt();
        System.out.println();
        System.out.println("<=====  Lets Begin!! ======>");
        System.out.println("1.PERMUTATION \n2.COMBINATION");
        System.out.println();
        System.out.print("Enter a Choice  ->");
        int ch=s.nextInt();
        System.out.println();
        if (ch==1){
            System.out.println("<==== PERMUTATION It is !! ====>");
            System.out.println();
            System.out.println("Permutation [ nPr ] -->  n!/(n-r)!");
            int fac1=1;
            int fac2=1;
            for (int i=1;i<=n;i++){
                fac1=fac1*i;
            }
            int p=(n-r);
            for (int j=1;j<=p;j++){
                fac2=fac2*j;
            }
            int npr=fac1/fac2;
            System.out.println("Permutation nPr = [n!/(n-r)!] = [" +n+ "!/(" +n+ "-" +r+ ")!] = " +npr);
            System.out.println();
            
        }
        else if (ch==2){
            System.out.println("<==== COMBINATION It is !! ====>");
            System.out.println();
            System.out.println("Combination [ nCr ] -->  n!/[r!(n-r)!]");
            int fac1=1;
            int fac2=1;
            int fac3=1;
            for (int i=1;i<=n;i++){
                fac1=fac1*i;
            }
            for (int i1=1;i1<=r;i1++){
                fac2=fac2*i1;
            }
            int p=(n-r);
            for (int j=1;j<=p;j++){
                fac3=fac3*j;
            }
            int ncr=fac1/(fac2*fac3);
            System.out.println("Combination nCr = n!/[r!(n-r)!] = [" +n+ "!/[" +r+ "!(" +n+ "-" +r+ ")!] = " +ncr);
            System.out.println();
            
        }
        else{
            System.out.println("Sorry !! Invalid Choice !!");
        }
        System.out.println();
        System.out.println();
    }
}
