import java.util.Scanner;
public class FizzBuzz {

    public static String output_fizz(int maxVal){
        String output_string = "";
        for (int i = 1; i <= maxVal; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                output_string += "FizzBuzz";
            }
            else if (i % 3 == 0)
            {
                output_string += "Fizz";
            }
            else if (i % 5 == 0)
            {
                output_string += "Buzz";
            }
            else
            {
                output_string += String.valueOf(i);
            }
            if (i < maxVal) {
                output_string += ", ";
            }
        }


        return output_string;
    }

    public static void main(String[] args) {
        Scanner user_in = new Scanner(System.in);
        System.out.println("Input Number Here");
        int num_in = user_in.nextInt();
        FizzBuzz obj = new FizzBuzz();
        String answer1 = obj.output_fizz(num_in);
        System.out.println(answer1);

    }
}