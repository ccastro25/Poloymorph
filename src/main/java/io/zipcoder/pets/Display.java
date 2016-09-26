package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by castro on 9/26/16.
 */
public class Display {
 private  String typeOFAnimal;
   private int count=0;

    public void HowmanyPets(){
        System.out.println("How many pets do you have?");
    }

    public void whatKind(){
        System.out.println("What kind of kind pet?");}

        public void whatsThePetsName(){
            System.out.println("Whats your pets Name?");
        }


            public void printEveryThingOnTheList(ArrayList<Pet>kindOfPetAndName){

            for (Pet  go: kindOfPetAndName){

                switch (go.getClass().getName()){

                    case "io.zipcoder.pets.Cat":
                    typeOFAnimal ="Cat";
                        break;
                    case "io.zipcoder.pets.Dog":
                        typeOFAnimal ="Dog";
                        break;
                    case "io.zipcoder.pets.Goat":
                        typeOFAnimal ="Goat";
                        break;
                }


                System.out.println( "You have a " +  typeOFAnimal+" named "+go.getName()+" that says "+ go.speak());
            }

            }
}
