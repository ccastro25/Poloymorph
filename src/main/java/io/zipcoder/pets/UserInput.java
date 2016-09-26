package io.zipcoder.pets;

import java.util.Scanner;

/**
 * Created by castro on 9/26/16.
 */
public class UserInput {


    private Scanner scanner = new Scanner(System.in);

    private int amountOfPets;

    private String whatKindAndName;

    public String getStringBack() {
        return whatKindAndName;
    }

    public void enterString() {
        whatKindAndName = scanner.next();
    }

    public int getAmountOfPets() {
        return amountOfPets;
    }

    public void setAmountOfPets() {
        this.amountOfPets = scanner.nextInt();
    }
}
