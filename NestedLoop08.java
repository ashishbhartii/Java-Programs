// Pattern 
// 1
// 23
// 345
// 4567

import java.util.Scanner;
public class NestedLoop08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a range for patterns -> ");
        int n= s.nextInt();
        System.out.println();
        System.out.println("<===== PATTERNS =====>");
        System.out.println();
        for(int i=1;i<=n;i++){
            int c=i;
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
        System.out.println();
    }
}
