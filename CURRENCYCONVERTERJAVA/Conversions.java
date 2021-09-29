package CURRENCYCONVERTERJAVA;
import java.util.HashMap;
import java.util.Objects;

abstract class Conversions {

    String[][] convs = {{ "1 US Dollar is equal to 0.85 Euros.", "1 US Dollar is equal to 110.76 Yen.", "1 US Dollar is equal to 0.73 Pound Sterlings.", "1 US Dollar is equal to 1.38 Australian Dollars."}, 
                        { "1 Euro is equal to 1.17 US Dollars.", "1 Euro is equal to 129.89 Yen.", "1 Euro is equal to .86 Pound Sterlings." , "1 Euro is equal to 1.61 Australian Dollar."}, 
                        { "1 Yen is equal to 0.009 US Dollars." , "1 Yen is equal to 0.0077 Euros.", "1 Yen is equal to 0.0066 Pound Sterlings.", "1 Yen is equal to 0.012 Australian Dollars."},
                        { "1 pound sterling is equal to 1.37 US Dollars.", "1 pound sterling is equal to 1.17 Euros.", "1 pound sterling is equal to 151.45 Yen.", "1 pound sterling is equal to 1.88 Australian Dollars."}, 
                        { "1 Australian Dollar is equal to 0.73 US Dollars.", "1 Australian Dollar is equal to 0.62 Euros.", "1 Australian Dollar is equal to 80.42 Yen.", "1 Australian Dollar is equal to 0.53 Pound Sterlings."}};


    static class CountryConvs extends Conversions {

        public void setup(HashMap<String, String> convsTable){
            // USA
            convsTable.put("12", convs[0][0]);
            convsTable.put("13", convs[0][1]);
            convsTable.put("14", convs[0][2]);
            convsTable.put("15", convs[0][3]);

            // Euro
            convsTable.put("21", convs[1][0]);
            convsTable.put("23", convs[1][1]);
            convsTable.put("24", convs[1][2]);
            convsTable.put("25", convs[1][3]);

            // Yen
            convsTable.put("31", convs[2][0]);
            convsTable.put("32", convs[2][1]);
            convsTable.put("34", convs[2][2]);
            convsTable.put("35", convs[2][3]);

            // Pound Sterling
            convsTable.put("41", convs[3][0]);
            convsTable.put("42", convs[3][1]);
            convsTable.put("43", convs[3][2]);
            convsTable.put("45", convs[3][3]);

            // Australian Dollar
            convsTable.put("51", convs[4][0]);
            convsTable.put("52", convs[4][1]);
            convsTable.put("53", convs[4][2]);
            convsTable.put("54", convs[4][3]);
        }
        public void output(HashMap<String, String> convsTable, String result){
                for (String i : convsTable.keySet()){
                    if (Objects.equals(i, result)){
                        System.out.println(convsTable.get(i));
                    }
                }
            }
        }
    }
