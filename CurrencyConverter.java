import java.util.Scanner; // Import the Scanner class

public class CurrencyConverter{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        String[] currencies = { "US Dollar", "Euro", "Yen", "Pound Sterling", "Australian Dollar", "Quit"};


        System.out.println("This is a currency converter for your convenience.");
        System.out.println("With this converter only helps convert the top 5 most used currencies worldwide.");
        System.out.println("These currencies include:");

        int counter = 1;
        for (String currency : currencies) {
            System.out.println(counter + " - "+ currency);
            counter++; 
        }
        
        System.out.println("Please choose 2 currencies to see the conversion.");

        boolean valid = false;
        while (!valid){
            System.out.print("Please enter a number 1 - 6> ");
            int choiceOne = myObj.nextInt(); // Read user input

            switch(choiceOne){
                case 1:
                    System.out.println("You chose the US Dollar");
                    break;
                case 2:
                    System.out.println("You chose the Euro");
                    break;
                case 3:
                    System.out.println("You chose the Yen");
                    break;
                case 4:
                    System.out.println("You chose the Pound Sterling");
                    break;
                case 5:
                    System.out.println("You chose the Australian Dollar");
                    break;
                case 6:
                    valid = true;
                    break;
                default:
                    System.out.println("Invalid Number");
            }

        }

    }
}
