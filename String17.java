// 17.WAJP to find the type of website entered by the user.
// (.com=commercial  .edu=educational  .org=organization .in=Indian commercial)


import java.util.Scanner;
public class String17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a Website : ");
        String web = s.next();
        System.out.println();
        
        if (web.startsWith("www") && web.endsWith(".com")){
            System.out.println();
            System.out.println("website ->" +web);
            System.out.println("Type -> Commercial");
            System.out.println();
        }
        else if (web.startsWith("www") && web.endsWith(".edu")){
            System.out.println();
            System.out.println("website ->" +web);
            System.out.println("Type -> Educational");
            System.out.println();
        }
        else if (web.startsWith("www") && web.endsWith(".org")){
            System.out.println();
            System.out.println("website ->" +web);
            System.out.println("Type -> Organizational");
            System.out.println();
        }
        else if (web.startsWith("www") && web.endsWith(".in")){
            System.out.println();
            System.out.println("website ->" +web);
            System.out.println("Type -> Indian Commercial");
            System.out.println();
        }
        else{
            System.out.println();
            System.out.println("Sorry INvalid Choice !!");
            System.out.println();
        }
    }
}

