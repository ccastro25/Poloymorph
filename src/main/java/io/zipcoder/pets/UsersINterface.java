package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by castro on 9/26/16.
 */
public class UsersINterface {

    ArrayList<Pet> listofPets = new ArrayList<Pet>();
    private UserInput userInput = new UserInput();
    private HashMap<String, String> kindOfPetAndName = new HashMap<String, String>();
    private int HowManyPets;
    private String whatKindOFPet;
    private String whatsItsName;

    Display display = new Display();



    public void promtUser() {
        display.HowmanyPets();
        userInput.setAmountOfPets();
        HowManyPets = userInput.getAmountOfPets();
        loopToHoldNamesAndKInd(HowManyPets);



    }

    public void loopToHoldNamesAndKInd(int howManyPets) {
        for (int i = 0; i < howManyPets; i++) {

            display.whatKind();
            userInput.enterString();
            whatKindOFPet = userInput.getStringBack().toLowerCase();
            display.whatsThePetsName();
            userInput.enterString();
            whatsItsName = userInput.getStringBack();
            kindOfPetAndName.put(whatsItsName, whatKindOFPet);
        }
        checkIfPetExits(kindOfPetAndName);
    }


    public ArrayList<Pet>checkIfPetExits(HashMap<String,String> allPets){

        for (String go: allPets.keySet()){

        switch (allPets.get(go)){
            case "cat":
                Cat cat = new Cat();
                cat.setName(go);
                listofPets.add(cat);
                break;
            case "dog":
                Dog dog = new Dog();
                dog.setName(go);
                listofPets.add(dog);
                break;
            case "goat":
                Goat goat = new Goat();
                goat.setName(go);
                listofPets.add(goat);
                break;
        }


        }

        display.printEveryThingOnTheList(listofPets);
   return  listofPets;  }














}








