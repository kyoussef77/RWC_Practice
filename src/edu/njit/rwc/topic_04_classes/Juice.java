package edu.njit.rwc.topic_04_classes;

/**
 * Juice extends the abstract class Beverage, so it must override its abstract methods
 */
public class Juice extends Beverage{
    public Juice(int oz){
        super(oz);
    }

    /**
     * Juice is not bitter
     * @return We return false
     */
    public boolean isBitter() {
        return false;
    }
}
