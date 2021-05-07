package edu.njit.rwc.topic_04_classes;

public class Coffee extends Beverage {

    public Coffee(int oz){
        super(oz);
    }

    /**
     * Coffee is bitter
     * @return So we return true
     */
    public boolean isBitter() {
        return true;
    }
}
