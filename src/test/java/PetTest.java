import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by castro on 9/26/16.
 */
public class PetTest {

    Pet pet = new Cat();

    @Test
    public void testSpeak(){

        String expected = "meow";
        String actaul = pet.speak();

        Assert.assertEquals("should return Im a pet", expected,actaul);

    }





}
