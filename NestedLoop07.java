// Pattern 
// 1
// 23
// 456
// 78910

import java.util.Scanner;
public class NestedLoop07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a range for patterns -> ");
        int n= s.nextInt();
        System.out.println();
        System.out.println("<===== PATTERNS =====>");
        System.out.println();
        int c=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
        System.out.println();
    }
}
