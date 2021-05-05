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



    }
}
