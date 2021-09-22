public class Practice {

    static void myMethod(String fname){
        System.out.println(fname + " Ales");
    }

    public static void main(String[] args){
        /*
         * int x = 5; float pi = 3.14; char letter = "A"; boolean Bool = false;
         */

        String firstName = "Grant";
        int firstNameLength = firstName.length();

        if (firstNameLength == 5) {
            System.out.println("Ed likes to eat plants");
        }

        int day = 4;

        switch (day) {
            case 4:
                System.out.println("4");
                break;
            default:
                break;
        }

        int i = 0;
        while (i < 5) {
            System.out.println(firstName);
            i++;
        }

        for (int j = 0; j < 5; j++) {
            System.out.println("For loop");
        }

        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        // for each statement to loop through list
        // for (type variableName)
        for (String k : cars) {
            System.out.println(k);
        }
        System.out.println(firstNameLength);

        String[] languages = {"Java", "C++", "JavaScript", "Python"};
        int[] myNum = {10, 20, 30, 40, 50};
        System.out.println(myNum[0]);
        System.out.println(languages[3]);
        myNum[0] = 400;
        System.out.println(myNum[0]);
        System.out.println(myNum.length);

        // Multidimensional Arrays
        int[][] myNumbers = {{1,2,3,4}, {5,6,7,8}};
        int x = myNumbers[1][2];
        System.out.println(x);

        myMethod("Grant");
    }
}
