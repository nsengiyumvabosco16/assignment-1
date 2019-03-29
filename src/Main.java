import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double GrossSalary = 1000000, hourlyRate = 5000, NetSalary, hoursWorkedPerWeek, reductions;

        String employeeName;

        String empType;

        System.out.println ("Enter employee's name");

        employeeName = in.nextLine();

        System.out.println ("Enter type M (Monthly) , W (Weekly) , H (Hourly)");

        empType = in.nextLine();

        if (empType.equals("M") || empType.equals("m")){

            reductions = (GrossSalary * 0.3) + (GrossSalary * 0.03);

            NetSalary = GrossSalary - reductions;

            System.out.println("Names : " + employeeName);
            System.out.println("\n Type : " + empType);
            System.out.println("\n Net Salary: " + NetSalary);


        }else if (empType.equals("W") || empType.equals("w")){

            reductions = (GrossSalary * 0.03);

            NetSalary = GrossSalary - reductions;

            System.out.println("Names : " + employeeName);
            System.out.println("\n Type : " + empType);
            System.out.println("\n Net Salary : " + NetSalary);

        }else{

            System.out.println ("Number of hours per week");

            hoursWorkedPerWeek = Double.parseDouble(in.nextLine());

            NetSalary = hourlyRate * hoursWorkedPerWeek;

            System.out.println("Names : " + employeeName);
            System.out.println("\nEmployee Type : " + empType);
            System.out.println("\nNet Salary : " + NetSalary);

        }

    }
}
