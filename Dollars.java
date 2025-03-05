import java.util.Scanner;

public class Dollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("enter the number of dollars: ");
        int dollars = scanner.nextInt();
        
        int Twenties = dollars / 20;
        dollars %= 20;
        
        int Tens = dollars / 10;
        dollars %= 10;
        
        int Fives = dollars / 5;
        dollars %= 5;
        
        int Ones = dollars / 1;
        dollars %= 1;
        
        System.out.println("Currency denominations:");
        System.out.println("20s: " + Twenties);
        System.out.println("10s: " + Tens);
        System.out.println("5s: " + Fives);
        System.out.println("1s: " + Ones);
        
        scanner.close();
    }
}