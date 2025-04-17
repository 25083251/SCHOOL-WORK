public class NumberDemo{
    public static void main(String []agrs){
      // Ceclare and assign values to two integer variables
      int number1 = 3;
      int number2 = 5;
      
      // Pass each value to the methods
      System.out.println("For number1");
      displayTwiceTheNumber(number1);
      displayNumberPlusFive(number1);
      displayNumberSquared(number1);
      
      System.out.println("For number2");
      displayTwiceTheNumber(number2);
      displayNumberPlusFive(number2);
      displayNumberSquared(number2);
  }
  
  // Method to display twice the number
  public static void displayTwiceTheNumber(int number){
      System.out.println("Twice the number:" + (number * 2));
  }
  
  // Method to display the number plus five
  public static void displayNumberPlusFive(int number){
      System.out.println("Number plus five:" + (number + 5));
  }
  // Method to display the number squared
  public static void displayNumberSquared(int number){
      System.out.println("Number squared:" + (number * number));

}}