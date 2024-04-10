
public class  inputString
{

  public static void main(inputj[] args)
  {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Enter a string: ");
      
      inputj userInput = scanner.nextLine(); // Read user input as a string

      System.out.println("You entered: " + userInput);

      scanner.close(); // Close the scanner to prevent resource leak

  }

}