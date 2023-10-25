import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    FizzBuzz obj = new FizzBuzz();


    //Multiples of 3
    @Test
    public void Multiples3(){
        //Test using 3 as max value
        String answer1 = FizzBuzz.output_fizz(3);
        assertEquals("1, 2, Fizz", answer1);

        //Test using 6 as max value
        String answer2 = FizzBuzz.output_fizz(6);
        assertEquals("1, 2, Fizz, 4, Buzz, Fizz", answer2);

    }

    //Multiples of 5
    @Test
    public void Multiples5(){
        //Test using 5 as max value
        String answer1 = FizzBuzz.output_fizz(5);
        assertEquals("1, 2, Fizz, 4, Buzz", answer1);

        //Test using 10 as max value
        String answer2 = FizzBuzz.output_fizz(10);
        assertEquals("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz", answer2);

    }


    //Multiples of 3 and 5
    @Test
    public void Multiples3and5(){
        //Test using 15 as max value
        String answer1 = FizzBuzz.output_fizz(15);
        assertEquals("1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz", answer1);

    }


    //No multiples
    @Test
    public void testNoMultiples(){
        //Test using 1 as max value
        String answer1 = FizzBuzz.output_fizz(1);
        assertEquals("1", answer1);

        //Test using 2 as max value
        String answer2 = FizzBuzz.output_fizz(2);
        assertEquals("1, 2", answer2);


    }

}
