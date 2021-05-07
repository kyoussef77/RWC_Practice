package edu.njit.rwc.topic_04_classes;

import java.security.PublicKey;

/**
 * A class represents a type of object, which can have values and functions within it.
 */
public class Dog {

    /**
     * Static functions can be called without an instance of a class
     * @return The String of what a dog is
     */
    public static String whatAmI(){
        return "Man' best friend";
    }

    /*
    This is variable held by every dog that counts the number of times it barked
     */
    public int timesBarked;

    public Dog(){
        timesBarked = 0; // When a new Dog is created, timesBarked will start at 0
    }

    public void bark(){
        System.out.println("Bark Number " + timesBarked + "!");
        timesBarked ++; // ++ increments the value, meaning it increases it by 1
        //timesbarked = timesbarked + 1
    }

}
