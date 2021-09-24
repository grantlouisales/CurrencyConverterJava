import java.util.Scanner; // Import the Scanner class

public class CurrencyConverter{
    
    static String countryCurrency(int option){
        String[] options = {"1 US Dollar is equal to ", "1 Euro is equal to ",
                            "1 Yen is equal to ", "1 pound sterling is equal to ",
                            "1 Australian Dollar is equal to "};
        return options[option];
    }
    static double usConversions(int choice){
        double[] conversions = {0.85, 110.76, 0.73, 1.38};
        return conversions[choice];
    }

    static double euroConversions(int choice){
        double[] conversions = {1.17, 129.89, .86, 1.61};
        return conversions[choice];
    }

    static double yenConversions(int choice){
        double[] conversions = {0.009, 0.0077, 0.0066, 0.012};
        return conversions[choice];
    }

    static double poundSterlingConversion(int choice){
        double[] conversions = {1.37, 1.17, 151.45, 1.88};
        return conversions[choice];
    }

    static double australianConversions(int choice){
        double[] conversions = {0.73, 0.62, 80.42, 0.53};
        return conversions[choice];
    }
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
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
                System.out.println(countryCurrency(0) + usConversions(0) + " Euros.");
            } else if (choiceOne == 1 && choiceTwo == 3){
                 System.out.println(countryCurrency(0) + usConversions(1) + " Yen.");
            } else if (choiceOne == 1 && choiceTwo == 4){
                 System.out.println(countryCurrency(0) + usConversions(2) + " Pound sterlings.");
            } else if (choiceOne == 1 && choiceTwo == 5){
                 System.out.println(countryCurrency(0) + usConversions(3) + " Australian Dollars.");
            } 


            // Euro conversions
            if (choiceOne == 2 && choiceTwo == 1) {
                System.out.println(countryCurrency(1) + euroConversions(0) + " US Dollars.");
            } else if (choiceOne == 2 && choiceTwo == 3) {
                System.out.println(countryCurrency(1) + euroConversions(1) + " Yen.");
            } else if (choiceOne == 2 && choiceTwo == 4) {
                System.out.println(countryCurrency(1) + euroConversions(2) + " Pound Sterlings.");
            } else if (choiceOne == 2 && choiceTwo == 5) {
                System.out.println(countryCurrency(1) + euroConversions(3) + " Australian Dollars.");
            }


            // Yen conversions
            if (choiceOne == 3 && choiceTwo == 1) {
                System.out.println(countryCurrency(2) + yenConversions(0) + " US Dollars.");
            } else if (choiceOne == 3 && choiceTwo == 2) {
                System.out.println(countryCurrency(2) + yenConversions(1) + " Euro.");
            } else if (choiceOne == 3 && choiceTwo == 4) {
                System.out.println(countryCurrency(2) + yenConversions(2) + " Pound Sterlings.");
            } else if (choiceOne == 3 && choiceTwo == 5) {
                System.out.println(countryCurrency(2) + yenConversions(3) + " Australian Dollars.");
            }


            // Pound Sterling conversions
            if (choiceOne == 4 && choiceTwo == 1) {
                System.out.println(countryCurrency(3) + poundSterlingConversion(0) + " US Dollars.");
            } else if (choiceOne == 4 && choiceTwo == 2) {
                System.out.println(countryCurrency(3) + poundSterlingConversion(1) + " Euro.");
            } else if (choiceOne == 4 && choiceTwo == 3) {
                System.out.println(countryCurrency(3) + poundSterlingConversion(2) + " Yen");
            } else if (choiceOne == 4 && choiceTwo == 5) {
                System.out.println(countryCurrency(3) + poundSterlingConversion(3) + " Australian Dollars.");
            }


            // Australian Dollar conversions
            if (choiceOne == 5 && choiceTwo == 1) {
                System.out.println(countryCurrency(4) + australianConversions(0) + " US Dollars.");
            } else if (choiceOne == 5 && choiceTwo == 2) {
                System.out.println(countryCurrency(4) + australianConversions(1) + " Euro.");
            } else if (choiceOne == 5 && choiceTwo == 3) {
                System.out.println(countryCurrency(4) + australianConversions(2) + " Yen");
            } else if (choiceOne == 5 && choiceTwo == 4) {
                System.out.println(countryCurrency(4) + australianConversions(3) + " Pound Sterlings");
            }

            valid = true;

            }
        
        }
    }
