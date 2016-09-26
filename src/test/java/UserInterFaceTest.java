import io.zipcoder.pets.Pet;
import io.zipcoder.pets.UsersINterface;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by castro on 9/26/16.
 */
public class UserInterFaceTest {

    UsersINterface usersINterface = new UsersINterface();
    HashMap<String,String> allPets = new HashMap<String, String>();
    ArrayList<Pet> pets = new ArrayList<Pet>();


    @Test
    public  void  loopToHoldNamesAndKIndTest(){

    usersINterface.loopToHoldNamesAndKInd(3);


    }


    @Test
    public void testCheckIFPetExitst(){
        allPets.put("cat","phil");
        allPets.put("dog","karl");
        allPets.put("snake","jake");

        String expected = "karl";

       pets= usersINterface.checkIfPetExits(allPets);

        Assert.assertEquals("should print same name",expected,pets.get(1).getName());









    }
}
