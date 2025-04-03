
import java.util.Scanner;

public class Converter{
    public static void main(String[] args) {
        
        //introduction of game 
         System.out.println("welcome to the convertor");
         double coinValue = 0.0045;
         System.out.println("enter the amount of coins");
         
         Scanner scanner = new Scanner(System.in);

         int coin = scanner.nextInt();
         double  money = coinValue * coin;
         System.out.println(money);
    }}