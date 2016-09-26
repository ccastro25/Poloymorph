package io.zipcoder.pets;

/**
 * Created by castro on 9/26/16.
 */
public class Cat extends Pet {

    @Override
    public String  speak() {
        return"meow";
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
