package edu.njit.rwc.topic_04_classes;

/**
 * An abstract class is special in that you cannot create it directly.
 */
public abstract class Beverage {
    public int ounces;

    public Beverage (int oz){
        ounces = oz;
    }

    public void drink(int oz){
        if(ounces >= oz){
            ounces -= oz;
            //ounces = ounces - oz
            System.out.println("Sip sip");
            if(isBitter()){
                System.out.println("Eugh this is bitter!");
            }
        }else{
            ounces = 0;
            System.out.println("Not enough left to take a drink...");
        }
    }

    /**
     * An abstract function in an abstract class that does not have a body. It needs to be overridden by a non-abstract
     * subclass.
     * @return Whether the drink is bitter
     */
    public abstract boolean isBitter();

}
