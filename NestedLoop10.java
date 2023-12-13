// Pattern 
    //    ----1
    //    ---2-
    //    --3--
    //    -4---
    //    5----

    import java.util.Scanner;
    public class NestedLoop10 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println();
            System.out.print("Enter a range for patterns -> ");
            int n= s.nextInt();
            System.out.println();
            System.out.println("<===== PATTERNS =====>");
            System.out.println();
            for(int i=n;i>0;i--){
                for(int j=1;j<=n;j++){
                    if(i==j){
                        System.out.print(i);
                    }
                    else{
                        System.out.print("-");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    