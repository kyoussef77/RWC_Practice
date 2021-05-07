package edu.njit.rwc.topic_02_loops;

public class loops {
    public static void main(String[] args){
        int value = 25;
        boolean loop = 6 < 5; //true
       // System.out.println(loop);
        //while (loop value initialized outside of loop with a condition)
        while (value < 5) {
            //system.out.println("Test");
            value++;
        }

        /**
         * Statement 1 is executed (one time) before the execution of the code block.
         *
         * Statement 2 defines the condition for executing the code block.
         *
         * Statement 3 is executed (every time) after the code block has been executed.
         *
         * for (statement 1; statement 2; statement 3) {
         *   // code block to be executed
         * }
         */
        for (int i = 0;i <= 6; i++){
            //System.out.printf("For loop test: " + i);
        }

        if(value < 20) {
            System.out.printf("First If is True %d %n", value);
        }else if(value < 20) {
            System.out.printf("Second else If is True %d %n", value);
        }else{
            System.out.println("Third else runs:" + value);
        }

        int nums[] = {1,2,4,5,3};

         /*
        This is a foreach loop. It loops over every member of nums, assigning it to num.
        It would be similar to using
        for(int i = 0; i < nums.length; i++){
            System.out.println("Number in array of nums: " + num);
            ...
        }
         */
        for(int num : nums){
            System.out.println("Number in array of nums: " + num);
        }

    }
}
