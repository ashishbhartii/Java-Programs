// WAJP to make an array user dependent and store some elements and print it.

import java.util.Scanner;
public class Arrays01 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int [] arr = new int[5];
        for(int i=0;i<5;i++){
            System.out.print("Enter the " +i+ " Number -> ");
            arr[i]=s.nextInt();
            System.out.println();
        }
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+ " ");
            }
        System.out.println();
        System.out.println();
    }
}






