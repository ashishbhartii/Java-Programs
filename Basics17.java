// WAJP to Calculate income tax paid by the employees as per the Govt Slabs
// [ 2.5L - 5.0L -> 5% Tax     5.0L - 10.0 L ->20% Tax    10.0L - above ->30% Tax ]


import java.util.Scanner;
public class Basics17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println("   Income Tax Department   ");
        System.out.println();
        System.out.println("Indian Tax Scheme 2023 :");
        System.out.println("1.Income (2.5L - 5.0L) -> 5% Tax  ");
        System.out.println("2.Income (5.0L - 10.0L) -> 20% Tax  ");
        System.out.println("2.Income (10.0L - Above) -> 30% Tax  ");
        System.out.println();
        System.out.print("Enter Your Name -> ");
        String name = s.next();
        System.out.println();
        System.out.print("Enter Your Sex (1.Male  2.Female) -> ");
        int sex = s.nextInt();
        System.out.println();
        System.out.print("Enter Your Comapny's Name -> ");
        String Company = s.nextLine();
        System.out.println();
        System.out.print("Enter Your Annual Income (INR) -> ");
        int income = s.nextInt();
        System.out.println();
        if (income>=250000 && income<=500000){
            System.out.println("As per your Annual Income Slab 1 (Income (2.5L - 5.0L) -> 5% Tax) gets applied");
            if (sex==1){
                System.out.print("Mr." +name+ " , Your Annual Income is " +income+ "rs (INR)");
                int tax = (income*5)/100;
                int balance = income-tax;
                System.out.println("Your taxes for 2022-2023 are " +tax+ " rs (INR)");
                System.out.println("Your Balance is " +balance);
                System.out.println();
                System.out.println("Congratulations, " +name+ " You Paid your taxes and you are law abiding Citizen of Bharat !!");
                System.out.println();
            }
            else if (sex==2){
                System.out.print("Ms./Mrs." +name+ " , Your Annual Income is " +income+ "rs (INR)");
                int tax = (income*5)/100;
                int balance = income-tax;
                System.out.println("Your taxes for 2022-2023 are " +tax+ " rs (INR)");
                System.out.println("Your Balance is " +balance);
                System.out.println();
                System.out.println("Congratulations, " +name+ " You Paid your taxes and you are law abiding Citizen of Bharat !!");
                System.out.println();
            }
            else{
                System.out.println("Sorry Invalid Choice !!");
                System.out.println();
            }
        }
        else if (income>500000 && income<=1000000){
            System.out.println("As per your Annual Income Slab 2 (Income (5.0L - 10.0L) -> 20% Tax) gets applied");
            if (sex==1){
                System.out.print("Mr." +name+ " , Your Annual Income is " +income+ "rs (INR)");
                int tax = (income*20)/100;
                int balance = income-tax;
                System.out.println("Your taxes for 2022-2023 are " +tax+ " rs (INR)");
                System.out.println("Your Balance is " +balance);
                System.out.println();
                System.out.println("Congratulations, " +name+ " You Paid your taxes and you are law abiding Citizen of Bharat !!");
                System.out.println();
            }
            else if (sex==2){
                System.out.print("Ms./Mrs." +name+ " , Your Annual Income is " +income+ "rs (INR)");
                int tax = (income*20)/100;
                int balance = income-tax;
                System.out.println("Your taxes for 2022-2023 are " +tax+ " rs (INR)");
                System.out.println("Your Balance is " +balance);
                System.out.println();
                System.out.println("Congratulations, " +name+ " You Paid your taxes and you are law abiding Citizen of Bharat !!");
                System.out.println();
            }
            else{
                System.out.println("Sorry Invalid Choice !!");
                System.out.println();
            }
        }
        else if (income>1000000){
            System.out.println("As per your Annual Income Slab 3 (Income (10.0L & Above) -> 30% Tax) gets applied");
            if (sex==1){
                System.out.print("Mr." +name+ " , Your Annual Income is " +income+ "rs (INR)");
                int tax = (income*30)/100;
                int balance = income-tax;
                System.out.println("Your taxes for 2022-2023 are " +tax+ " rs (INR)");
                System.out.println("Your Balance is " +balance);
                System.out.println();
                System.out.println("Congratulations, " +name+ " You Paid your taxes and you are law abiding Citizen of Bharat !!");
                System.out.println();
            }
            else if (sex==2){
                System.out.print("Ms./Mrs." +name+ " , Your Annual Income is " +income+ "rs (INR)");
                int tax = (income*30)/100;
                int balance = income-tax;
                System.out.println("Your taxes for 2022-2023 are " +tax+ " rs (INR)");
                System.out.println("Your Balance is " +balance);
                System.out.println();
                System.out.println("Congratulations, " +name+ " You Paid your taxes and you are law abiding Citizen of Bharat !!");
                System.out.println();
            }
            else{
                System.out.println("Sorry Invalid Choice !!");
                System.out.println();
            }
        }
        
    }
}
