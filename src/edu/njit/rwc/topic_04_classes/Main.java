package edu.njit.rwc.topic_04_classes;

public class Main {
    public static void main(String[] args){

        System.out.println(Dog.whatAmI());

        Dog dog1 = new Dog(); //This is how we create a new instance of a class
        System.out.println(dog1.timesBarked);
        dog1.bark();
        System.out.println(dog1.timesBarked);

        Corgi brownCorgi = new Corgi(7); //This creates a new Corgi that weighs 7 Ibs
        brownCorgi.bark();
        brownCorgi.bark();

        Dog dog2 = new Corgi(5);// Because Corgi is a subclass of Dog, we can assign a Corgi to a Dog variable
        dog2.bark();

        /*
        This is an example of a cast. It takes the value of dog2 and it treats it as type Corgi, then assigns it to corgi2.
        This can be done because the value of dog2 is actually a Corgi.
         */
        Corgi corgi2 = (Corgi) dog2;
        corgi2.bark();


        /*
        ABSTRACT CLASSES
        */
        Beverage Ajuice = new Juice(16); // We can assign Juice to its parent class Beverage
       Ajuice.drink(5);

        Beverage coffee = new Coffee(20);
        coffee.drink(8);



        /*This is a loop. A while loop. It will keep executing as long as the condition in its parentheses is true.
        How many times will this run?*/

        while(coffee.ounces > 0){
            coffee.drink(2);
        }

        for (int i = 0; i < 4;i++){
            Ajuice.drink(1);
        }

        for (int i = 1; i < 11; i++){
            if(i % 3 == 0)
                continue; // continue skips the rest of the iteration of the loop
            else if( i % 8 == 0)
                break; // break breaks out of the loop entirely
            System.out.println(i);
        }

    }
}
