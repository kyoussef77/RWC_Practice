package edu.njit.rwc.topic_01_types;

public class Main {

    public static void main(String[] args){
        int iVal = 10;
//        System.out.println(iVal); //Now we print the value held in iVal (10) to the console

        /*
        Char literals are surrounded by apostrophes/single quotes.
         */
        char cVal = 'd';
//        System.out.println(cVal); //Print the d to the console on a new line


        /*
        Booleans hold a value of either true or false.
        The double equals sign is uses for checking equality. which means this statement checks whether the value held
        by iVal is equal to 10.
         */
        boolean bVal = false;
        boolean testVal = (iVal == 100);
//        System.out.println(testVal);
//        System.out.println(bVal);


        /*
        We can change the value of a variable that already exists after creating it
         */
        iVal = 5;
        bVal = (iVal == 10); //false
//        System.out.println(bVal);


        /*
        Floats also hold numeric values, except they do not need to be integers like an int.
        Putting an f after the literal value of 0.25 tells the compiler that it is a float.
         */
        float fVal = 0.25F;
//        System.out.println(fVal);


        /*
        Double are like floats, but have greater precision and range. You dont need to put an f after the literal.
         */
        double dVal = 0.75432904;
//        System.out.println(dVal);

        /*
        Strings are not technically primitives, and so the name of its data type start with a capital letter.
         */
        String string = "Text data";
       // System.out.println(string);

        doSomething();

        /*
        Now, we are going to pass iVal, fVal, dVal to the evenOrOdd function.
         */
        eveOrOdd(iVal, fVal, dVal);

        /*
        We call the average function and do something with its return value.
         */
        System.out.println(average(2.5, 2.75));
        double averaged1_d2 = average(2.5,2.75);

        System.out.println(concat("One String", 7));

        logic();
    }




    /**
     * This is a function other than the main function. Functions do things and can be called from elsewhere in code.
     * Once a function is done, execution returns to where it was called from.
     * This function is static because we want to be able to call it given only the class that contains it, rather than
     * needing an instance of that class.
     * The word void indicates that it does not return anything. The empty parentheses indicate that it takes no
     * parameters;
     */
    static void doSomething(){
        System.out.println("I am a simple function");
    }

    static void eveOrOdd(int i, double even, double odd){

        /*
        We use an if statement to run code only when a condition is met.
        The % symbol means modulus. It is the result of performing division then taking the remainder.
        If an integer is even, its modulus 2 will be equal to 0.
         */
        if(i % 2 == 0){
            System.out.println(even);
        }
        /*
        After an if statement, we can have an else statement, which runs when none of the previous if/if else blocks fired.
        That means this one will run when i is odd.
         */
        else {
            System.out.println(odd);
        }
    }

    /**
     * This is an example of a function that returns somethinf. The value of it can be used by caller.
     * This returns a value of type double.
     * @param d1
     * @param d2
     * @return The average of d1 and d2
     */
    static double average(double d1, double d2){
        return (d1 + d2) / 2.0; //The return statement returns the value following it to the caller.
    }

    /**
     * This function demonstrates String concatenation
     * @param label
     * @param i
     * @return What you from concatenation a String and an int
     */
    static String concat(String label, int i){
        return "\"" + label + "\" is a String. Also, we had an int: " + i;
    }

    /**
     * This demonstrates comparison operations and logical operators
     */

    static void logic(){
        int lo = 5, middle = 6, hi = 7; // We can declare multiple ints at once like this.
        System.out.println(lo == 5);// == Tests for equality
        System.out.println(lo < hi); // less than
        System.out.println(lo > hi); // Greater than
        System.out.println(lo <= lo); // Less than or equal to
        System.out.println(lo >= hi); // Greater than or equal to
        System.out.println(lo != middle); // Not(!) equal to
        boolean isTrue = middle <= hi,isFalse = hi < lo;
        System.out.println(isTrue || isFalse); //  Logical OR, true when either side is true
        System.out.println(isTrue && isFalse); // Logical AND, true when both sides are true
        System.out.println(!isFalse);// Logical NOT, true when the NOT-ed value is false, and vice versa
    }

}
