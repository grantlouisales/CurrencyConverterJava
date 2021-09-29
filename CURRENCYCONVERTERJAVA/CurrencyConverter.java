package CURRENCYCONVERTERJAVA;
import java.util.Scanner; // Import the Scanner class
import java.util.HashMap;
import java.util.Objects;
import CURRENCYCONVERTERJAVA.Conversions.CountryConvs;

public class CurrencyConverter{

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        CountryConvs x = new CountryConvs();
        HashMap<String, String> convsTable = new HashMap<>(); // Creates a hashmap variable
        x.setup(convsTable);

        String[] currencies = { "US Dollar", "Euro", "Yen", "Pound Sterling", "Australian Dollar"};

        // Prompt the user of the currencies available.
        System.out.println("\nThis is a currency converter for your convenience.");
        System.out.println("With this converter it converts the top 5 most used currencies worldwide.");
        System.out.println("The currencies included are:");

        int counter = 1;
        for (String currency : currencies) {
            System.out.println(counter + " - "+ currency);
            counter++; 
        }

        boolean valid = false;
        while (!valid){
            System.out.print("Please pick a number 1-5 according to the currencies above to convert into another currency> ");
            String choiceOne = myObj.nextLine(); // Read user input

            System.out.print("Please pick a number 1-5 according to the currencies above to see the result> ");
            String choiceTwo = myObj.nextLine(); // Read user input
            String result = choiceOne + choiceTwo;

            // If one of the two given inputs are not within the asked numbers, restart the loop.
            if ((Integer.valueOf(choiceOne) < 1 || Integer.valueOf(choiceOne) > 5) || (Integer.valueOf(choiceTwo) < 1 || Integer.valueOf(choiceTwo) > 5)){
                System.out.println("One of your inputs was not valid. Please try again.");
            } else if (Objects.equals(choiceOne, choiceTwo)){
                System.out.println("Please choose different choices. Please try again.");
            } else {
                // Output the result.
                x.output(convsTable, result);
                valid = true;
            }
            }
        }
    }
