// WAJP to store even numbers & odd numbers seperately in an array..

import java.util.Scanner;
public class Arrays02 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the total numbers that you want to enter ->");
        int n = s.nextInt();
        int [] arr = new int[n];
        int [] ev = new int[(n/2)+1];
        int [] od = new int[(n/2)+1];
        for(int i=0;i<n;i++){
            System.out.print("Enter the " +i+ " Number -> ");
            arr[i]=s.nextInt();
            System.out.println();
        }
        int c=0;
        int p=0;
        for(int j=0;j<n;j++){
            if (arr[j]%2==0){
                ev[c]=arr[j];
                c++;
            }
            else{
                od[p]=arr[j];
                p++;
            }
        }

        System.out.println("Even Numbers = ");
        for(int i1=0; i1<ev.length;i1++){
            System.out.print(ev[i1]+ " ");
        }
        System.out.println();
        System.out.println("ODD Numbers = ");
        for(int i2=0; i2<od.length;i2++){
            System.out.print(od[i2]+ " ");
        }
        System.out.println();
    }
}
