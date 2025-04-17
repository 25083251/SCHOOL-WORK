public class NumberDemo2 {
   
    
    public static void main(String[] args) {
   // Create Scanner object to read input from keyboard
   Scanner input = new Scanner(System.in);
    
   //Ask the user to enter the first integer
   System .out.print("Enter the first integer: ");
   int number1 = input.nextInt();
   // you can read the first int
   
   //Ask the user to enter the second integer
   System.out.print ("Enter the second integer : ");
   int number2 = input.nextInt();
   // you read second integer
   
   //Call the methods for the first number
   displayTwiceTheNumber(number1);
   displayNumberPlusFive(number1);
   displayNumberSquared(number1);
    
   //call the methods for the second number
   displayTwiceTheNumber(number2);
   displayNumberPlusFive(number2);
   displayNumberSquared(number2);
   
   //you must close the scanner to prevent resource leaks
   input.close();
    }
    
    //method to display twice the input number plus 5
    public static void displayTwiceTheNumber(int number){
        System.out.println("Twice" + number + " is " + (number *2));
         
    }
    //method to displaybthe square of the input number
    public static void displayNumberPlusFive(int number){
        System.out.println(number + "Plus five is " +( number + 5));
    }
    public static void displayNumberSquared( int number){
        System.out.println(number + "Squared is " + ( number * number));

    }
}



