package edu.njit.rwc.topic_03_arrays;

public class Main {
    public static void main(String[] args){
        /*
        We use square brackets to create an array. An array is a fixed size group of items if the same type.
         */
        int[] iArray = new int[4];
        // iArray = [ , , , ]
        //           0 1 2 3

        iArray[0] = 3;
        iArray[1] = 1;
        iArray[2] = 4;
        iArray[3] = 5; //iArray[4] would fail, because it's out of bounds.

        for(int i = 0; i < iArray.length; i++){
            System.out.println("Value of i: " + i + " Value of Array: " + iArray[i]);
        }

        int[] sequence = count(6); //We can also assign to an array like this.

        for(int i = sequence.length - 1; i >= 0; i--){ // -- decrements, like how ++ increments
            System.out.println(sequence[i]);
        }

        System.out.println( "Final Sum: " + sum(sequence));
    }

    /**
     * private functions can only be accessed within its own class
     * @param len
     * @return An array of ints of size len, counting up from 0
     */
    private static int[] count(int len){
        int[] count = new int[len]; //we can use a variable for an array length
        for(int i = 0; i < len; i++){
            count[i] = i;
        }
        return count;
    }

    private static int sum(int[] nums){
        int sum = 0;

        for(int num: nums) {
            System.out.println("Adding "+ num + " to "+ sum);

            sum += num; // this is a compound assignment, the same as sum = sum + num;

            System.out.println("Now the sum is " + sum);
        }

        return sum;
    }

}
