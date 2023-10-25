import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    FizzBuzz obj = new FizzBuzz();


    //Multiples of 3


    //Multiples of 5


    //Multiples of 3 and 5

    //No multiples
    @Test
    public void testNoMultiples(){
        //Test using 1 as max value
        String answer1 = FizzBuzz.output_fizz(1);
        assertEquals("1", answer1);

        //Test using 2 as max value
        String answer2 = FizzBuzz.output_fizz(2);
        assertEquals("2", answer2);
    }

}
