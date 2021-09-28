package CURRENCYCONVERTERJAVA;
import java.util.Scanner; // Import the Scanner class

import CURRENCYCONVERTERJAVA.Conversions.CountryConvs;
import CURRENCYCONVERTERJAVA.Conversions.CountryGreeting;

public class CurrencyConverter{

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        CountryConvs x = new CountryConvs();
        CountryGreeting y = new CountryGreeting();
        String[] currencies = { "US Dollar", "Euro", "Yen", "Pound Sterling", "Australian Dollar"};

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
            int choiceOne = myObj.nextInt(); // Read user input
            

            System.out.print("Please pick a number 1-5 according to the currencies above to see the result> ");
            int choiceTwo = myObj.nextInt(); // Read user input
            

            // If one of the two given inputs are not within the asked numbers, restart the loop.
            if ((choiceOne < 1 || choiceOne > 5) || (choiceTwo < 1 || choiceTwo > 5)){
                System.out.println("One of your inputs was not valid. Please try again.");
                continue;
            } else if (choiceOne == choiceTwo){
                System.out.println("Please choose different choices. Please try again.");
                continue;
            }


            /* If statements to print out the correct conversions depending on the the choice
            received by the user. */


            // US conversions
            if (choiceOne == 1 && choiceTwo == 2){
                System.out.println(y.usa() + x.usToEuro() + " Euros.");
            } else if (choiceOne == 1 && choiceTwo == 3){
                 System.out.println(y.usa() + x.usToYen() + " Yen.");
            } else if (choiceOne == 1 && choiceTwo == 4){
                 System.out.println(y.usa() + x.usToPoundSterling() + " Pound sterlings.");
            } else if (choiceOne == 1 && choiceTwo == 5){
                 System.out.println(y.usa() + x.usToAustralianDollar() + " Australian Dollars.");
            } 


            // Euro conversions
            if (choiceOne == 2 && choiceTwo == 1) {
                System.out.println(y.euro() + x.euroToUS() + " US Dollars.");
            } else if (choiceOne == 2 && choiceTwo == 3) {
                System.out.println(y.euro() + x.euroToYen() + " Yen.");
            } else if (choiceOne == 2 && choiceTwo == 4) {
                System.out.println(y.euro() + x.euroToPoundSterling() + " Pound Sterlings.");
            } else if (choiceOne == 2 && choiceTwo == 5) {
                System.out.println(y.euro() + x.euroToAustralianDollar() + " Australian Dollars.");
            }


            // Yen conversions
            if (choiceOne == 3 && choiceTwo == 1) {
                System.out.println(y.yen() + x.yenToUS() + " US Dollars.");
            } else if (choiceOne == 3 && choiceTwo == 2) {
                System.out.println(y.yen() + x.yenToEuro() + " Euro.");
            } else if (choiceOne == 3 && choiceTwo == 4) {
                System.out.println(y.yen() + x.yenToPoundSterling() + " Pound Sterlings.");
            } else if (choiceOne == 3 && choiceTwo == 5) {
                System.out.println(y.yen() + x.yenToAustralianDollar() + " Australian Dollars.");
            }


            // Pound Sterling conversions
            if (choiceOne == 4 && choiceTwo == 1) {
                System.out.println(y.poundSterling() + x.poundSterlingToUS() + " US Dollars.");
            } else if (choiceOne == 4 && choiceTwo == 2) {
                System.out.println(y.poundSterling() + x.poundSterlingToEuro() + " Euro.");
            } else if (choiceOne == 4 && choiceTwo == 3) {
                System.out.println(y.poundSterling() + x.poundSterlingToYen() + " Yen");
            } else if (choiceOne == 4 && choiceTwo == 5) {
                System.out.println(y.poundSterling() + x.poundSterlingToAustralianDollar() + " Australian Dollars.");
            }


            // Australian Dollar conversions
            if (choiceOne == 5 && choiceTwo == 1) {
                System.out.println(y.australianDollar() + x.australianDollarToUS() + " US Dollars.");
            } else if (choiceOne == 5 && choiceTwo == 2) {
                System.out.println(y.australianDollar() + x.australianDollarToEuro() + " Euro.");
            } else if (choiceOne == 5 && choiceTwo == 3) {
                System.out.println(y.australianDollar() + x.australianDollarToYen() + " Yen");
            } else if (choiceOne == 5 && choiceTwo == 4) {
                System.out.println(y.australianDollar() + x.australianDollarToPoundSterling() + " Pound Sterlings");
            }
            valid = true;

            }
        
        }
    }
