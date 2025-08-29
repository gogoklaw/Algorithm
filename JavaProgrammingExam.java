import java.util.Scanner;

public class JavaProgrammingExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a productName1: ");
        String productName1 = scanner.nextLine();
        System.out.print("Enter a productPrice1: ");
        float productPrice1 = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Enter a productName2: ");
        String productName2 = scanner.nextLine();
        System.out.print("Enter a productPrice2: ");
        float productPrice2 = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Enter a productName3: ");
        String productName3 = scanner.nextLine();
        System.out.print("Enter a productPrice3: ");
        float productPrice3 = scanner.nextFloat();
        scanner.nextLine();

        System.out.print("Enter a customer paid money");
        float customerpaidmoney = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Product name 1: " + productName1);
        System.out.println("Product price 1: " + productPrice1);

        System.out.println("Product name 2: " + productName2);
        System.out.println("Product price 2: " + productPrice2);

        System.out.println("Product name 3: " + productName3);
        System.out.println("Product price 3: " + productPrice3);
        System.out.println("customerpaidmoney: " + customerpaidmoney + "bath");

        float total = productPrice1 + productPrice2 + productPrice3;

    }
}
