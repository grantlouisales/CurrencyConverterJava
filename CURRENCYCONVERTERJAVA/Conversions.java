package CURRENCYCONVERTERJAVA;
abstract class Conversions {

    double[][] convs = {{ 0.85, 110.76, 0.73, 1.38 }, { 1.17, 129.89, .86, 1.61 }, { 0.009, 0.0077, 0.0066, 0.012 },
                        { 1.37, 1.17, 151.45, 1.88 }, { 0.73, 0.62, 80.42, 0.53 }};

    String[] options = { "1 US Dollar is equal to ", "1 Euro is equal to ", "1 Yen is equal to ",
                         "1 pound sterling is equal to ", "1 Australian Dollar is equal to " };

    static class CountryConvs extends Conversions {

        // Conversions for the US Dollar
        public double usToEuro(){
            return convs[0][0];
        }

        public double usToYen(){
            return convs[0][1];
        } 

        public double usToPoundSterling(){
            return convs[0][2];
        }

        public double usToAustralianDollar(){
            return convs[0][3];
        }

        // Conversions for the Euro
        public double euroToUS() {
            return convs[1][0];
        }

        public double euroToYen() {
            return convs[1][1];
        }

        public double euroToPoundSterling() {
            return convs[1][2];
        }

        public double euroToAustralianDollar() {
            return convs[1][3];
        }

        // Conversions for the Yen
        public double yenToUS() {
            return convs[2][0];
        }

        public double yenToEuro() {
            return convs[2][1];
        }

        public double yenToPoundSterling() {
            return convs[2][2];
        }

        public double yenToAustralianDollar() {
            return convs[2][3];
        }

        // Conversions for the Pound Sterling
        public double poundSterlingToUS() {
            return convs[3][0];
        }

        public double poundSterlingToEuro() {
            return convs[3][1];
        }

        public double poundSterlingToYen() {
            return convs[3][2];
        }

        public double poundSterlingToAustralianDollar() {
            return convs[3][3];
        }

        // Conversions for the Australian Dollar
        public double australianDollarToUS() {
            return convs[4][0];
        }

        public double australianDollarToEuro() {
            return convs[4][1];
        }

        public double australianDollarToYen() {
            return convs[4][2];
        }

        public double australianDollarToPoundSterling() {
            return convs[4][3];
        }
    }
    
    static class CountryGreeting extends Conversions {
        
        public String usa(){
            return options[0];
        }

        public String euro(){
            return options[1];
        }

        public String yen(){
            return options[2];
        }

        public String poundSterling(){
            return options[3];
        }

        public String australianDollar(){
            return options[4];
        }
    }
}
