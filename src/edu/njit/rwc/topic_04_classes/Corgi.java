package edu.njit.rwc.topic_04_classes;

/**
 * This is an example of a subclass. Specifying extends Dog means this is a subclass of Dog.
 * A subclass has everything its parent class has, but can add new things or override the old.
 * NOTE that, even when a class doesnt extend anything, it still has Object as a parent class.
 */
public class Corgi extends Dog {
    public int pounds; //only for corgis, we want to keep track of how heavy they are.

    /**
     * This will be called whenever we create a newe Corgi object.
     * @param lbs How heavy is the Corgi
     */
    public Corgi(int lbs){
        super();
        pounds = lbs;
    }

    /**
     * this function overrides the bark function that Dog has. When we call bark on a Corgi, this will be executed.
     */
    public void bark() {
        System.out.println("Yap! Weight is: " + pounds + " pounds!");
        System.out.println("I already yapped " + timesBarked + " times!");
        timesBarked ++;
    }
}
