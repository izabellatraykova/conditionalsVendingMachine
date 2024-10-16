import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Please enter a product code:");
        System.out.println("Code A1: Product: Soda - Price: $1.50");
        System.out.println("Code B2: Product: Chips - Price: $1.25");
        System.out.println("Code C3: Product: Candy - Price: $0.75");
        System.out.println("Code D4: Product: Water - Price: $1.00");

        String code = read.nextLine();

        switch (code) {

            case "A1":
                System.out.println("Product: Soda - Price: $1.50");
                break;
            case "B2":
                System.out.println("Product: Chips - Price: $1.25");
                break;
            case "C3":
                System.out.println("Product: Candy - Price: $0.75");
                break;
            case "D4":
                System.out.println("Product: Water - Price: $1.00");
                break;
            default:
                System.out.println("Error! Try entering a valid code.");
        }
    }
}