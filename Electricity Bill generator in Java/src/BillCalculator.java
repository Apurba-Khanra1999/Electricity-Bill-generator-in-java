import java.util.Scanner;

public class BillCalculator {
    public static void main(String[] args) {
        
        //TariffDetails td = new TariffDetails();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer name : ");
        String name = sc.nextLine();
        System.out.println("Enter Customer Address : ");
        String address = sc.nextLine();
        System.out.println("Enter Customer Phone : ");
        int phone = sc.nextInt();

        System.out.println("Enter the Unit consumed : ");
        double units = sc.nextDouble();

        
        System.out.println("\t\t West Bengal Electricity Board ");
        System.out.println("\t\t\tBill Summary");
        System.out.println();
        BillSummary b1 = new BillSummary(name,address,phone);
        System.out.println(b1);
        System.out.println("----------------------------------------------------------");
        System.out.println("Unit Consumed : "+units);
        //System.out.println("Amount to Pay : "+td.tariffCalculation(units));
        double[] demo = Demo.demo(units);
        System.out.println("Tariff Amount : "+demo[0]);
        System.out.println("Fixed Charge : "+demo[3]);
        System.out.println("Amount to Pay : "+demo[2]);
        System.out.println();

        
    }
}
