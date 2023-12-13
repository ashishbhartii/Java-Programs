// Pattern 
// 1234
// 123
// 12
// 1

import java.util.Scanner;
public class NestedLoop06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a range for patterns -> ");
        int n= s.nextInt();
        System.out.println();
        System.out.println("<===== PATTERNS =====>");
        System.out.println();
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }
}
