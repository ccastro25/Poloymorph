package io.zipcoder.pets;

/**
 * Created by castro on 9/26/16.
 */
public class Dog extends Pet {

    @Override
    public String speak() {
        return "wooo";
    }


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
