package io.zipcoder.pets;

/**
 * Created by castro on 9/26/16.
 */
public abstract class Pet {

   private String name;


public String speak(){
    return "Im a pet";
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
